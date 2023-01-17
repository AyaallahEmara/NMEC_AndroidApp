package com.example.gp_all;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MuseumFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MuseumFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ImageSlider imageSlider;
    public MuseumFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MuseumFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MuseumFragment newInstance(String param1, String param2) {
        MuseumFragment fragment = new MuseumFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        ((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_museum,container,false);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.MuseumF);
        setHasOptionsMenu(true);
        imageSlider=rootView.findViewById(R.id.imageSlider);
        TextView info = rootView.findViewById(R.id.textView13);
        ArrayList<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.mipmap.m1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.mipmap.m3,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.mipmap.m4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.mipmap.m5,ScaleTypes.FIT));
        imageSlider.setImageList(slideModels,ScaleTypes.FIT);
        FloatingActionButton unfoldMoreBtn =rootView.findViewById(R.id.floatingActionButton_unfoldMoreBtn);
        FloatingActionButton locationBtn=rootView.findViewById(R.id.floatingActionButton_locationBtn);
        FloatingActionButton visitingBtn=rootView.findViewById(R.id.floatingActionButton_vistingTime);
        FloatingActionButton callBtn=rootView.findViewById(R.id.floatingActionButton_callBtn);
        FloatingActionButton mainBtn=rootView.findViewById(R.id.floatingActionButton_mailBtn);

        unfoldMoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if visibile = 0, invisibile = 4
                int get_visibility = locationBtn.getVisibility();
                if(get_visibility==4)
                {
                    locationBtn.setVisibility(View.VISIBLE);
                    visitingBtn.setVisibility(View.VISIBLE);
                    callBtn.setVisibility(View.VISIBLE);
                    mainBtn.setVisibility(View.VISIBLE);
                }
                else if(get_visibility==0)
                {
                    locationBtn.setVisibility(View.INVISIBLE);
                    visitingBtn.setVisibility(View.INVISIBLE);
                    callBtn.setVisibility(View.INVISIBLE);
                    mainBtn.setVisibility(View.INVISIBLE);
                }
            }
        });
        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().equals(getString(R.string.museumInfo))|| (info.getText().equals(getString(R.string.ForVisitingTime))))
                {
                    info.setText(getString(R.string.NMCE_Email));
                }
                else if(info.getText().equals(getString(R.string.NMCE_Email)))
                {
                    info.setText(getString(R.string.museumInfo));
                }
            }
        });

        visitingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().equals(getString(R.string.museumInfo))||(info.getText().equals(getString(R.string.NMCE_Email))))
                {
                    info.setText(getString(R.string.ForVisitingTime));
                }
                else if(info.getText().equals(getString(R.string.ForVisitingTime)))
                {
                    info.setText(getString(R.string.museumInfo));
                }
            }
        });
        locationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), museumMapActivity.class);
                startActivity(intent);
            }
        });

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:02 27412273"));
                startActivity(i);
            }
        });
        return  rootView;
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
}