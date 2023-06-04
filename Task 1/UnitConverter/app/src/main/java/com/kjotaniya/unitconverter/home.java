package com.kjotaniya.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CardView fuel = (CardView) findViewById(R.id.fuel);
        CardView scale = (CardView) findViewById(R.id.scale);
        CardView weight = (CardView) findViewById(R.id.weight);
        CardView temperature = (CardView) findViewById(R.id.temperature);

// icon mukiya aena name ma je word capital leter ma 6 aene small kari nakh atle thay jase

        fuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this , fuel.class);
                startActivity(intent);

            }
        });
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this , weight.class);
                startActivity(intent);

            }
        });
        temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this , temperature.class);
                startActivity(intent);

            }
        });
        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this , scale.class);
                startActivity(intent);

            }
        });
    }
}