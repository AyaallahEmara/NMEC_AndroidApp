package com.example.gp_all;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class GenQRActivity extends AppCompatActivity {

    ImageView imageQR;
    Bitmap bitmap;
    private static final String TAG = "QRActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gen_qractivity);
        getSupportActionBar().hide();
        imageQR = findViewById(R.id.imageQR);

        String card=getIntent().getExtras().getString("Card_Number");
        //       String name = bundle.getString("Card_Number");
//        String address = bundle.getString("postal");
//        String phone = bundle.getString("phone");
//        String email = bundle.getString("email");
//        String notes = bundle.getString("notes");
//        String organization = bundle.getString("company");
//        String url = bundle.getString("data");
//        Toast.makeText(this, name + address + phone, Toast.LENGTH_SHORT).show();


        //setting the data as null and bundle of data from the previous activity because of the type of the QR
        QRGEncoder qrgEncoder = new QRGEncoder(card,  QRGContents.Type.CONTACT, 500);
        try {
            // Getting QR-Code as Bitmap
            bitmap = qrgEncoder.getBitmap();
            // Setting Bitmap to ImageView
            imageQR.setImageBitmap(bitmap);
        } catch (Exception e) {
            Log.v(TAG, e.toString());
        }

    }
}