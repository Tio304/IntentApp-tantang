package com.example.intentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_Keep_Health);
        btnMoveActivity.setOnClickListener(this);
        Button btnMoveActivity2 = findViewById(R.id.btn_wash_hands);
        btnMoveActivity2.setOnClickListener(this);
        Button btnMoveActivity3 = findViewById(R.id.btn_Use_Mask);
        btnMoveActivity3.setOnClickListener(this);
        Button btnMoveActivity4 = findViewById(R.id.btn_Pola_Hidup);
        btnMoveActivity4.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            case R.id.btn_Keep_Health:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_wash_hands:
                Intent moveIntent2 = new Intent(MainActivity.this, MoveActivity2.class);
                startActivity(moveIntent2);
                break;
            case R.id.btn_Use_Mask:
                Intent moveIntent3 = new Intent(MainActivity.this, MoveActivity3.class);
                startActivity(moveIntent3);
                break;
            case R.id.btn_Pola_Hidup:
                Intent moveIntent4 = new Intent(MainActivity.this, MoveActivity4.class);
                startActivity(moveIntent4);
                break;

        }
    }
}
