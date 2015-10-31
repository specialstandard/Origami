package com.standardgeneral.android.origami;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class DetailActivity extends AppCompatActivity {

    private String  mProject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = this.getIntent();

        if (intent != null && intent.hasExtra(Intent.EXTRA_TEXT)) {
            mProject = intent.getStringExtra(Intent.EXTRA_TEXT);
        }

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        ImagePagerAdapter adapter = new ImagePagerAdapter(this, mProject);
        viewPager.setAdapter(adapter);
    }
}
