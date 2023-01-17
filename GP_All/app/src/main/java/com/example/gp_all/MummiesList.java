package com.example.gp_all;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MummiesList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mummies_list);
        getSupportActionBar().hide();
        /*
        ImageButton backbtn = (ImageButton) findViewById(R.id.backfromlistofMummies);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MummiesList.this,HomeFragment.class);
                startActivity(i);
            }
        });*/
        ImageView backfromlistofMummies=(ImageView) findViewById(R.id.backfromlistofMummies);
        ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton imageButton7 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton imageButton8 = (ImageButton) findViewById(R.id.imageButton9);
        ImageButton imageButton9 = (ImageButton) findViewById(R.id.imageButton10);
        ImageButton imageButton10 = (ImageButton) findViewById(R.id.imageButton11);
        ImageButton imageButton11 = (ImageButton) findViewById(R.id.imageButton12);
        ImageButton imageButton12 = (ImageButton) findViewById(R.id.imageButton13);
        ImageButton imageButton13 = (ImageButton) findViewById(R.id.imageButton14);
        ImageButton imageButton14 = (ImageButton) findViewById(R.id.imageButton15);
        ImageButton imageButton15 = (ImageButton) findViewById(R.id.imageButton16);
        ImageButton imageButton16 = (ImageButton) findViewById(R.id.imageButton17);
        ImageButton imageButton17 = (ImageButton) findViewById(R.id.imageButton18);
        ImageButton imageButton18 = (ImageButton) findViewById(R.id.imageButton19);
        ImageButton imageButton19 = (ImageButton) findViewById(R.id.imageButton20);
        ImageButton imageButton20 = (ImageButton) findViewById(R.id.imageButton21);
        TextView textView1 = (TextView) findViewById(R.id.textView3);
        TextView textView2 = (TextView) findViewById(R.id.textView5);
        TextView textView3 = (TextView) findViewById(R.id.textView7);
        TextView textView4 = (TextView) findViewById(R.id.textView9);
        TextView textView5 = (TextView) findViewById(R.id.textView11);
        TextView textView6 = (TextView) findViewById(R.id.textView13);
        TextView textView7 = (TextView) findViewById(R.id.textView15);
        TextView textView8 = (TextView) findViewById(R.id.textView17);
        TextView textView9 = (TextView) findViewById(R.id.textView19);
        TextView textView10 = (TextView) findViewById(R.id.textView21);
        TextView textView11 = (TextView) findViewById(R.id.textView23);
        TextView textView12 = (TextView) findViewById(R.id.textView25);
        TextView textView13 = (TextView) findViewById(R.id.textView27);
        TextView textView14 = (TextView) findViewById(R.id.textView29);
        TextView textView15 = (TextView) findViewById(R.id.textView31);
        TextView textView16 = (TextView) findViewById(R.id.textView33);
        TextView textView17 = (TextView) findViewById(R.id.textView35);
        TextView textView18 = (TextView) findViewById(R.id.textView37);
        TextView textView19 = (TextView) findViewById(R.id.textView39);
        TextView textView20 = (TextView) findViewById(R.id.textView41);
        backfromlistofMummies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(a);
            }
        });
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",1);
                startActivity(a);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",2);
                startActivity(a);
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",3);
                startActivity(a);
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",4);
                startActivity(a);
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",5);
                startActivity(a);
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",6);
                startActivity(a);
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",7);
                startActivity(a);
            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",8);
                startActivity(a);
            }
        });
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",9);
                startActivity(a);
            }
        });
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",10);
                startActivity(a);
            }
        });
        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",11);
                startActivity(a);
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",12);
                startActivity(a);
            }
        });
        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",13);
                startActivity(a);
            }
        });
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",14);
                startActivity(a);
            }
        });
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",15);
                startActivity(a);
            }
        });
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",16);
                startActivity(a);
            }
        });
        imageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",17);
                startActivity(a);
            }
        });
        imageButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",18);
                startActivity(a);
            }
        });
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",19);
                startActivity(a);
            }
        });
        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesRecord.class);
                a.putExtra("key",20);
                startActivity(a);
            }
        });
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",1);
                startActivity(a);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",2);
                startActivity(a);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",3);
                startActivity(a);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",4);
                startActivity(a);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",5);
                startActivity(a);
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",6);
                startActivity(a);
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",7);
                startActivity(a);
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",8);
                startActivity(a);
            }
        });
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",9);
                startActivity(a);
            }
        });
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",10);
                startActivity(a);
            }
        });
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",11);
                startActivity(a);
            }
        });
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",12);
                startActivity(a);
            }
        });
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",13);
                startActivity(a);
            }
        });
        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",14);
                startActivity(a);
            }
        });
        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",15);
                startActivity(a);
            }
        });
        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",16);
                startActivity(a);
            }
        });
        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",17);
                startActivity(a);
            }
        });
        textView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",18);
                startActivity(a);
            }
        });
        textView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",19);
                startActivity(a);
            }
        });
        textView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MummiesInfo.class);
                a.putExtra("key",20);
                startActivity(a);
            }
        });
    }
    /*
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
    */
}