package com.recyclerview.liuyixi.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RecyclerViewActivity2 extends AppCompatActivity{

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        initFruit();
        RecyclerView rv = (RecyclerView)findViewById(R.id.recycler_view);

//        LinearLayoutManager lm = new LinearLayoutManager(this);
//        lm.setOrientation(LinearLayoutManager.HORIZONTAL);
//        rv.setLayoutManager(lm);

        //用于瀑布流布局
        StaggeredGridLayoutManager sgl = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        rv.setLayoutManager(sgl);

        FruitAdapter fa = new FruitAdapter(fruitList);
        rv.setAdapter(fa);
    }
    private void initFruit(){
        for(int i = 0;i < 2; i++){
            Fruit r1 = new Fruit(getRandomLengthName("1") ,R.drawable.ic_launcher);
            fruitList.add(r1);
            Fruit r2 = new Fruit(getRandomLengthName("2") ,R.drawable.ic_launcher);
            fruitList.add(r2);
            Fruit r3 = new Fruit(getRandomLengthName("3") ,R.drawable.ic_launcher);
            fruitList.add(r3);
            Fruit r4 = new Fruit(getRandomLengthName("4") ,R.drawable.ic_launcher);
            fruitList.add(r4);
            Fruit r5 = new Fruit(getRandomLengthName("5") ,R.drawable.ic_launcher);
            fruitList.add(r5);
        }
    }

    //用于瀑布流布局
    private String getRandomLengthName(String name){
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i < length; i++){
            builder.append(name);
        }
        return builder.toString();
    }
}
