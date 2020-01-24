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


public class August extends AppCompatActivity {

    LinearLayout august;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        setContentView(R.layout.activity_august);


        august = findViewById(R.id.august);

        august.setOnTouchListener(new OnSwipeTouchListener(August.this) {

            public void onSwipeRight() {
                //Toast.makeText(August.this, "right", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(August.this, July.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(August.this);

                finish();

            }

            public void onSwipeLeft() {
               // Toast.makeText(August.this, "left", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(August.this, September.class);
                startActivity(intent);
                Animatoo.animateSwipeLeft(August.this);

                finish();

            }


        });

    }

}