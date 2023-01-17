package com.example.gp_all;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link visit#newInstance} factory method to
 * create an instance of this fragment.
 */
public class visit extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public visit() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment visit.
     */
    // TODO: Rename and change types and number of parameters
    public static visit newInstance(String param1, String param2) {
        visit fragment = new visit();
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

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_visit, container, false);
        int ids[] = new int[54];
        ids[0] = R.mipmap.image;
        ids[1] = R.mipmap.c4;
        ids[2] = R.mipmap.c6;
        ids[3] = R.mipmap.image4;
        ids[4] = R.mipmap.image5;
        ids[5] = R.mipmap.image6;
        ids[6] = R.mipmap.image7;
        ids[7] = R.mipmap.image8;
        ids[8] = R.mipmap.image9;
        ids[9] = R.mipmap.image10;
        ids[10] = R.mipmap.image11;
        ids[11] = R.mipmap.image12;
        ids[12] = R.mipmap.image13;
        ids[13] = R.mipmap.image14;
        ids[14] = R.mipmap.image15;
        ids[15] = R.mipmap.image16;
        ids[16] = R.mipmap.image17;
        ids[17] = R.mipmap.image18;
        ids[18] = R.mipmap.image19;
        ids[19] = R.mipmap.image20;
        ids[20] = R.mipmap.image21;
        ids[21] = R.mipmap.image22;
        ids[22] = R.mipmap.image23;
        ids[23] = R.mipmap.image24;
        ids[24] = R.mipmap.image25;
        ids[25] = R.mipmap.image26;
        ids[26] = R.mipmap.image27;
        ids[27] = R.mipmap.image28;
        ids[28] = R.mipmap.image29;
        ids[29] = R.mipmap.image30;
        ids[30] = R.mipmap.image31;
        ids[31] = R.mipmap.image32;
        ids[32] = R.mipmap.image33;
        ids[33] = R.mipmap.image34;
        ids[34] = R.mipmap.image35;
        ids[35] = R.mipmap.image36;
        ids[36] = R.mipmap.image37;
        ids[37] = R.mipmap.image38;
        ids[38] = R.mipmap.image39;
        ids[39] = R.mipmap.image40;
        ids[40] = R.mipmap.image41;
        ids[41] = R.mipmap.image42;
        ids[42] = R.mipmap.image43;
        ids[43] = R.mipmap.image44;
        ids[44] = R.mipmap.image45;
        ids[45] = R.mipmap.image46;
        ids[46] = R.mipmap.image47;
        ids[47] = R.mipmap.image48;
        ids[48] = R.mipmap.image49;
        ids[49] = R.mipmap.image50;
        ids[50] = R.mipmap.image51;
        ids[51] = R.mipmap.image52;
        ids[52] = R.mipmap.image53;
        ids[53] = R.mipmap.image54;
        LinearLayout y = rootView.findViewById(R.id.layout9);
        ImageView[] x = new ImageView[54];
        for (int i = 0; i < 54; i++) {
            x[i] = new ImageView(getContext());
            x[i].setBackgroundResource(ids[i]);
            x[i].setLeftTopRightBottom(20,0,20,5);
            x[i].setMaxHeight(200);
            final int finalI2 = i;
            x[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent a=new Intent(getContext(),Book_Ticket.class);
                    a.putExtra("r",finalI2);
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
        MenuInflater inflater1 = getActivity().getMenuInflater();
        inflater1.inflate(R.menu.language_menu, menu);
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