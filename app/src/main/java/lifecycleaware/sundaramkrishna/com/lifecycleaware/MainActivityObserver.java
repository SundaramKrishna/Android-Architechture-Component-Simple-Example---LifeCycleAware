package lifecycleaware.sundaramkrishna.com.lifecycleaware;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;


/**
 * This is observer class created for observing changes
 * created by sundaram.k on 11-10-2018
 */

public class MainActivityObserver implements LifecycleObserver {
    private static final String TAG = "MainActivityObserver";


    /**
     * Here onEventCreated is user defined function name. you can use whatever you want
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onEventCreated(){
        System.out.println("MainActivityObserver.onEventCreated");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onEventStarted(){
        System.out.println("MainActivityObserver.onEventStarted");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onEventOnResume(){
        System.out.println("MainActivityObserver.onEventOnResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onEventOnPause(){
        System.out.println("MainActivityObserver.onEventOnPause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onEventStop(){
        System.out.println("MainActivityObserver.onEventStop");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onEventDestroy(){
        System.out.println("MainActivityObserver.onEventDestroy");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public void onEventAny(){
        System.out.println("MainActivityObserver.onEventAny");
    }

}
