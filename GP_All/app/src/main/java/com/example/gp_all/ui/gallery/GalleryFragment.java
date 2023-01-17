package com.example.gp_all.ui.gallery;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.gp_all.Exhibit_info;
import com.example.gp_all.R;
import com.example.gp_all.databinding.FragmentGalleryBinding;
import com.example.gp_all.Exhibit_info;
import com.example.gp_all.MummiesRecord;
import com.example.gp_all.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);
       // ((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));
        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
       // ((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

        ImageView ex1=(ImageView) binding.imageView25;
        ImageView ex2=(ImageView) binding.imageView26;
        ImageView ex3=(ImageView) binding.imageView28;
        ImageView ex4=(ImageView) binding.imageView29;
        ImageView ex5=(ImageView) binding.imageView77;
        ImageView ex6=(ImageView) binding.imageView78;
        ImageView ex7=(ImageView) binding.imageView79;
        ImageView ex8=(ImageView) binding.imageView80;
        ImageView ex9=(ImageView) binding.imageView30;
        ImageView ex10=(ImageView) binding.imageView58;
        ImageView ex11=(ImageView) binding.imageView59;
        ImageView ex12=(ImageView) binding.imageView60;
        ImageView ex13=(ImageView) binding.imageView61;
        ImageView ex14=(ImageView) binding.imageView62;
        ImageView ex15=(ImageView) binding.imageView63;
        ImageView ex16=(ImageView) binding.imageView64;
        ImageView ex17=(ImageView) binding.imageView69;
        ImageView ex18=(ImageView) binding.imageView70;
        ImageView ex19=(ImageView) binding.imageView71;
        ImageView ex20=(ImageView) binding.imageView72;
        ImageView ex21=(ImageView) binding.imageView81;
        ImageView ex22=(ImageView) binding.imageView82;
        ImageView ex23=(ImageView) binding.imageView83;
        ImageView ex24=(ImageView) binding.imageView84;
        ImageView ex25=(ImageView) binding.imageView73;
        ImageView ex26=(ImageView) binding.imageView74;
        ImageView ex27=(ImageView) binding.imageView75;
        ImageView ex28=(ImageView) binding.imageView76;

        ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",1);
                Toast.makeText(getContext(), "Hapi_the_Scribe", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",2);
                Toast.makeText(getContext(), "The_Preist_Psamtik_seneb", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",3);
                Toast.makeText(getContext(), "Pen_Hery_The_Surveyor", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",4);
                Toast.makeText(getContext(), "King_Thutmose_III", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",5);
                Toast.makeText(getContext(), "king_Akhenaten", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",6);
                Toast.makeText(getContext(), "Khonsu", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",7);
                Toast.makeText(getContext(), "God_Nilus", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",8);
                Toast.makeText(getContext(), "Merneptah_and_The_God_of_Death", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",9);
                Toast.makeText(getContext(), "King_Fouad_I", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",10);
                Toast.makeText(getContext(), "The_Vizier_Paser", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",11);
                Toast.makeText(getContext(), "Sphinx_of_The_King_Amenemhat_III", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",12);
                Toast.makeText(getContext(), "Amun_Ra_Kingof_TheGods", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",13);
                Toast.makeText(getContext(), "Senenmut", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",14);
                Toast.makeText(getContext(), "Pen_Menkh_TheGovernerOf_Dendara", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",15);
                Toast.makeText(getContext(), "Captives_statuettes", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",16);
                Toast.makeText(getContext(), "King_Fouad_I", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",17);
                Toast.makeText(getContext(), "Statue_of_the_sphinx", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",18);
                Toast.makeText(getContext(), "Chair_from_the tomb_of_Queen_Hetepheres", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",19);
                Toast.makeText(getContext(), "AQueen_in_the_form_of_the_Sphinx", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",20);
                Toast.makeText(getContext(), "The_Kiswa_Covering_of_holy_Kaaba", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",21);
                Toast.makeText(getContext(), "Muhammad_Ali_Pasha", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",22);
                Toast.makeText(getContext(), "The_Female_Peasent", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",23);
                Toast.makeText(getContext(), "Wooden_Axes", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",24);
                Toast.makeText(getContext(), "A_silo", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",25);
                Toast.makeText(getContext(), "Nazlet_Khater_Skeleton", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",26);
                Toast.makeText(getContext(), "Funeral_Masks", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",27);
                Toast.makeText(getContext(), "Purification_with_water", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });
        ex28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getContext(), Exhibit_info.class);
                a.putExtra("Index",28);
                Toast.makeText(getContext(), "The_birth_of_Isis", Toast.LENGTH_SHORT).show();
                startActivity(a);
            }
        });

        //final ImageView textView = binding.imageView24;
        //galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}