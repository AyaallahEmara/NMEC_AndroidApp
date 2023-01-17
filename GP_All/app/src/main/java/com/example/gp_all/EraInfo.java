package com.example.gp_all;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class EraInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.era_info);
        getSupportActionBar().hide();
        TextView eraName = (TextView) findViewById(R.id.title);
        ImageView eraImage = (ImageView) findViewById(R.id.eraImage);
        TextView eraInfo = (TextView) findViewById(R.id.info);


        String name ;
        int img ;
        String info ;

        final int x = getIntent().getExtras().getInt("eras");
        switch (x)
        { // shift eras & write info
            case 1:
                name = getString(R.string.era1);
                img = R.mipmap.e1;
                info = getString(R.string.infoEra1);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 2:
                name = getString(R.string.era2);
                img = R.mipmap.e2;
                info = getString(R.string.infoEra2);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 3:
                name = getString(R.string.era3);
                img = R.mipmap.e3;
                info = getString(R.string.infoEra3);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 4:
                name = getString(R.string.era4);
                img = R.mipmap.e4;
                info = getString(R.string.infoEra4);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 5:
                name = getString(R.string.era5);
                img = R.mipmap.e5;
                info = getString(R.string.infoEra5);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 6:
                name = getString(R.string.era6);
                img = R.mipmap.e6;
                info = getString(R.string.infoEra6);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 7:
                name = getString(R.string.era7);
                img = R.mipmap.e7;
                info = getString(R.string.infoEra7);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 8:
                name = getString(R.string.era8);
                img = R.mipmap.e8;
                info = getString(R.string.infoEra8);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 9:
                name = getString(R.string.era9);
                img = R.mipmap.e9;
                info = getString(R.string.infoEra9);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 10:
                name = getString(R.string.era10);
                img = R.mipmap.e10;
                info = getString(R.string.infoEra10);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 11:
                name = getString(R.string.era11);
                img = R.mipmap.e11;
                info = getString(R.string.infoEra11);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 12:
                name = getString(R.string.era12);
                img = R.mipmap.e12;
                info = getString(R.string.infoEra12);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 13:
                name = getString(R.string.era13);
                img = R.mipmap.e13;
                info = getString(R.string.infoEra13);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 14:
                name = getString(R.string.era14);
                img = R.mipmap.e14;
                info = getString(R.string.infoEra14);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 15:
                name = getString(R.string.era15);
                img = R.mipmap.e15;
                info = getString(R.string.infoEra15);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 16:
                name = getString(R.string.era16);
                img = R.mipmap.e16;
                info = getString(R.string.infoEra16);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 17:
                name = getString(R.string.era17);
                img = R.mipmap.e17;
                info = getString(R.string.infoEra17);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 18:
                name = getString(R.string.era18);
                img = R.mipmap.e18;
                info = getString(R.string.infoEra18);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 19:
                name = getString(R.string.era19);
                img = R.mipmap.e19;
                info = getString(R.string.infoEra19);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 20:
                name = getString(R.string.era20);
                img = R.mipmap.e20;
                info = getString(R.string.infoEra20);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 21:
                name = getString(R.string.era21);
                img = R.mipmap.e21;
                info = getString(R.string.infoEra21);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 22:
                name = getString(R.string.era22);
                img = R.mipmap.e22;
                info = getString(R.string.infoEra22);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            case 23:
                name = getString(R.string.era23);
                img = R.mipmap.e23;
                info = getString(R.string.infoEra23);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
                break;
            default:
                name = getString(R.string.era1);
                img = R.mipmap.e1;
                info = getString(R.string.infoEra1);
                eraName.setText(name);
                eraImage.setImageResource(img);
                eraInfo.setText(info);
        }
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
    }*/
}