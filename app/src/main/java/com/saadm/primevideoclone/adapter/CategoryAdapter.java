package com.saadm.primevideoclone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.saadm.primevideoclone.R;
import com.saadm.primevideoclone.model.AllCategories;
import com.saadm.primevideoclone.model.CategoryItem;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MainViewHolder>{

    List<AllCategories> categories;
    Context context;

    public CategoryAdapter(List<AllCategories> categories, Context context) {
        this.categories = categories;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.category_recycler_layout, parent, false);
        return new MainViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull CategoryAdapter.MainViewHolder holder, int position) {
        holder.categoryName.setText(categories.get(position).getCategoryName());
        holder.setItemRecyclerView(holder.itemRecyclerView,categories.get(position).getCategoryItemList());
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public final class MainViewHolder extends RecyclerView.ViewHolder{

        TextView categoryName;
        RecyclerView itemRecyclerView;

        public MainViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            categoryName = itemView.findViewById(R.id.txt_item_category);
            itemRecyclerView = itemView.findViewById(R.id.recyCategoryItemRecycler);
        }

        public void setItemRecyclerView(RecyclerView recyclerView, List<CategoryItem> categoryItemList){
            CategoryItemAdapter itemAdapter = new CategoryItemAdapter(context, categoryItemList);
            recyclerView.setLayoutManager(new LinearLayoutManager
                    (recyclerView.getContext(), LinearLayoutManager.HORIZONTAL, false));
            recyclerView.setAdapter(itemAdapter);
        }
    }
}
