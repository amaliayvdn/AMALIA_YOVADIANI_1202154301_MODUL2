package com.example.android.amalia_yovadiani_1202154301_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickOrder(View view) {
        if (((RadioButton) findViewById(R.id.radioDine)).isChecked()) {
            Intent intent = new Intent(this, dinein.class);
            startActivity(intent);
        } else if (((RadioButton) findViewById(R.id.radioTakeaway)).isChecked()) {
            Intent intent = new Intent(this, takeaway.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Pilih salah satu terlebih dahulu", Toast.LENGTH_SHORT).show();
        }
    }
}
