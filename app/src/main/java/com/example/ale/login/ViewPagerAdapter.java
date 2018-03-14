package com.example.ale.login;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ale on 14/03/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> list= new ArrayList<>();
    private List<String> titulos= new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    public void addFragment(Fragment miFragment, String titulo){
        list.add(miFragment);
        titulos.add(titulo);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titulos.get(position);
    }
}
