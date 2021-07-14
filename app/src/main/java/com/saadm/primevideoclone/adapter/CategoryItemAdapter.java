package com.saadm.primevideoclone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.saadm.primevideoclone.R;
import com.saadm.primevideoclone.model.CategoryItem;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CategoryItemAdapter extends RecyclerView.Adapter<CategoryItemAdapter.ItemViewHolder> {

    Context context;
    List<CategoryItem> categoryItems;

    public CategoryItemAdapter(Context context, List<CategoryItem> categoryItems) {
        this.context = context;
        this.categoryItems = categoryItems;
    }

    @NonNull
    @NotNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.category_item_recycler_layout, parent, false);
        return new ItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull CategoryItemAdapter.ItemViewHolder holder, int position) {
        Glide.with(context).load(categoryItems.get(position).getImageUrl()).into(holder.itemImage);
    }

    @Override
    public int getItemCount() {
        return categoryItems.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;

        public ItemViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.imgItemImage);
        }
    }
}
