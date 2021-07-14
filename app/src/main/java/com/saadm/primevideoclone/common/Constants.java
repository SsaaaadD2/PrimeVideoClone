package com.saadm.primevideoclone.common;

import com.saadm.primevideoclone.model.AllCategories;
import com.saadm.primevideoclone.model.BannerMovies;
import com.saadm.primevideoclone.model.CategoryItem;

import java.util.ArrayList;

public class Constants {

    public static final int BANNER_SWIPE_DELAY = 3000;

    public static final ArrayList<BannerMovies> HOME = new ArrayList<BannerMovies>(){
        {
           // add(new BannerMovies(1, "Good Will Hunting", "https://cdn.shopify.com/s/files/1/0969/9128/products/Good_Will_Hunting_-_Robin_Williams_Matt_Damon_-_Hollywood_Movie_Poster_5124e202-e07a-481f-9c77-bd1729fc628b.jpg?v=1552730293", ""));
            add(new BannerMovies(2, "The Avengers", "https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwallpapercave.com%2Fwp%2FvDy3sUb.jpg&f=1&nofb=1", ""));

            //From TVMaze Api
            add(new BannerMovies(69, "The Blacklist", "https://static.tvmaze.com/uploads/images/original_untouched/8/20077.jpg", ""));
            add(new BannerMovies(431, "Friends", "https://static.tvmaze.com/uploads/images/original_untouched/219/548045.jpg", ""));
            add(new BannerMovies(30770, "Chernobyl", "https://static.tvmaze.com/uploads/images/original_untouched/219/547790.jpg", ""));
            add(new BannerMovies(555, "The Last Airbender", "https://static.tvmaze.com/uploads/images/original_untouched/71/178922.jpg", ""));
        }
    };

    //Get from TVMaze API
    public static final ArrayList<BannerMovies> TV_SHOWS = new ArrayList<BannerMovies>(){
        {
            add(new BannerMovies(17312, "Kim's Convenience", "https://static.tvmaze.com/uploads/images/original_untouched/293/734386.jpg", ""));
            add(new BannerMovies(1775, "Schitt's Creek", "https://static.tvmaze.com/uploads/images/original_untouched/164/410309.jpg", ""));
            add(new BannerMovies(19, "Supernatural", "https://static.tvmaze.com/uploads/images/original_untouched/5/12566.jpg", ""));
            add(new BannerMovies(50701, "Lupin", "https://static.tvmaze.com/uploads/images/original_untouched/327/819677.jpg", ""));
            add(new BannerMovies(44458, "Ted Lasso", "https://static.tvmaze.com/uploads/images/original_untouched/265/662928.jpg", ""));
            add(new BannerMovies(532, "Scrubs", "https://static.tvmaze.com/uploads/images/original_untouched/223/557618.jpg", ""));
        }
    };

    //Google images
    public static final ArrayList<BannerMovies> MOVIES = new ArrayList<BannerMovies>(){
        {
            add(new BannerMovies(1, "Spider-Man Far From Home", "https://cdn.guidingtech.com/media/assets/Cool-Spider-Man-Far-From-Home-HD-wallpapers-5.jpg", ""));
            add(new BannerMovies(2, "The Avengers", "https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwallpapercave.com%2Fwp%2FvDy3sUb.jpg&f=1&nofb=1", ""));

        }
    };

    //TVMaze API
    public static final ArrayList<BannerMovies> CARTOONS = new ArrayList<BannerMovies>(){
        {
            add(new BannerMovies(713, "Spongebob Squarepants", "https://static.tvmaze.com/uploads/images/original_untouched/223/557581.jpg", ""));
            add(new BannerMovies(978, "Chowder", "https://static.tvmaze.com/uploads/images/original_untouched/221/554193.jpg", ""));
            add(new BannerMovies(2557, "Kim Possible", "https://static.tvmaze.com/uploads/images/original_untouched/330/827054.jpg", ""));
            add(new BannerMovies(17996, "Fillmore", "https://static.tvmaze.com/uploads/images/original_untouched/226/566038.jpg", ""));

        }
    };

    //Image files obtained from PrimeVideo directly
    public static final ArrayList<CategoryItem> WATCH_NEXT_CATEGORIES = new ArrayList<CategoryItem>(){
        {
            add(new CategoryItem(1, "Pata Nahi Par Bolna Hai", "https://images-na.ssl-images-amazon.com/images/S/pv-target-images/55a36a8758180a38faaf605da1a93f69076001c0e9d7dacac001085bb6e3a4fd._UR1920,1080_RI_SX712_FMwebp_.jpg"));
            add(new CategoryItem(2, "The Dark Knight","https://images-na.ssl-images-amazon.com/images/S/pv-target-images/14e19ad8ade0bd60cd5fa694cd05cb6ec57262c154150ee2dda6cdd88bf0d7eb._UR1920,1080_RI_UX400_UY225_.jpg"));
            add(new CategoryItem(3, "Back Roads", "https://images-na.ssl-images-amazon.com/images/S/pv-target-images/c2f218853d4cafa57ba395d6cd1900a83ca8eee6b6ac34888f7250401bf51498._UR1920,1080_RI_UX400_UY225_.jpg"));
        }
    };

    public static final ArrayList<CategoryItem> TV_CATEGORY = new ArrayList<CategoryItem>(){
        {
            add(new CategoryItem(1, "Younger", "https://images-na.ssl-images-amazon.com/images/S/pv-target-images/81c9695c71181aad88f0fd6a93b735eb515866ba1ba51eec236bc49a85edc37e._UR1920,1080_RI_UX400_UY225_.jpg"));
            add(new CategoryItem(2, "Supernatural", "https://images-na.ssl-images-amazon.com/images/S/pv-target-images/c82a5e6d985ed6d77934831f138469ea8919904fc8e663b25ed981da01b0f3fa._UR1920,1080_RI_UX400_UY225_.jpg"));
            add(new CategoryItem(3, "Bosch", "https://images-na.ssl-images-amazon.com/images/S/pv-target-images/848076090b3278e3229d652949d0d5b018d74927a1d487f09d38b50ea5618cf1._UR1920,1080_RI_UX400_UY225_.jpg"));
        }
    };

    public static final ArrayList<CategoryItem> RECOMMENDED_CATEGORY = new ArrayList<CategoryItem>(){
        {
            add(new CategoryItem(1, "Digimon Adventure Tri", "https://images-na.ssl-images-amazon.com/images/S/pv-target-images/5c08cdc024a7993fd3f6f2c1af16d4105ec946b7ff61a74d39ef3039a843d23b._UR1920,1080_RI_UX400_UY225_.png"));
        }
    };

    public static final ArrayList<AllCategories> CATEGORIES = new ArrayList<AllCategories>(){
        {
            add(new AllCategories(1, "Watch next", WATCH_NEXT_CATEGORIES));
            add(new AllCategories(2, "TV", TV_CATEGORY));
            add(new AllCategories(3, "Recommended for You", RECOMMENDED_CATEGORY));
        }
    };
}
