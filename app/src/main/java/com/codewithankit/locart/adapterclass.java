package com.codewithankit.locart;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapterclass extends RecyclerView.Adapter<viewholder> {
    ArrayList<myPojo> dataset;

    public adapterclass(ArrayList<myPojo> dataset) {
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view1=inflater.inflate(R.layout.pickup,parent,false);
        return  new viewholder(view1);

    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
    holder.tv7.setText(dataset.get(position).getMyheader());
    holder.imgview.setImageResource(dataset.get(position).getMyimage());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
