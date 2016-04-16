package com.wsw.billbook.injector.modules;

import com.wsw.billbook.BillBookApplication;

import dagger.Module;

/**
 * Created by wsw on 2016/3/29.
 */
@Module
public class AppModule {

    private final BillBookApplication mBillBookApplication;

    public AppModule(BillBookApplication billBookApplication) {
        this.mBillBookApplication = billBookApplication;
    }

    // TODO: 2016/3/29 提供数据库

}
