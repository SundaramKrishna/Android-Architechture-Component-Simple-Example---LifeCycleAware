package lifecycleaware.sundaramkrishna.com.lifecycleaware;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Any activity or Fragment is set to be Lifecycle owner.
 * created by sundaram.k on 11-10-2018
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Life cycler obeserver registered here
        getLifecycle().addObserver(new MainActivityObserver());

        System.out.println("MainActivity.onCreate");
    }


    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("MainActivity.onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("MainActivity.onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("MainActivity.onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("MainActivity.onDestroy");
    }

}
