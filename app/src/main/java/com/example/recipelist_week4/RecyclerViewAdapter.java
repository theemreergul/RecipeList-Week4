package com.example.recipelist_week4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> mRecipes= new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mTexts=new ArrayList<>();
    private Context mContext;
    public RecyclerViewAdapter(Context context,ArrayList<String> recipes, ArrayList<String> images,ArrayList<String> texts){
        mRecipes=recipes;
        mImages=images;
        mTexts=texts;
        mContext=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_list, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.recipe.setText(mRecipes.get(position));
        holder.text.setText(mTexts.get(position));
        holder.pLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,RecipeDetails.class);
                intent.putExtra("recipe_title",mRecipes.get(position));
                intent.putExtra("recipe_details",mTexts.get(position));
                intent.putExtra("recipe_image",mImages.get(position));
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mTexts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView recipe;
        TextView text;
        LinearLayout pLayout;
        public ViewHolder(View itemView){
            super(itemView);
            recipe=itemView.findViewById(R.id.txtTitle);
            text=itemView.findViewById(R.id.txtShortDesc);
            pLayout=itemView.findViewById(R.id.linear_layout);

        }

    }
}
