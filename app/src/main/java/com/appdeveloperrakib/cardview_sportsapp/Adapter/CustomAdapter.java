package com.appdeveloperrakib.cardview_sportsapp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appdeveloperrakib.cardview_sportsapp.Model.Sport;
import com.appdeveloperrakib.cardview_sportsapp.R;

import java.util.List;

//This class is an adapter class
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.SportsViewHolder> {

    private List<Sport> sportList;

    public CustomAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflating the layout for each item in the recyclerview

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item,parent,false);

        return new SportsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {

        /* Called for each item i the list and is resposible for
        binding the data from the sport object to the views
        within the 'SportsViewHolder'
         */
        Sport sport = sportList.get(position);
        holder.textView.setText(sport.getSportName());
        holder.imageView.setImageResource(sport.getSportImg());



    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public class SportsViewHolder extends RecyclerView.ViewHolder{
        //Holds the references to the views within the item layout

        TextView textView;
        ImageView imageView;

        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if(position != RecyclerView.NO_POSITION){

                        Sport sport = sportList.get(position);
                        String sportName = sport.getSportName();
                        Toast.makeText(view.getContext(), ""+position, Toast.LENGTH_SHORT).show();
                    }
                }
            });



        }

    }



}
