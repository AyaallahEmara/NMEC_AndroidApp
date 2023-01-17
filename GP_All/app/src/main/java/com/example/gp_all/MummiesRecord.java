package com.example.gp_all;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MummiesRecord extends AppCompatActivity {
    MediaPlayer mPlayer;

    @Override
    protected void onStop() {
        super.onStop();
        if(mPlayer!=null)
        {
            mPlayer.release();
            mPlayer=null;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mummies_record);
        int [] music = new int[21];
        //getSupportActionBar().hide();
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));
        final int x = getIntent().getExtras().getInt("key");
        int x1 =x;
        String [] names = new String[21];
        String y = Locale.getDefault().getLanguage();
        //Toast.makeText(getApplicationContext(), y, Toast.LENGTH_SHORT).show();
        //Toast.makeText(getApplicationContext(), y, Toast.LENGTH_SHORT).show();
        if(y.equals("ar"))
        {
            music[0]=R.raw.mummyar1;
            music[1]=R.raw.mummyar1;
            music[2]=R.raw.mummyar2;
            music[3]=R.raw.mummyar3;
            music[4]=R.raw.mummyar4;
            music[5]=R.raw.mummyar5;
            music[6]=R.raw.mummyar6;
            music[7]=R.raw.mummyar7;
            music[8]=R.raw.mummyar8;
            music[9]=R.raw.mummyar9;
            music[10]=R.raw.mummyar10;
            music[11]=R.raw.mummyar11;
            music[12]=R.raw.mummyar12;
            music[13]=R.raw.mummyar13;
            music[14]=R.raw.mummyar14;
            music[15]=R.raw.mummyar15;
            music[16]=R.raw.mummyar16;
            music[17]=R.raw.mummyar17;
            music[18]=R.raw.mummyar18;
            music[19]=R.raw.mummyar19;
            music[20]=R.raw.mummyar20;
        }
        else if(y.equals("en"))
        {
            music[0]=R.raw.rec1;
            music[1]=R.raw.rec1;
            music[2]=R.raw.rec2;
            music[3]=R.raw.rec3;
            music[4]=R.raw.rec4;
            music[5]=R.raw.rec5;
            music[6]=R.raw.rec6;
            music[7]=R.raw.rec7;
            music[8]=R.raw.rec8;
            music[9]=R.raw.rec9;
            music[10]=R.raw.rec10;
            music[11]=R.raw.rec11;
            music[12]=R.raw.rec12;
            music[13]=R.raw.rec13;
            music[14]=R.raw.rec14;
            music[15]=R.raw.rec15;
            music[16]=R.raw.rec16;
            music[17]=R.raw.rec17;
            music[18]=R.raw.rec18;
            music[19]=R.raw.rec19;
            music[20]=R.raw.rec20;
        }
        names[0] = getString(R.string.Seqenen_reTaaII);
        names[1] = getString(R.string.Seqenen_reTaaII);
        names[2]= getString(R.string.Ahmose_Nefertari);
        names[3]= getString(R.string.Amenhotep_I);
        names[4]= getString(R.string.Thutmose_I);
        names[5]= getString(R.string.Thutmose_II);
        names[6]= getString(R.string.Hatshepsutt);
        names[7]= getString(R.string.Thutmose_III);
        names[8]= getString(R.string.Amenhotep_II);
        names[9]= getString(R.string.Thutmose_IV);
        names[10]=getString(R.string.Thutmose_III);
        names[11]=getString(R.string.Seti_I);
        names[12]=getString(R.string.Ramses_II);
        names[13]=getString(R.string.Merenptah_Baenre);
        names[14]=getString(R.string.Seti_II);
        names[15]=getString(R.string.Siptah_Akhenre);
        names[16]=getString(R.string.Ramses_III);
        names[17]=getString(R.string.Ramses_IV);
        names[18]=getString(R.string.Ramses_V);
        names[19]=getString(R.string.Ramses_VI);
        names[20]=getString(R.string.Ramses_IX);

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


        ImageView imageView = (ImageView) findViewById(R.id.imageView23);
        TextView textView = (TextView) findViewById(R.id.textView45);
        imageView.setBackgroundResource(images[x1]);
        textView.setText(names[x1]);
        ImageButton previou = (ImageButton) findViewById(R.id.imageButton24);
        ImageButton play = (ImageButton) findViewById(R.id.imageButton23);
        ImageButton pause = (ImageButton) findViewById(R.id.imageButton28);
        ImageButton next = (ImageButton) findViewById(R.id.imageButton25);
        int id=R.drawable.play_audio_foreground;
        int id1=R.drawable.pause_audio_foreground;
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mPlayer!=null)
                    mPlayer.pause();
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mPlayer==null)
                {
                    mPlayer = MediaPlayer.create(getApplicationContext(), music[x1]);
                }

                mPlayer.start();

            }
        });
        ImageButton adjust = (ImageButton) findViewById(R.id.imageButton27);
        adjust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MummiesList.class);
                startActivity(intent);
            }
        });
        previou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x1==1)
                {
                    imageView.setBackgroundResource(images[x1]);
                    textView.setText(names[x1]);
                    if(mPlayer!=null)
                    {
                        if(mPlayer!=null)
                            mPlayer.pause();
                    }
                }
                else
                {
                    imageView.setBackgroundResource(images[x1-1]);
                    textView.setText(names[x1-1]);
                    if(mPlayer!=null)
                    {
                        mPlayer.release();
                        mPlayer=null;
                        mPlayer = MediaPlayer.create(getApplicationContext(), music[x1-1]);
                    }
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x1==20)
                {
                    imageView.setBackgroundResource(images[x1]);
                    textView.setText(names[x1]);
                    if(mPlayer!=null)
                        mPlayer.pause();
                }
                else
                {
                    imageView.setBackgroundResource(images[x1+1]);
                    textView.setText(names[x1+1]);
                    if(mPlayer!=null)
                    {
                        mPlayer.release();
                        mPlayer=null;
                        mPlayer = MediaPlayer.create(getApplicationContext(), music[x1+1]);
                    }
                }
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.language_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.arLanguage:
                String arLang = "ar";
                setLocal(arLang);
                return true;
            case R.id.enLanguage:
                String enLang = "en";
                setLocal(enLang);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void setLocal(String language)
    {
        Locale locale =new Locale(language);
        Locale.setDefault(locale);
        Resources resources = getResources();
        Configuration config =resources.getConfiguration();
        config.setLocale(locale);
        resources.updateConfiguration(config,resources.getDisplayMetrics());
        //to refresh
        recreate();
    }

}