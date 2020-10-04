package com.example.recipelist_week4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> mRecipes = new ArrayList<>();
    private ArrayList<String> mTexts = new ArrayList<>();
    private ArrayList<String> mImages=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecipes();
    }
    private void initRecipes(){
        mRecipes.add("Mini Caramel Rolls");
        mTexts.add("Here's the perfect warm treat for pajama-clad family mornings. These ooey-gooey baked rolls come together in moments—thanks to a tube of refrigerated crescent rolls—and disappear just as quickly.");
        mImages.add("https://www.tasteofhome.com/wp-content/uploads/2018/01/Mini-Caramel-Rolls_EXPS_THMBRDS19_39703_C10_03_1b-1-696x696.jpg");

        mRecipes.add("Three-Bean Baked Beans");
        mTexts.add("I got this recipe from an aunt and made a couple of changes to suit our tastes. With ground beef and bacon mixed in, these satisfying beans are a big hit at backyard barbecues and church picnics. I'm always asked to bring my special beans.");
        mImages.add("https://www.tasteofhome.com/wp-content/uploads/2018/01/Three-Bean-Baked-Beans_EXPS_SDAM17_9008_D12_07_8b-696x696.jpg");

        mRecipes.add("Pepper Poppers");
        mTexts.add("These creamy stuffed jalapenos have some bite. They may be the most popular treats I make! My husband is always hinting that I should make a batch.");
        mImages.add("https://www.tasteofhome.com/wp-content/uploads/2018/01/Pepper-Poppers_exps8981_RCCF143496D04_16_5bC_RMS-4-696x696.jpg");

        mRecipes.add("Sour Cream Chip Muffins");
        mTexts.add("Take one bite and you'll see why I think these rich, tender muffins are the best I've ever tasted. Mint chocolate chips make them a big hit with my family and friends. ");
        mImages.add("https://www.tasteofhome.com/wp-content/uploads/2018/01/exps10111_MRR143297C09_10_2b-696x696.jpg");

        mRecipes.add("Onion Beef au Jus");
        mTexts.add("Garlic, onions, soy sauce and onion soup mix flavor the tender beef in these savory hot sandwiches served with a tasty, rich broth for dipping. The seasoned beef makes delicious cold sandwiches, too.");
        mImages.add("https://www.tasteofhome.com/wp-content/uploads/2018/01/Onion-Beef-au-Jus_exps21298_CW143433B03_21_6b_RMS-1-696x696.jpg");

        mRecipes.add("Tasty-Italian Vegetable Soup");
        mTexts.add("Here's a dish that will warm you up fast. It takes just 25 minutes until you can sit down and start sipping on this soup.");
        mImages.add("https://www.tasteofhome.com/wp-content/uploads/2018/01/Tasty-Italian-Vegetable-Soup_exps2558_EIT2919394D11_29_1bC_RMS-696x696.jpg");

        mRecipes.add("Apple Dumpling Bake");
        mTexts.add("I received this recipe for baked apple dumplings with Mountain Dew from a friend of mine, then tweaked it to suit my family's tastes. The soda is definitely the secret ingredient in this rich apple dessert.");
        mImages.add("https://www.tasteofhome.com/wp-content/uploads/2018/01/Apple-Dumpling-Bake_EXPS_SDAS17_22164_B04_07_2b-1-696x696.jpg");

        initRecyclerView();
    }
    void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,mRecipes,mImages,mTexts);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}