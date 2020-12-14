package com.codewithankit.locart;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class offeradapter extends RecyclerView.Adapter<offerviewHolder> {
   ArrayList<offermodal>offerdata;

    public offeradapter(ArrayList<offermodal> offerdata) {
        this.offerdata = offerdata;
    }

    @NonNull
    @Override
    public offerviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view2=inflater.inflate(R.layout.,parent,false);
        return new offerviewHolder(view2);
    }

    @Override
    public void onBindViewHolder(@NonNull offerviewHolder holder, int position) {
    holder.tv9.setText(offerdata.get(position).getOfferheader());
    holder.tv10.setText(offerdata.get(position).getOfferdis());
    holder.imagview.setImageResource(offerdata.get(position).getOfferimage());
    }

    @Override
    public int getItemCount() {
        return offerdata.size();
    }
}
