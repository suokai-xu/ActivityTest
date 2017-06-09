package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button but=  (Button) findViewById(R.id.button_2);
        but.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                Toast.makeText(FirstActivity.this,"You Hello --- you",Toast.LENGTH_SHORT).show();
//                finish();

                Intent intent = new Intent(SecondActivity.this,FirstActivity.class);

                startActivity(intent);
            }
        });
    }
}
