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

public class December extends AppCompatActivity {
 LinearLayout december;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        setContentView(R.layout.activity_december);

        december = findViewById(R.id.december);

        december.setOnTouchListener(new OnSwipeTouchListener(December.this) {

            public void onSwipeRight() {
               // Toast.makeText(December.this, "right", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(December.this, November.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(December.this);

                finish();

            }

            public void onSwipeLeft() {
               // Toast.makeText(December.this, "left", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(December.this, MainActivity.class);
                intent.putExtra("december","1");
                startActivity(intent);
                Animatoo.animateSwipeLeft(December.this);

                finish();

            }


        });
    }
}
