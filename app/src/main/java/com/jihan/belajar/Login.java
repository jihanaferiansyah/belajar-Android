package com.jihan.belajar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private EditText username, password;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.Login);

        btnLogin.setOnClickListener(Login.this);
    }

    @Override
    public void onClick(View v) {
            String usernameKey = username.getText().toString();
            String passwordKey = password.getText().toString();

            boolean kosong = false;

            if (TextUtils.isEmpty(usernameKey)) {
                kosong = true;
                username.setError("Cannot be empty");
            }

            if (TextUtils.isEmpty(passwordKey)) {
                kosong = true;
                password.setError("Cannot be empty");
            }

            if(!kosong) {

                if (usernameKey.equals("jigan") && passwordKey.equals("namanama")) {

                    // Login Berhasil
                    Toast.makeText(getApplicationContext(), "Welcome to Profile Student",
                            Toast.LENGTH_SHORT).show();
                    Intent listintent = new Intent(Login.this, Sukses.class);
                    Login.this.startActivity(listintent);
                    finish();

                } else {
                    // Gagal Login
                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                    builder.setMessage("Your username or password is incorrect!")
                            .setNegativeButton("Retry", null).create().show();
                }
            }
        }
    }


