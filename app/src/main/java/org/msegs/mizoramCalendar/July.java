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

public class July extends AppCompatActivity {

    LinearLayout july;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        setContentView(R.layout.activity_july);


        july = findViewById(R.id.july);

        july.setOnTouchListener(new OnSwipeTouchListener(July.this) {

            public void onSwipeRight() {
          //      Toast.makeText(July.this, "right", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(July.this, June.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(July.this);

                finish();

            }

            public void onSwipeLeft() {
               // Toast.makeText(July.this, "left", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(July.this, August.class);
                startActivity(intent);
                Animatoo.animateSwipeLeft(July.this);

                finish();

            }


        });

    }

}
