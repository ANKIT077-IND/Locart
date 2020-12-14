package com.codewithankit.locart;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView;


    public myviewHolder(@NonNull View itemView) {
        super(itemView);

        textView=itemView.findViewById(R.id.tv4);
        imageView=itemView.findViewById(R.id.imgbtn4);
    }
}
