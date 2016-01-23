package com.amusoft.aibible;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.github.florent37.materialviewpager.MaterialViewPager;


public class About extends ActionBarActivity {
    MaterialViewPager mViewPagerTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setToolBar();
    }

    private void setToolBar() {
        mViewPagerTwo=(MaterialViewPager)findViewById(R.id.materialViewPagerTwo);
        mViewPagerTwo.setColor(getResources().getColor(R.color.act_back),3);

        Toolbar toolbar =mViewPagerTwo.getToolbar();
        if (toolbar != null) {
toolbar.inflateMenu(R.menu.menu_about);
            toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    int id = menuItem.getItemId();
                    if(id==android.R.id.home){
                        Intent upIntent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(upIntent);
                           finish();

                    }
                    return false;
                }
            });

            setSupportActionBar(toolbar);
            setUpActionbar();
            toolbar.setTitleTextColor(getResources().getColor(R.color.white_pure));

        }

    }

    private void setUpActionbar() {
        ActionBar bar = getSupportActionBar();

        bar.setTitle(getResources().getString(R.string.action_about));
        bar.setHomeButtonEnabled(true);
        bar.setDisplayShowHomeEnabled(true);
        bar.setDisplayHomeAsUpEnabled(true);
        bar.setDisplayShowTitleEnabled(true);
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(id==android.R.id.home){
            Intent upIntent = new Intent(this, MainActivity.class);
             startActivity(upIntent);

        }



        return super.onOptionsItemSelected(item);
    }
}
