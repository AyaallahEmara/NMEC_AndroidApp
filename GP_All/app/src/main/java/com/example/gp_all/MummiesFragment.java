package com.example.gp_all;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MummiesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MummiesFragment extends Fragment {
    private static int SPLASH_SCREEN = 3000;
    Animation topAnim, buttomAnim;
    ImageView image;
    TextView logo, slogan;
    SharedPreferences onBoardingScreen;
    /*
        private RecyclerView imageRV;
        private ArrayList<imageModel> imageModelArrayList = new ArrayList<>();
    */
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MummiesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MummiesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MummiesFragment newInstance(String param1, String param2) {
        MummiesFragment fragment = new MummiesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        // setContentView(R.layout.logo);
/*
        View rootView = inflater.inflate(R.layout.fragment_mummies, container, false);
        RecyclerView imageRV = rootView.findViewById(R.id.idRVImage);
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();

        ActionBar actionBar;
        actionBar =  ((AppCompatActivity)getActivity()).getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<font color='#786B54'> The Royal Mummies </font>"));
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#222020"));
        // Set BackgroundDrawable
        actionBar.setBackgroundDrawable(colorDrawable);
///////////////////////////////////////////////////
        imageModelArrayList.add(new imageModel(R.drawable.merneptah, "MERNEPTAH"));
        imageModelArrayList.add(new imageModel(R.drawable.amenhotep1, "AMENHOTEP I"));
        imageModelArrayList.add(new imageModel(R.drawable.ahmosenefertari, "AHMOSENEFERTARI"));
        imageModelArrayList.add(new imageModel(R.drawable.ramesses3, "RAMESSES III"));
        imageModelArrayList.add(new imageModel(R.drawable.ramesses4, "RAMESSES IV"));
        imageModelArrayList.add(new imageModel(R.drawable.seqenenre, "SEQENERE"));
        imageModelArrayList.add(new imageModel(R.drawable.seti1, "SETI I"));
        imageModelArrayList.add(new imageModel(R.drawable.seti2, "SETI II"));
        imageModelArrayList.add(new imageModel(R.drawable.siptah, "SIPTAH"));
        imageModelArrayList.add(new imageModel(R.drawable.thutmose1, "THUTMOSE I"));
        imageModelArrayList.add(new imageModel(R.drawable.thutmose2, "THUTMOSE II"));
        imageModelArrayList.add(new imageModel(R.drawable.thutmose3, "THUTMOSE III"));

        Adapter courseAdapter = new Adapter(this.getContext(), imageModelArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext(), LinearLayoutManager.VERTICAL, false);

        imageRV.setLayoutManager(linearLayoutManager);
        imageRV.setAdapter(courseAdapter);
        return rootView;
  */
        View rootView = inflater.inflate(R.layout.fragment_mummies, container, false);
      //  setHasOptionsMenu(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.MummiesF);
        image = rootView.findViewById(R.id.imageView);

        image.setAnimation(topAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(getContext(), MummiesList.class);
                startActivity(intent);
                getActivity().finish();
            }
        }, SPLASH_SCREEN);
        return rootView;
    }
/*
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
    }*/
}