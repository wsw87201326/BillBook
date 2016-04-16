package com.wsw.billbook.injector.components;

import com.wsw.billbook.injector.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wsw on 2016/3/29.
 */
@Singleton
@Component(dependencies = AppModule.class)
public interface AppComponent {

}
