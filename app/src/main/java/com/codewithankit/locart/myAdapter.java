package com.codewithankit.locart;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myviewHolder> {
   ArrayList<modal>data;

    public myAdapter(ArrayList<modal> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.singlerow,parent,false);
        return new myviewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull myviewHolder holder, int position) {
    holder.imageView.setImageResource(data.get(position).getImagename());
    holder.textView.setText(data.get(position).getHeader());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
