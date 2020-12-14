package com.codewithankit.locart;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewholder extends RecyclerView.ViewHolder {
    ImageView imgview;
    TextView tv7;


    public viewholder(@NonNull View itemView) {
        super(itemView);

        imgview=itemView.findViewById(R.id.imgview);
        tv7=itemView.findViewById(R.id.tv7);
    }
}
