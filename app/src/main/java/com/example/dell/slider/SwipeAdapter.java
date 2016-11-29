package com.example.dell.slider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Dell on 11/26/2016.
 */

public class SwipeAdapter extends FragmentStatePagerAdapter {
    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment=new pagefragment();
        Bundle bundle=new Bundle();
       bundle.putInt("count1",i+1);
        if  (i==0)
        bundle.putString("count", "زيدان ماشي بنور الله ");
        else         if  (i==1)
        bundle.putString("count", "زيدان يحب الرياال ");
        else
        bundle.putString("count", "زيدان موعود بالاصابات");

        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
