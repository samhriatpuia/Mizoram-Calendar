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

public class September extends AppCompatActivity {

    LinearLayout september;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        setContentView(R.layout.activity_september);


        september = findViewById(R.id.september);

        september.setOnTouchListener(new OnSwipeTouchListener(September.this) {

            public void onSwipeRight() {
            //    Toast.makeText(September.this, "right", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(September.this, August.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(September.this);

                finish();

            }

            public void onSwipeLeft() {
              //  Toast.makeText(September.this, "left", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(September.this, October.class);
                startActivity(intent);
                Animatoo.animateSwipeLeft(September.this);

                finish();

            }


        });

    }

}
