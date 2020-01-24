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

public class October extends AppCompatActivity {

    LinearLayout oct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        setContentView(R.layout.activity_october);


        oct = findViewById(R.id.october);

        oct.setOnTouchListener(new OnSwipeTouchListener(October.this) {



            public void onSwipeRight() {
          //      Toast.makeText(October.this, "right", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(October.this, September.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(October.this);

                finish();

            }

            public void onSwipeLeft() {
              //  Toast.makeText(October.this, "left", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(October.this, November.class);
                startActivity(intent);
                Animatoo.animateSwipeLeft(October.this);

                finish();

            }


        });

    }

}
