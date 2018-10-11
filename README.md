# Android Architechture Components - Simple Lifecycle aware 

Lifecycle-aware components perform actions in response to a change in the lifecycle status of another component, such as activities and fragments. These components help you produce better-organized, and often lighter-weight code, that is easier to maintain.

In ```app.gradle```

change the following

```
   def lifecycle_version = "1.1.1"
    implementation "android.arch.lifecycle:extensions:$lifecycle_version"
    annotationProcessor "android.arch.lifecycle:compiler:$lifecycle_version"
```

In Activity or Fragment add following line

```
  // Life cycler obeserver registered here
        getLifecycle().addObserver(new MainActivityObserver());
```


To create LifeCycle Observer implement a class with ```LifecycleObserver```

For Example
```
public class AnyClass implements LifecycleObserver {
    
}
```

That's all. Run this sample you will get output like below in ```logcat```

```
lifecycleaware.sundaramkrishna.com.lifecycleaware I/System.out: MainActivity.onCreate
lifecycleaware.sundaramkrishna.com.lifecycleaware I/System.out: MainActivityObserver.onEventCreated
lifecycleaware.sundaramkrishna.com.lifecycleaware I/System.out: MainActivityObserver.onEventAny
lifecycleaware.sundaramkrishna.com.lifecycleaware I/System.out: MainActivity.onStart
lifecycleaware.sundaramkrishna.com.lifecycleaware I/System.out: MainActivityObserver.onEventStarted
lifecycleaware.sundaramkrishna.com.lifecycleaware I/System.out: MainActivityObserver.onEventAny
lifecycleaware.sundaramkrishna.com.lifecycleaware I/System.out: MainActivity.onResume
lifecycleaware.sundaramkrishna.com.lifecycleaware I/System.out: MainActivityObserver.onEventOnResume
lifecycleaware.sundaramkrishna.com.lifecycleaware I/System.out: MainActivityObserver.onEventAny
```

Happy Coding....







  
