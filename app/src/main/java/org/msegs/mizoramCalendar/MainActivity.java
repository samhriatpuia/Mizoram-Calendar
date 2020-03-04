package org.msegs.mizoramCalendar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CalendarView;



import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

public class MainActivity extends AppCompatActivity {



    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_main);

        //calendarView.setDate(calendar);

        DateFormat dateFormat = new SimpleDateFormat("M");
        Date date = new Date();
        Log.d("Month",dateFormat.format(date));

        viewPager = findViewById(R.id.view_pager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(11);
        viewPager.setCurrentItem(Integer.parseInt(dateFormat.format(date))-1);
    }

}
