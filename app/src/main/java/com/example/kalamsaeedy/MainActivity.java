package com.example.kalamsaeedy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button x = (Button) findViewById(R.id.btn_1);
    }

    public void gotoavtivity2(View view) {

        Intent i = new Intent(this,Activity2.class);
        startActivity(i);
    }
    }



