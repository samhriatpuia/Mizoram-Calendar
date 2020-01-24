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

public class May extends AppCompatActivity {

    LinearLayout may;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        setContentView(R.layout.activity_may);


        may = findViewById(R.id.may);

        may.setOnTouchListener(new OnSwipeTouchListener(May.this) {
//            public void onSwipeTop() {
//                Toast.makeText(MainActivity.this, "top", Toast.LENGTH_SHORT).show();
//
//            }
//            public void onSwipeBottom() {
//                Toast.makeText(MainActivity.this, "bottom", Toast.LENGTH_SHORT).show();
//            }


            public void onSwipeRight() {
             //   Toast.makeText(May.this, "right", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(May.this, April.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(May.this);

                finish();

            }

            public void onSwipeLeft() {
              //  Toast.makeText(May.this, "left", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(May.this, June.class);
                startActivity(intent);
                Animatoo.animateSwipeLeft(May.this);

                finish();

            }


        });

    }

}
