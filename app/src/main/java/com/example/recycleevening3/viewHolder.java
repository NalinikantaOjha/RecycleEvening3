package com.example.recycleevening3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;



    public class viewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView age;
        private TextView compny;
        private TextView proffesion;

        private CardView cardView;

        public viewHolder(@NonNull View itemView ){
            super(itemView);
            initview(itemView);

        }

        private void initview(View itemView) {
            imageView=itemView.findViewById(R.id.imageid);
            cardView=itemView.findViewById(R.id.cardview);
            compny=itemView.findViewById(R.id.compname);
            proffesion=itemView.findViewById(R.id.proffesion);
            age=itemView.findViewById(R.id.age);


        }
        public void setdata(view view){
            imageView.setImageResource(view.getImage());
            compny.setText(view.getCompny());
            age.setText(view.getAge());
            proffesion.setText(view.getProffesion());


        }


    }


