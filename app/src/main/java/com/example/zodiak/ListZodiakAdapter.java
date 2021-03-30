package com.example.zodiak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListZodiakAdapter extends RecyclerView.Adapter<ListZodiakAdapter.ListViewHolder> {
    private ArrayList<Zodiak> listZdk;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListZodiakAdapter(ArrayList<Zodiak>list) {
        this.listZdk = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_zodiak, parent, false);
         return new ListViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Zodiak zodiak = listZdk.get(position);
        Glide.with(holder.itemView.getContext())
                .load(zodiak.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(zodiak.getName());
        holder.tvDetail.setText(zodiak.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View itemview) {
                onItemClickCallback.onItemClicked(listZdk.get(holder.getAdapterPosition()));
            }
        });


    }

    @Override
    public int getItemCount() {
        return listZdk.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        TextView tvDetail;

        ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_zdk);
            tvName = itemview.findViewById(R.id.tv_item_name);
            tvDetail = itemview.findViewById(R.id.tv_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Zodiak data);
    }
}
