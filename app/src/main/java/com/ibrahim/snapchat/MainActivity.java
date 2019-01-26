package com.ibrahim.snapchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    Button loginBtn;
    Button signupBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.login);
        signupBtn = findViewById(R.id.signup);
    }



    public void login(View view)
    {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void signup(View view)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "Hello Ibrahim", Toast.LENGTH_LONG);
        toast.show();
    }
}
