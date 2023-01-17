package com.example.gp_all;
/*
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gp_all.R;

import java.util.Calendar;
*/

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
    EditText date;
    private static int SPLASH_SCREEN=1000;

    Handler handler1;
    Handler handler2;
    private ObjectAnimator lftToRgt,rgtToLft;
    private ImageView imageView;
    private EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().hide();
        imageView = (ImageView) findViewById(R.id.image_2);
        edittext = (EditText) findViewById(R.id.editText);
        // edittext.setVisibility(View.VISIBLE);
        //animation for imageview
        imageView.animate().translationY(-200F).setDuration(500);
        imageView.animate().scaleY(1F).setDuration(500);
        imageView.animate().scaleX(1F).setDuration(500);
        if (edittext.getVisibility() == View.INVISIBLE) {
            edittext.setVisibility(View.VISIBLE);
            edittext.animate().translationY(-200F).setDuration(500);
            edittext.animate().scaleY(1.5F).setDuration(500);
            edittext.animate().scaleX(1.5F).setDuration(500);
        }


        handler1 = new Handler();
        handler1.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LogoActivity.class);
                startActivity(intent);

                finish();
            }
        }, 3000);

    }

}