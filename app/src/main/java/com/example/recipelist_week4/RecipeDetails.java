package com.example.recipelist_week4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

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
        TextView details=findViewById(R.id.txtDetails);
        ImageView image=findViewById(R.id.imageView);
        if(intRecipe.hasExtra("recipe_title")&&intRecipe.hasExtra("recipe_details")&&intRecipe.hasExtra("recipe_image"))
        {
            recipe.setText(intRecipe.getStringExtra("recipe_title"));
            String detailsText=intRecipe.getStringExtra("recipe_details")+"\n1/3 cup item1\n" +
                    "1/3 cup item2, cubed\n" +
                    "2 tablespoons item3\n" +
                    "1-1/2 teaspoons 2% item4\n" +
                    "1 tube (8 ounces) refrigerated item4\n" +
                    "2 teaspoons item5";
            details.setText(detailsText);
            String img=intRecipe.getStringExtra("recipe_image");
            Glide.with(this)
                    .asBitmap()
                    .load(img)
                    .into(image);

        }


    }
}
