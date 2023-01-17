package com.example.gp_all;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {
    private Context context;
    private ArrayList<imageModel> imageModelArrayList;

    public Adapter(Context context, ArrayList<imageModel> imageModelArrayList) {
        this.context = context;
        this.imageModelArrayList = imageModelArrayList;
    }


    @NonNull
    @Override
    public Adapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout, parent, false);
        return new Viewholder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull Adapter.Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        imageModel model = imageModelArrayList.get(position);
        holder.imageIV.setImageResource(model.getImage());
        holder.image_name.setText("" + model.getText());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int pos;
                if(model.getText() == "Predynastic Era")
                {
                    Intent intent = new Intent(context.getApplicationContext(), Tabbed2.class);
                    context.startActivity(intent);
                }
                else if(model.getText()=="MERNEPTAH")
                {
                    /*Intent intent = new Intent(context.getApplicationContext(), mummyDetails.class);
                    pos=0;
                    intent.putExtra("pos",pos);
                    context.startActivity(intent);*/
                }
                else if(model.getText()=="AMENHOTEP I")
                {
                    /*Intent intent = new Intent(context.getApplicationContext(), mummyDetails.class);
                    pos=1;
                    intent.putExtra("pos",pos);
                    context.startActivity(intent);*/
                }
                else if(model.getText()=="AHMOSENEFERTARI")
                {/*
                    Intent intent = new Intent(context.getApplicationContext(), mummyDetails.class);
                    pos=2;
                    intent.putExtra("pos",pos);
                    context.startActivity(intent);*/
                }
                else if(model.getText()=="RAMESSES III")
                {/*
                    Intent intent = new Intent(context.getApplicationContext(), mummyDetails.class);
                    pos=3;
                    intent.putExtra("pos",pos);
                    context.startActivity(intent);*/
                }
                else if(model.getText()=="RAMESSES IV")
                {/*
                    Intent intent = new Intent(context.getApplicationContext(), mummyDetails.class);
                    pos=4;
                    intent.putExtra("pos",pos);
                    context.startActivity(intent);*/
                }
                else if(model.getText()=="SEQENERE")
                {/*
                    Intent intent = new Intent(context.getApplicationContext(), mummyDetails.class);
                    pos=5;
                    intent.putExtra("pos",pos);
                    context.startActivity(intent);*/
                }
                else if(model.getText()=="SETI I")
                {/*
                    Intent intent = new Intent(context.getApplicationContext(), mummyDetails.class);
                    pos=6;
                    intent.putExtra("pos",pos);
                    context.startActivity(intent);*/
                }
                else if(model.getText()=="SETI II")
                {/*
                    Intent intent = new Intent(context.getApplicationContext(), mummyDetails.class);
                    pos=7;
                    intent.putExtra("pos",pos);
                    context.startActivity(intent);*/
                }
                else if(model.getText()=="SIPTAH")
                {/*
                    Intent intent = new Intent(context.getApplicationContext(), mummyDetails.class);
                    pos=8;
                    intent.putExtra("pos",pos);
                    context.startActivity(intent);*/
                }
                else if(model.getText()=="THUTMOSE I")
                {/*
                    Intent intent = new Intent(context.getApplicationContext(), mummyDetails.class);
                    pos=9;
                    intent.putExtra("pos",pos);
                    context.startActivity(intent);*/
                }
                else if(model.getText()=="THUTMOSE II")
                {/*
                    Intent intent = new Intent(context.getApplicationContext(), mummyDetails.class);
                    pos=10;
                    intent.putExtra("pos",pos);
                    context.startActivity(intent);*/
                }
                else if(model.getText()=="THUTMOSE III")
                {/*
                    Intent intent = new Intent(context.getApplicationContext(), mummyDetails.class);
                    pos=11;
                    intent.putExtra("pos",pos);
                    context.startActivity(intent);*/
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return imageModelArrayList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView imageIV;
        private TextView image_name ;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageIV = itemView.findViewById(R.id.image);
            image_name= itemView.findViewById(R.id.txtview);
        }
    }
}