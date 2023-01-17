package com.example.gp_all;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

public class exhibits extends Fragment {
    public static exhibits getInstance()
    {
        exhibits ex=new exhibits();
        return ex;
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.era_exhibit,container,false);
        int ids[] = new int[8];
        ids[0] = R.mipmap.download;
        ids[1] = R.mipmap.images1;
        ids[2] = R.mipmap.c7;
        ids[3] = R.mipmap.images;
        ids[4] = R.mipmap.images1;
        ids[5] = R.mipmap.images2;
        ids[6] = R.mipmap.images3;
        ids[7] = R.mipmap.images4;

        LinearLayout y = rootView.findViewById(R.id.layout10);
        ImageView[] x = new ImageView[8];
        for (int i = 0; i < 8; i++) {
            x[i] = new ImageView(getContext());
            x[i].setBackgroundResource(ids[i]);
            x[i].setLeftTopRightBottom(20,0,20,5);
            x[i].setMaxHeight(300);
            final int finalI2 = i;
            x[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent a=new Intent(getContext(),Book_Ticket.class);
                    a.putExtra("r",finalI2+54);
                    startActivity(a);
                }
            });
            y.addView(x[i]);
        }
        return rootView;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        MenuInflater inflater1= getActivity().getMenuInflater();
        inflater1.inflate(R.menu.language_menu,menu);
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
