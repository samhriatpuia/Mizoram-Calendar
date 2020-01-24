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

public class February extends AppCompatActivity {

    LinearLayout feb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        setContentView(R.layout.activity_february);


        feb = findViewById(R.id.feb);

        feb.setOnTouchListener(new OnSwipeTouchListener(February.this) {

            public void onSwipeRight() {
              //  Toast.makeText(February.this, "right", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(February.this, MainActivity.class);
                intent.putExtra("february","1");

                startActivity(intent);
                Animatoo.animateSwipeRight(February.this);

                finish();

            }

            public void onSwipeLeft() {
              //  Toast.makeText(February.this, "left", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(February.this, March.class);
                startActivity(intent);
                Animatoo.animateSwipeLeft(February.this);

                finish();

            }


        });

    }

}
