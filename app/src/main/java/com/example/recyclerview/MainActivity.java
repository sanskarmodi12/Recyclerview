package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerview.Adapters.RecipeAdapter;
import com.example.recyclerview.Models.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);
        ArrayList <RecipeModel> list =new ArrayList<>();
        list.add(new RecipeModel(R.drawable.burger,"BURGER"));
        list.add(new RecipeModel(R.drawable.burgercombo,"BURGERCOMBO"));
        list.add(new RecipeModel(R.drawable.chickenpng,"CHICKEN"));
        list.add(new RecipeModel(R.drawable.roll,"VEG ROLL"));
        list.add(new RecipeModel(R.drawable.burger,"BURGER"));
        list.add(new RecipeModel(R.drawable.burgercombo,"BURGERCOMBO"));
        list.add(new RecipeModel(R.drawable.chickenpng,"CHICKEN"));
        list.add(new RecipeModel(R.drawable.roll,"VEG ROLL"));
        RecipeAdapter recipeAdapter=new RecipeAdapter(list,this);
        recyclerView.setAdapter(recipeAdapter);
//        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(gridLayoutManager);


    }
}