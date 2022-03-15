package tp.alibouche.pizzarecipes;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    //private ImageView icon;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //icon = findViewById(R.id.logo);

        //Animation aniRotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim);
        //icon.startAnimation(aniRotate);





        Thread t1 = new Thread(){
            public void run(){
                try {
                    sleep(2000);
                    Intent intent = new Intent(SplashActivity.this, ListPizzaActivity.class);
                    startActivity(intent);
                    SplashActivity.this.finish();
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
    }

    //protected void onPause() {
       // super.onPause();
        //this.finish();
   // }
}
