
package com.example.gp_all;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


import java.util.Locale;

import android.content.res.Configuration;
import android.content.res.Resources;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_home_main#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_home_main extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    static fragment_home_main INSTANCE;
    String language="";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_home_main() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_home_main, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.HomeF);

        CardView all_Eras = (CardView) rootView.findViewById(R.id.cardView1);
        CardView detect_Exhibit = (CardView) rootView.findViewById(R.id.cardView);

        setHasOptionsMenu(true);

        all_Eras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent a = new Intent(getContext(), ExhibitsOfEra2Activity.class);
                startActivity(a);
            }
        });

        detect_Exhibit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent b = new Intent(getContext(), detect_exhibit.class);
                startActivity(b);
            }
        });
        return rootView;
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
              //  language="ar";
                return true;
            case R.id.enLanguage:
                String enLang = "en";
                setLocal(enLang);
             //   language="en";
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
        //to refresh
        getActivity().recreate();
    }
}