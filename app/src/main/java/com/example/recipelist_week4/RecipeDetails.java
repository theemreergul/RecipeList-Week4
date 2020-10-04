package com.example.recipelist_week4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RecipeDetails extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_detail);
        getRecipe();
    }
    void getRecipe(){
        Intent intRecipe=getIntent();
        TextView recipe=findViewById(R.id.txtTitle);
        recipe.setText("Testing");


    }
}
