package com.example.zodiak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvZodiak;
    private ArrayList<Zodiak> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvZodiak = findViewById(R.id.rv_zodiak);
        rvZodiak.setHasFixedSize(true);

        list.addAll(ZodiakData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvZodiak.setLayoutManager(new LinearLayoutManager(this));
        ListZodiakAdapter listClubAdapter = new ListZodiakAdapter(list);
        rvZodiak.setAdapter(listClubAdapter);

        listClubAdapter.setOnItemClickCallback(new ListZodiakAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Zodiak zdk) {
                Intent moveIntent = new Intent(MainActivity.this, DetailZodiakMainActivity.class);
                moveIntent.putExtra(DetailZodiakMainActivity.ITEM_EXTRA, zdk);
                startActivity(moveIntent);
            }
        });
    }

}