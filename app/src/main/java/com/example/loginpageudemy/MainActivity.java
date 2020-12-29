package com.example.loginpageudemy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void submitClickFunc(View view){
        EditText myEmailField=(EditText) findViewById(R.id.myEmailField);
        EditText myPasswordField=(EditText) findViewById(R.id.myPasswordField);
        Log.i("username",myEmailField.getText().toString());
        Log.i("password",myPasswordField.getText().toString());
        Toast.makeText(MainActivity.this, "Hi "+myEmailField.getText().toString(), Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}