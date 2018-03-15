package com.example.ale.login;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

/**
 * Created by Ale on 13/03/2018.
 */

class PantallaTabs extends AppCompatActivity {

    private TabLayout tabs;
    private ViewPager vpPrincipal;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundapantalla);

        tabs = (TabLayout) findViewById(R.id.tabs);
        vpPrincipal =(ViewPager) findViewById(R.id.vpPrincipal);

        crearAdaptador();
        
        tabs.setupWithViewPager(vpPrincipal);





    }

    private void crearAdaptador() {

        ViewPagerAdapter adapter= new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(),"Tab1");
        adapter.addFragment(new Fragment2(),"Tab2");
        vpPrincipal.setAdapter(adapter);
    }
}
