package com.isidrojacinto.xcube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ace);
    }
    public void relax(View view){
        Intent intent = new Intent(this, relax.class);
        startActivity(intent);

    }
}
