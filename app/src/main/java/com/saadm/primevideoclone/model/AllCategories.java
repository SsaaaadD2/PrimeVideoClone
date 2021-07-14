package com.saadm.primevideoclone.model;

import java.util.List;

public class AllCategories {
    int categoryId;
    String categoryName;
    List<CategoryItem> categoryItemList;

    public AllCategories(int categoryId, String categoryName, List<CategoryItem> categoryItemList) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryItemList = categoryItemList;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<CategoryItem> getCategoryItemList() {
        return categoryItemList;
    }

    public void setCategoryItemList(List<CategoryItem> categoryItemList) {
        this.categoryItemList = categoryItemList;
    }
}
