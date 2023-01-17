package com.example.gp_all;;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.gp_all.R;

public class Payment_Method extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent b = new Intent(getApplicationContext(), HomeFragment.class);
                startActivity(b);
                return true;
            case R.id.item2:
                Intent a = new Intent(getApplicationContext(), HomeFragment.class);
                startActivity(a);
                return true;
            case R.id.item3:
                Intent c = new Intent(getApplicationContext(), Book_Ticket.class);
                startActivity(c);
                return true;
            case R.id.item4:
                Intent d = new Intent(getApplicationContext(), MuseumFragment.class);
                startActivity(d);
                return true;
           /* case R.id.item5:
                Intent e = new Intent(getApplicationContext(), Vistingtimes.class);
                startActivity(e);
                return true;
*/
            default:
                return super.onOptionsItemSelected(item);
        }}
}