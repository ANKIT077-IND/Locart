package com.codewithankit.locart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView,recview,recviewoffer;
    TextView tv1,tv5,tv6;
    ImageButton imgbtn1,imgbtn2,imgbtn3;
    SearchView searchView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.tv1);
        tv5=findViewById(R.id.tv5);
        tv6=findViewById(R.id.tv6);
        imgbtn1=findViewById(R.id.imgbtn1);
        imgbtn2=findViewById(R.id.imgbtn2);
        imgbtn3=findViewById(R.id.imgbtn3);
        searchView=findViewById(R.id.searchView);
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter adapter = new myAdapter(dataqueue());
        recyclerView.setAdapter(adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(gridLayoutManager);


        recview= findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));
        adapterclass adapter1 = new adapterclass(dataList());
        recview.setAdapter(adapter1);
        GridLayoutManager gridLayoutManager1 = new GridLayoutManager(this, 3);
        recview.setLayoutManager(gridLayoutManager1);




    }

    public ArrayList<modal> dataqueue() {
        ArrayList<modal> holder = new ArrayList<>();

        modal obj0 = new modal();
        obj0.setHeader("Food Delivery");
        obj0.setImagename(R.drawable.ic_launcher_background);
        holder.add(obj0);


        modal obj1 = new modal();
        obj1.setHeader("Grocery");
        obj1.setImagename(R.drawable.ic_launcher_background);
        holder.add(obj1);


        modal obj2 = new modal();
        obj2.setHeader("Medicine");
        obj2.setImagename(R.drawable.ic_launcher_background);
        holder.add(obj2);


        modal obj3 = new modal();
        obj3.setHeader("Home Appliances");
        obj3.setImagename(R.drawable.ic_launcher_background);
        holder.add(obj3);


        modal obj4 = new modal();
        obj4.setHeader("Garment");
        obj4.setImagename(R.drawable.ic_launcher_background);
        holder.add(obj4);


        modal obj5 = new modal();
        obj5.setHeader("Other Store");
        obj5.setImagename(R.drawable.ic_launcher_background);
        holder.add(obj5);
        return holder;


    }
    public ArrayList<myPojo> dataList(){
        ArrayList<myPojo> holder=new ArrayList<>();

        myPojo obj=new myPojo();
        obj.setMyheader("Bike Texi");
        obj.setMyimage(R.drawable.ic_launcher_background);
        holder.add(obj);

        myPojo obj1=new myPojo();
        obj1.setMyheader("Laundry delivery");
        obj1.setMyimage(R.drawable.ic_launcher_background);
        holder.add(obj1);

        myPojo obj2=new myPojo();
        obj1.setMyheader("Courier Services");
        obj1.setMyimage(R.drawable.ic_launcher_background);
        holder.add(obj1);


        return holder;
    }

}