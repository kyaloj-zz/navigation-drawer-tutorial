package com.fragments.justus.mfarm;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;


public class NavigationDrawer extends MaterialNavigationDrawer {

    @Override
    public void init(Bundle savedInstanceState) {

        // set header data
        setDrawerHeaderImage(R.drawable.bamboo);
        setUsername("Justus K Mbaluka");
        setUserEmail("jmbaluka@mfarm.co.ke");
        setFirstAccountPhoto(getResources().getDrawable(R.drawable.me));

        // create sections
        this.addSection(newSection("Daily Prices", R.drawable.ic_mic_white_24dp, new FragmentIndex()));
        this.addSection(newSection("Trends", R.drawable.ic_hotel_grey600_24dp, new TrendsFragment()));
        this.addSection(newSection("Blog", R.drawable.ic_mic_white_24dp, new BlogFragment()));
        this.addSection(newSection("Marketplace", R.drawable.ic_hotel_grey600_24dp, new MarketPlaceFragment()));
        this.addSection(newSection("About Us", R.drawable.ic_mic_white_24dp, new AboutUsFragment()));
        this.addSection(newSection("Logout", R.drawable.ic_hotel_grey600_24dp, new Intent(this, LoginPage.class)));

        // create bottom section
        this.addBottomSection(newSection("Bottom Section",R.drawable.ic_settings_black_24dp,new Intent(this,Settings.class)));
    }
}
