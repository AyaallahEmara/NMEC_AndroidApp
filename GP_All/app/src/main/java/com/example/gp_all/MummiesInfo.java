package com.example.gp_all;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MummiesInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mummies_info);
        getSupportActionBar().hide();
        ImageButton imageButton=(ImageButton) findViewById(R.id.imageButton);
        final int x = getIntent().getExtras().getInt("key");
        int x1 =x;
        int [] images = new int[21];
        images[1]=R.mipmap.img1;
        images[2]=R.mipmap.img2;
        images[3]=R.mipmap.img32;
        images[4]=R.mipmap.img4;
        images[5]=R.mipmap.img5;
        images[6]=R.mipmap.img6;
        images[7]=R.mipmap.img7;
        images[8]=R.mipmap.img8;
        images[9]=R.mipmap.img9;
        images[10]=R.mipmap.img10;
        images[11]=R.mipmap.img11;
        images[12]=R.mipmap.img12;
        images[13]=R.mipmap.img13;
        images[14]=R.mipmap.img14;
        images[15]=R.mipmap.img15;
        images[16]=R.mipmap.img16;
        images[17]=R.mipmap.img17;
        images[18]=R.mipmap.img18;
        images[19]=R.mipmap.img19;
        images[20]=R.mipmap.img20;
        images[0]=R.mipmap.img19;
        String [] text_en=new String[21];

        text_en[0] = getString(R.string.SeqenenreTaaII);
        text_en[1] = getString(R.string.SeqenenreTaaII);
        text_en[2]= getString(R.string.AhmoseNefertari);
        text_en[3]= getString(R.string.AmenhotepI);
        text_en[4]= getString(R.string.ThutmoseI);
        text_en[5]= getString(R.string.ThutmoseII);
        text_en[6]= getString(R.string.Hatshepsut);
        text_en[7]= getString(R.string.ThutmoseIII);
        text_en[8]= getString(R.string.AmenhotepII);
        text_en[9]= getString(R.string.ThutmoseIV);
        text_en[10]=getString(R.string.ThutmoseIII);
        text_en[11]=getString(R.string.SetiI);
        text_en[12]=getString(R.string.RamsesII);
        text_en[13]=getString(R.string.Merenptah);
        text_en[14]=getString(R.string.SetiII);
        text_en[15]=getString(R.string.Siptah);
        text_en[16]=getString(R.string.RamsesIII);
        text_en[17]=getString(R.string.RamsesIV);
        text_en[18]=getString(R.string.RamsesV);
        text_en[19]=getString(R.string.RamsesVI);
        text_en[20]=getString(R.string.RamsesIX);
        ImageView imageView = (ImageView) findViewById(R.id.imageView4);
        EditText textView = (EditText) findViewById(R.id.editTextTextMultiLine2);
        imageView.setBackgroundResource(images[x1]);
        textView.setText(text_en[x1]);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MummiesList.class);
                startActivity(intent);
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