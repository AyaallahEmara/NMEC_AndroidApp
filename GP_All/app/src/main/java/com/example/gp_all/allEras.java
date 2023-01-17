package com.example.gp_all;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class allEras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alleras);
        CardView c1 = (CardView) findViewById(R.id.cardViewera1);
        CardView c2 = (CardView) findViewById(R.id.cardViewera2);
        CardView c3 = (CardView) findViewById(R.id.cardViewera3);
        CardView c4 = (CardView) findViewById(R.id.cardViewera4);
        CardView c5 = (CardView) findViewById(R.id.cardViewera5);
        CardView c6 = (CardView) findViewById(R.id.cardViewera6);
        CardView c7 = (CardView) findViewById(R.id.cardViewera7);
        CardView c8 = (CardView) findViewById(R.id.cardViewera8);
        CardView c9 = (CardView) findViewById(R.id.cardViewera9);
        CardView c10 = (CardView) findViewById(R.id.cardViewera10);
        CardView c11 = (CardView) findViewById(R.id.cardViewera11);
        CardView c12 = (CardView) findViewById(R.id.cardViewera12);
        CardView c13 = (CardView) findViewById(R.id.cardViewera13);
        CardView c14 = (CardView) findViewById(R.id.cardViewera14);
        CardView c15 = (CardView) findViewById(R.id.cardViewera15);
        CardView c16 = (CardView) findViewById(R.id.cardViewera16);
        CardView c17 = (CardView) findViewById(R.id.cardViewera17);
        CardView c18 = (CardView) findViewById(R.id.cardViewera18);
        CardView c19 = (CardView) findViewById(R.id.cardViewera19);
        CardView c20 = (CardView) findViewById(R.id.cardViewera20);
        CardView c21 = (CardView) findViewById(R.id.cardViewera21);
        CardView c22 = (CardView) findViewById(R.id.cardViewera22);
        CardView c23 = (CardView) findViewById(R.id.cardViewera23);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",1);
                startActivity(a);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",2);
                startActivity(a);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",3);
                startActivity(a);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",4);
                startActivity(a);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",5);
                startActivity(a);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",6);
                startActivity(a);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",7);
                startActivity(a);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",8);
                startActivity(a);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",9);
                startActivity(a);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",10);
                startActivity(a);
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",11);
                startActivity(a);
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",12);
                startActivity(a);
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",13);
                startActivity(a);
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",14);
                startActivity(a);
            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",15);
                startActivity(a);
            }
        });
        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",16);
                startActivity(a);
            }
        });
        c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",17);
                startActivity(a);
            }
        });
        c18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",18);
                startActivity(a);
            }
        });
        c19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",19);
                startActivity(a);
            }
        });
        c20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",20);
                startActivity(a);
            }
        });
        c21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",21);
                startActivity(a);
            }
        });
        c22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",22);
                startActivity(a);
            }
        });
        c23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),EraInfo.class);
                a.putExtra("eras",23);
                startActivity(a);
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater1= this.getMenuInflater();
        inflater1.inflate(R.menu.language_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        HomeFragment f =new HomeFragment();
        switch (item.getItemId()) {
            case R.id.arLanguage:
                String arLang = "ar";
                f.setLocal(arLang);
                return true;
            case R.id.enLanguage:
                String enLang = "en";
                f.setLocal(enLang);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}