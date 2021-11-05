package com.android.spraycafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    public void login() {
        //Ambil nilai inputan
        TextView usernameTV = findViewById(R.id.username_text);
        TextView passwordTV = findViewById(R.id.password_text);

        String username = usernameTV.getText().toString();
        String password = passwordTV.getText().toString();

        Log.d("print", "Username = " + username + " dan Password = " + password);
        Log.d("print", String.valueOf(username.equals("test")));
        Log.d("print", String.valueOf(password.equals("123456")));
        if (username.equals("test") && password.equals("123456")) {
            Log.d("success", "[!] Login Berhasil!");
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
            this.finish();
        }  else {
            Log.d("failed", "[?] Login Gagal!");
            Toast toast = Toast.makeText(getApplicationContext(), "[?] Username / Password kamu salah!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}