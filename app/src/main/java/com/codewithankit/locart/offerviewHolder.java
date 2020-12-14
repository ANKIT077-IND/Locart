package com.codewithankit.locart;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class offerviewHolder extends RecyclerView.ViewHolder {
    ImageView imagview;
    TextView tv9,tv10;


    public offerviewHolder(@NonNull View itemView) {
        super(itemView);
        imagview=itemView.findViewById(R.id.imagview);
        tv9=itemView.findViewById(R.id.tv9);
        tv10=itemView.findViewById(R.id.tv10);
    }
}
