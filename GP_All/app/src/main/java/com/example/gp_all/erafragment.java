package com.example.gp_all;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Locale;

public class erafragment extends Fragment {

    public static erafragment getInstance()
    {
        erafragment era=new erafragment();
        return era;
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.era_info,container,false);
        return view;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
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
