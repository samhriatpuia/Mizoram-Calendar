package org.msegs.mizoramCalendar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class April extends AppCompatActivity {

    LinearLayout apr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        setContentView(R.layout.activity_april);


        apr = findViewById(R.id.april);

        apr.setOnTouchListener(new OnSwipeTouchListener(April.this) {


            public void onSwipeRight() {
               // Toast.makeText(April.this, "right", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(April.this, March.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(April.this);

                finish();
            }

            public void onSwipeLeft() {
                //Toast.makeText(April.this, "left", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(April.this, May.class);
                startActivity(intent);
                Animatoo.animateSwipeLeft(April.this);


                finish();

            }


        });

    }

}
