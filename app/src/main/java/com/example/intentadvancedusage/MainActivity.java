package com.example.intentadvancedusage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call(View view){
        Intent intent =  new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+3512116));
        startActivity(intent);
    }

    public void map(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:24.801811687113517, 120.97157756882315"));
        startActivity(intent);
    }

    public void web(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(intent);
    }
}