package com.example.android.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void printLogs(View view) {

        // capturing values entered into username/password
        EditText editUsername = findViewById(R.id.username);
        EditText editPassword = findViewById(R.id.password);

        // printing username/password to logcat
        Log.i("Username", editUsername.getText().toString());
        Log.i("Password", editPassword.getText().toString());

        Toast.makeText(this, "Signed in as " + editUsername.getText().toString(), Toast.LENGTH_SHORT).show();

        ImageView imageView= findViewById(R.id.sonic1);
        imageView.setImageResource(R.drawable.sonic2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
