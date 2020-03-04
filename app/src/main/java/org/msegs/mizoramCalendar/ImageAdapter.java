package org.msegs.mizoramCalendar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter extends PagerAdapter {
    Context context;
    private int[] GalImages = new int[] {
            R.drawable.jan,
            R.drawable.feb,
            R.drawable.mar,
            R.drawable.apr,
            R.drawable.may,
            R.drawable.jun,
            R.drawable.jul,
            R.drawable.aug,
            R.drawable.sep,
            R.drawable.oct,
            R.drawable.nov,
            R.drawable.dec
    };

    LayoutInflater mLayoutInflater;

    ImageAdapter(Context context){
        this.context=context;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return GalImages.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.pager_item, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
        imageView.setImageResource(GalImages[position]);

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }

}