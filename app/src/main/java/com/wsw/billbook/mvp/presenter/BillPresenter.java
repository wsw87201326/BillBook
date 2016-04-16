package com.wsw.billbook.mvp.presenter;

import com.wsw.billbook.injector.Activity;
import com.wsw.billbook.mvp.view.IBaseView;

import javax.inject.Inject;

/**
 * Created by wsw on 2016/3/29.
 */
@Activity
public class BillPresenter implements Presenter {

    @Inject
    public BillPresenter() {
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void attachView(IBaseView v) {

    }

    @Override
    public void onCreate() {

    }
}
