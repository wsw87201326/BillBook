package com.wsw.billbook;

import android.app.Application;

import com.wsw.billbook.injector.components.AppComponent;
import com.wsw.billbook.injector.components.DaggerAppComponent;
import com.wsw.billbook.injector.modules.AppModule;

/**
 * Created by wsw on 2016/3/29.
 */
public class BillBookApplication extends Application{

    AppComponent mAppComponent  ;
    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

}
