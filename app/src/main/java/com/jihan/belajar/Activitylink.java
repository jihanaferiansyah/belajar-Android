package com.jihan.belajar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;

public class Activitylink extends AppCompatActivity {
    TextView text7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitylink);
        text7= findViewById(R.id.text7);
        text7.setText(R.string.Youtube);
        text7.setMovementMethod(LinkMovementMethod.getInstance());


    }
}