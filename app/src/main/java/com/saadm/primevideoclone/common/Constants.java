package com.saadm.primevideoclone.common;

import com.saadm.primevideoclone.model.BannerMovies;

import java.util.ArrayList;

public class Constants {

    public static final int BANNER_SWIPE_DELAY = 3000;

    public static final ArrayList<BannerMovies> home = new ArrayList<BannerMovies>(){
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
    public static final ArrayList<BannerMovies> tvShows = new ArrayList<BannerMovies>(){
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
    public static final ArrayList<BannerMovies> movies = new ArrayList<BannerMovies>(){
        {
            add(new BannerMovies(1, "Spider-Man Far From Home", "https://cdn.guidingtech.com/media/assets/Cool-Spider-Man-Far-From-Home-HD-wallpapers-5.jpg", ""));
            add(new BannerMovies(2, "The Avengers", "https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwallpapercave.com%2Fwp%2FvDy3sUb.jpg&f=1&nofb=1", ""));

        }
    };

    //TVMaze API
    public static final ArrayList<BannerMovies> cartoons = new ArrayList<BannerMovies>(){
        {
            add(new BannerMovies(713, "Spongebob Squarepants", "https://static.tvmaze.com/uploads/images/original_untouched/223/557581.jpg", ""));
            add(new BannerMovies(978, "Chowder", "https://static.tvmaze.com/uploads/images/original_untouched/221/554193.jpg", ""));
            add(new BannerMovies(2557, "Kim Possible", "https://static.tvmaze.com/uploads/images/original_untouched/330/827054.jpg", ""));
            add(new BannerMovies(17996, "Fillmore", "https://static.tvmaze.com/uploads/images/original_untouched/226/566038.jpg", ""));

        }
    };
}
