package com.example.android.amalia_yovadiani_1202154301_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class menu extends AppCompatActivity {

    private final LinkedList<String> makanan = new LinkedList<>();
    private final LinkedList<Integer> harga = new LinkedList<>();
    private final LinkedList<Integer> gambar = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new MenuAdapter(this, makanan, harga, gambar);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            makanan.add("Mie Kuah Keju");
            makanan.add("Mie Kuah Sambal");
            makanan.add("Roti Bakar");
            makanan.add("Es Soda");
            makanan.add("Es Buah");

            harga.add(22000);
            harga.add(18000);
            harga.add(14000);
            harga.add(9000);
            harga.add(12000);

            gambar.add(R.drawable.menu1);
            gambar.add(R.drawable.menu2);
            gambar.add(R.drawable.menu3);
            gambar.add(R.drawable.menu4);
            gambar.add(R.drawable.menu5);
        }
    }
}
