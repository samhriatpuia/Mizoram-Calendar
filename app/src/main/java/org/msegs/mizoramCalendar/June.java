package org.msegs.mizoramCalendar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class June extends AppCompatActivity {

    LinearLayout june;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        setContentView(R.layout.activity_june);


        june = findViewById(R.id.june);

        june.setOnTouchListener(new OnSwipeTouchListener(June.this) {



            public void onSwipeRight() {
              //  Toast.makeText(June.this, "right", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(June.this, May.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(June.this);

                finish();

            }

            public void onSwipeLeft() {
               // Toast.makeText(June.this, "left", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(June.this,  July.class);
                startActivity(intent);
                Animatoo.animateSwipeLeft(June.this);

                finish();

            }


        });

    }

}
