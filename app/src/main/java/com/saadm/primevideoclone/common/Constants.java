package com.saadm.primevideoclone.common;

import com.saadm.primevideoclone.model.BannerMovies;

import java.util.ArrayList;

public class Constants {

    public static final int BANNER_SWIPE_DELAY = 2000;
    public static final int BANNER_ITEM_PERIOD = 2000;

    public static final ArrayList<BannerMovies> tvShows = new ArrayList<BannerMovies>(){
        {
            add(new BannerMovies(69, "The Blacklist", "", ""));
            add(new BannerMovies(431, "Friends", "", ""));
            add(new BannerMovies(17312, "Kim's Convenience", "", ""));
            add(new BannerMovies(1775, "Schitt's Creek", "", ""));
            add(new BannerMovies(19, "Supernatural", "", ""));
            add(new BannerMovies(50701, "Lupin", "", ""));
            add(new BannerMovies(30770, "Chernobyl", "", ""));
            add(new BannerMovies(44458, "Ted Lasso", "", ""));
            add(new BannerMovies(532, "Scrubs", "", ""));
        }
    };
}
