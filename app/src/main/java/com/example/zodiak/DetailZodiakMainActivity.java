package com.example.zodiak;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailZodiakMainActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_zodiak_main);

        ImageView imgZdk = findViewById(R.id.imgzodiak);
        TextView tvZdkName = findViewById(R.id.tvzodiakName);
        TextView tvZdkDetail = findViewById(R.id.tvzodiakDetail);

        Zodiak zdk = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(zdk != null){
            Glide.with(this)
                    .load(zdk.getPhoto())
                    .into(imgZdk);
            tvZdkName.setText(zdk.getName());
            tvZdkDetail.setText(zdk.getDetail());
        }
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Zodiak");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}