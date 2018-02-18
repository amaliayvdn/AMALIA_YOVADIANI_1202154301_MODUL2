package com.example.android.amalia_yovadiani_1202154301_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class detailmenu extends AppCompatActivity {

    TextView a , b;
    ImageView c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailmenu);
        Intent intent = getIntent();
        String food = intent.getStringExtra("Makanan");
        Integer price = intent.getIntExtra("Harga",0);
        Integer photo = intent.getIntExtra("Gambar",0);

        Log.d("getIntExtra", ""+price+photo);

        a = (TextView)findViewById(R.id.detailMakanan);
        b = (TextView)findViewById(R.id.detailHarga);
        c = (ImageView)findViewById(R.id.detailFoto);

        a.setText(food);
        b.setText("Rp. "+price);
        c.setImageResource(photo);
    }
}

