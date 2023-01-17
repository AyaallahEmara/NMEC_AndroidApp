package com.example.gp_all;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LogoActivity extends AppCompatActivity {
    private TextView TextView1;
    private TextView TextView2;
    private TextView TextView3;
    private ImageView imageView;
    Handler handler1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        getSupportActionBar().hide();

        TextView1 = (TextView) findViewById(R.id.editText1);
        TextView2 = (TextView) findViewById(R.id.editText2);
        TextView3 = (TextView) findViewById(R.id.editText3);
        imageView = (ImageView) findViewById(R.id.imgview);


        if (TextView1.getVisibility() == View.INVISIBLE) {
            TextView1.setVisibility(View.VISIBLE);
            TextView1.animate().translationY(300F).setDuration(1000);
            TextView1.animate().scaleY(1F).setDuration(500);
            TextView1.animate().scaleX(1F).setDuration(500);
        }
        if (TextView2.getVisibility() == View.INVISIBLE && TextView1.getVisibility() == View.VISIBLE) {
            TextView2.setVisibility(View.VISIBLE);
            TextView2.animate().translationY(-20F).setDuration(2000);
            TextView2.animate().scaleY(1F).setDuration(500);
            TextView2.animate().scaleX(1F).setDuration(500);
        }
        if (TextView3.getVisibility() == View.INVISIBLE && TextView2.getVisibility() == View.VISIBLE) {
            TextView3.setVisibility(View.VISIBLE);
            TextView3.animate().translationY(-375F).setDuration(3000);
            TextView3.animate().scaleY(1F).setDuration(500);
            TextView3.animate().scaleX(1F).setDuration(500);
        }
        handler1 = new Handler();
        handler1.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LogoActivity.this, MainActivity2.class);
                startActivity(intent);

                finish();
            }
        }, 3000);
    }
}
