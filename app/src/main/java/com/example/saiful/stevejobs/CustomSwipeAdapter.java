package com.example.saiful.stevejobs;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class CustomSwipeAdapter extends PagerAdapter {
    private int[] image_resources = {R.drawable.steve_jobs1, R.drawable.steve_jobs2, R.drawable.steve_jobs3, R.drawable.steve_jobs4, R.drawable.steve_jobs5, R.drawable.steve_jobs6, R.drawable.steve_jobs7, R.drawable.steve_jobs8, R.drawable.steve_jobs9, R.drawable.steve_jobs10, R.drawable.steve_jobs11, R.drawable.steve_jobs12, R.drawable.steve_jobs13, R.drawable.steve_jobs14, R.drawable.steve_jobs15};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public CustomSwipeAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.swipe_layout, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.image_view);
        TextView textView = (TextView) view.findViewById(R.id.image_count);
        imageView.setImageResource(image_resources[position]);
        textView.setText("image : " + (position + 1));
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
        container.removeView((LinearLayout) object);
    }
}
