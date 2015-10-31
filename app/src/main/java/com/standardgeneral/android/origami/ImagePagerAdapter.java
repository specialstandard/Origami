package com.standardgeneral.android.origami;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImagePagerAdapter extends PagerAdapter {
    private Context mContext;
    private String mProject = new String();

    public ImagePagerAdapter(Context context, String project) {
        mContext = context;
        mProject = project;
    }

    @Override
    public int getCount() {
        if (mProject.equals("Boat")) {
            return mImagesSailboat.length;
        } else if (mProject.equals("Crane")) {
            return mImagesCrane.length;
        } else if (mProject.equals("Cat")) {
            return mImagesCat.length;
        } else if (mProject.equals("Dog")) {
            return mImagesDog.length;
        }
        else if (mProject.equals("ChristmasTree")) {
            return mImagesChristmasTree.length;
        }
        return 0;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ImageView) object);
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        int padding = mContext.getResources().getDimensionPixelSize(
                R.dimen.padding_medium);
        imageView.setPadding(padding, padding, padding, padding);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        Log.d(getClass().getSimpleName(), "Before if statement: X" + mProject + "X");

        if (mProject.equals("Boat")) {
            imageView.setImageResource(mImagesSailboat[position]);
        } else if (mProject.equals("Crane")){
            imageView.setImageResource(mImagesCrane[position]);
        } else if (mProject.equals("Cat")){
            imageView.setImageResource(mImagesCat[position]);
        } else if (mProject.equals("Dog")){
            imageView.setImageResource(mImagesDog[position]);
        } else if (mProject.equals("ChristmasTree")){
            imageView.setImageResource(mImagesChristmasTree[position]);
        }

        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }

    private int[] mImagesSailboat = new int[] {
            R.drawable.sailboat_1,
            R.drawable.sailboat_2,
            R.drawable.sailboat_3,
            R.drawable.sailboat_4,
            R.drawable.sailboat_5,
            R.drawable.sailboat_6,
            R.drawable.sailboat_7,
            R.drawable.sailboat_8,
            R.drawable.sailboat_9,
            R.drawable.sailboat_10
    };

    private int[] mImagesCrane = new int[] {
            R.drawable.crane_1,
            R.drawable.crane_2,
            R.drawable.crane_3,
            R.drawable.crane_4,
            R.drawable.crane_5,
            R.drawable.crane_6,
            R.drawable.crane_7,
            R.drawable.crane_8,
            R.drawable.crane_9,
            R.drawable.crane_10,
            R.drawable.crane_11,
            R.drawable.crane_12,
            R.drawable.crane_13,
            R.drawable.crane_14,
            R.drawable.crane_15,
            R.drawable.crane_16,
            R.drawable.crane_17,
            R.drawable.crane_18,
            R.drawable.crane_19,
            R.drawable.crane_20,
            R.drawable.crane_21,
            R.drawable.crane_22,
            R.drawable.crane_23,
            R.drawable.crane_24,
            R.drawable.crane_complete
    };

    private int[] mImagesCat = new int[] {
            R.drawable.cat_1,
            R.drawable.cat_2,
            R.drawable.cat_3,
            R.drawable.cat_4,
            R.drawable.cat_5,
            R.drawable.cat_6,
            R.drawable.cat_7,
            R.drawable.cat_8,
            R.drawable.cat_9,
            R.drawable.cat_10,
            R.drawable.cat_11,
            R.drawable.cat_12,
            R.drawable.cat_13,
            R.drawable.cat_14,
            R.drawable.cat_15,
            R.drawable.cat_16,
            R.drawable.cat_17
    };

    private int[] mImagesDog = new int[] {
            R.drawable.dog_1,
            R.drawable.dog_2,
            R.drawable.dog_3,
            R.drawable.dog_4,
            R.drawable.dog_5,
            R.drawable.dog_6,
            R.drawable.dog_7,
            R.drawable.dog_8,
            R.drawable.dog_9,
            R.drawable.dog_10,
            R.drawable.dog_11,
            R.drawable.dog_12,
            R.drawable.dog_13,
            R.drawable.dog_14,
    };

    private int[] mImagesChristmasTree = new int[] {
            R.drawable.christmas_tree_1,
            R.drawable.christmas_tree_2,
            R.drawable.christmas_tree_3,
            R.drawable.christmas_tree_4,
            R.drawable.christmas_tree_5,
            R.drawable.christmas_tree_6,
            R.drawable.christmas_tree_7,
            R.drawable.christmas_tree_8,
            R.drawable.christmas_tree_9
    };
}