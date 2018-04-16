package com.cdi.practica.jefaturapoliciaagente.Adaptadores;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cdi.practica.jefaturapoliciaagente.Objetos.Item;
import com.cdi.practica.jefaturapoliciaagente.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergio on 16/04/2018.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder>{

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView personName;
        ImageView personPhoto;

        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.mat_nombre);
            personPhoto = (ImageView)itemView.findViewById(R.id.mat_logo);
        }
    }

    ArrayList<Item> item;

    public RVAdapter(ArrayList<Item> item){
        this.item = item;
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.personName.setText(item.get(i).getTexto());
        personViewHolder.personPhoto.setImageResource(item.get(i).getImagen());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
