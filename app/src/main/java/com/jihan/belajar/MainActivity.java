package com.jihan.belajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pindah = findViewById(R.id.tag);
        pindah.setOnClickListener((View.OnClickListener) this);

        Button masuk = findViewById(R.id.masuk);
        masuk.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tag:
                Intent kursor = new Intent(MainActivity.this, Activitylink.class);
                startActivity(kursor);
                break;

            case R.id.masuk:
                Intent kursor1 = new Intent(MainActivity.this,Login.class);
                startActivity(kursor1);
                break;

        }
    }

}