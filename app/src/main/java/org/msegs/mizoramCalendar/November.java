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

public class November extends AppCompatActivity {

    LinearLayout november;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        setContentView(R.layout.activity_november);

        november = findViewById(R.id.november);

        november.setOnTouchListener(new OnSwipeTouchListener(November.this) {


            public void onSwipeRight() {
               // Toast.makeText(November.this, "right", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(November.this, October.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(November.this);

                finish();

            }

            public void onSwipeLeft() {
               // Toast.makeText(November.this, "left", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(November.this, December.class);
                startActivity(intent);
                Animatoo.animateSwipeLeft(November.this);

                finish();

            }


        });
    }
}
