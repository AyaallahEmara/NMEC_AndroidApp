package com.example.gp_all.ui.home;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.gp_all.EraInfo;
import com.example.gp_all.R;
import com.example.gp_all.databinding.FragmentHomeBinding;

import java.util.Locale;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
       // ((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.textHome;
       // homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        CardView c1 = (CardView) root.findViewById(R.id.cardViewera1);
        CardView c2 = (CardView) root.findViewById(R.id.cardViewera2);
        CardView c3 = (CardView) root.findViewById(R.id.cardViewera3);
        CardView c4 = (CardView) root.findViewById(R.id.cardViewera4);
        CardView c5 = (CardView) root.findViewById(R.id.cardViewera5);
        CardView c6 = (CardView) root.findViewById(R.id.cardViewera6);
        CardView c7 = (CardView) root.findViewById(R.id.cardViewera7);
        CardView c8 = (CardView) root.findViewById(R.id.cardViewera8);
        CardView c9 = (CardView) root.findViewById(R.id.cardViewera9);
        CardView c10 = (CardView) root.findViewById(R.id.cardViewera10);
        CardView c11 = (CardView) root.findViewById(R.id.cardViewera11);
        CardView c12 = (CardView) root.findViewById(R.id.cardViewera12);
        CardView c13 = (CardView) root.findViewById(R.id.cardViewera13);
        CardView c14 = (CardView) root.findViewById(R.id.cardViewera14);
        CardView c15 = (CardView) root.findViewById(R.id.cardViewera15);
        CardView c16 = (CardView) root.findViewById(R.id.cardViewera16);
        CardView c17 = (CardView) root.findViewById(R.id.cardViewera17);
        CardView c18 = (CardView) root.findViewById(R.id.cardViewera18);
        CardView c19 = (CardView) root.findViewById(R.id.cardViewera19);
        CardView c20 = (CardView) root.findViewById(R.id.cardViewera20);
        CardView c21 = (CardView) root.findViewById(R.id.cardViewera21);
        CardView c22 = (CardView) root.findViewById(R.id.cardViewera22);
        CardView c23 = (CardView) root.findViewById(R.id.cardViewera23);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(), EraInfo.class);
                a.putExtra("eras",1);
                startActivity(a);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",2);
                startActivity(a);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",3);
                startActivity(a);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",4);
                startActivity(a);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",5);
                startActivity(a);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",6);
                startActivity(a);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",7);
                startActivity(a);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",8);
                startActivity(a);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",9);
                startActivity(a);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",10);
                startActivity(a);
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",11);
                startActivity(a);
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",12);
                startActivity(a);
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",13);
                startActivity(a);
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",14);
                startActivity(a);
            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",15);
                startActivity(a);
            }
        });
        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",16);
                startActivity(a);
            }
        });
        c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",17);
                startActivity(a);
            }
        });
        c18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",18);
                startActivity(a);
            }
        });
        c19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",19);
                startActivity(a);
            }
        });
        c20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",20);
                startActivity(a);
            }
        });
        c21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",21);
                startActivity(a);
            }
        });
        c22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",22);
                startActivity(a);
            }
        });
        c23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getContext(),EraInfo.class);
                a.putExtra("eras",23);
                startActivity(a);
            }
        });

        return root;
    }
    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        MenuInflater inflater1= getActivity().getMenuInflater();
        inflater1.inflate(R.menu.language_menu,menu);
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
        Resources resources =getActivity().getResources();
        Configuration config =resources.getConfiguration();
        config.setLocale(locale);
        resources.updateConfiguration(config,resources.getDisplayMetrics());
        getActivity().recreate();
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}