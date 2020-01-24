package org.msegs.mizoramCalendar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    LinearLayout jan;

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


         viewPager = (ViewPager) findViewById(R.id.view_pager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(11);


//
//        DateFormat dateFormat = new SimpleDateFormat("MM");
//        Date date = new Date();
//        String month = dateFormat.format(date);
//        //AUTOMATICALLY SWITCH TO THE CURRENT MONTH
//        switch(month){
//            case "01":
//                String fromDec = getIntent().getStringExtra("december");
//                String fromFeb = getIntent().getStringExtra("february");
//                if(fromDec=="1" || fromFeb == "1"){
//                    startActivity(new Intent(MainActivity.this,MainActivity.class));
//                }
//                break;
//            case "02":                 startActivity(new Intent(MainActivity.this,February.class));
//                break;
//            case "03":                 startActivity(new Intent(MainActivity.this,March.class));
//                break;
//            case "04":                 startActivity(new Intent(MainActivity.this,April.class));
//                break;
//            case "05":                 startActivity(new Intent(MainActivity.this,May.class));
//                break;
//            case "06":                 startActivity(new Intent(MainActivity.this,June.class));
//                break;
//            case "07":                 startActivity(new Intent(MainActivity.this,July.class));
//                break;
//            case "08":                 startActivity(new Intent(MainActivity.this,August.class));
//                break;
//            case "09":                 startActivity(new Intent(MainActivity.this,September.class));
//                break;
//            case "10":                 startActivity(new Intent(MainActivity.this,October.class));
//                break;
//            case "11":                 startActivity(new Intent(MainActivity.this,November.class));
//                break;
//            case "12":                 startActivity(new Intent(MainActivity.this,December.class));
//                break;
//        }
//
//
//
//        jan = findViewById(R.id.jan);
//
//        jan.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
////            public void onSwipeTop() {
////                Toast.makeText(MainActivity.this, "top", Toast.LENGTH_SHORT).show();
////
////            }
////            public void onSwipeBottom() {
////                Toast.makeText(MainActivity.this, "bottom", Toast.LENGTH_SHORT).show();
////            }
//
//
//            public void onSwipeRight() {
//               // Toast.makeText(MainActivity.this, "right", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this, December.class);
//                startActivity(intent);
//                Animatoo.animateSwipeRight(MainActivity.this);
//
//                finish();
//
//            }
//
//            public void onSwipeLeft() {
//                //Toast.makeText(MainActivity.this, "left", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this, February.class);
//                startActivity(intent);
//                Animatoo.animateSwipeLeft(MainActivity.this);
//
//                finish();
//
//            }
//
//
//        });

    }

}
