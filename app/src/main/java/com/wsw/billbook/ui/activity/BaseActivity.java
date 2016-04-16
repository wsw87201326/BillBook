package com.wsw.billbook.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wsw.billbook.mvp.view.IBaseView;

/**
 * Created by wsw on 2016/3/29.
 */
public abstract class BaseActivity extends AppCompatActivity implements IBaseView,IBaseActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeActivityInjector();
        initializeDependencyInjector();
        initContentView();
        initButterKnife();
        initToolbar();
        initView();
        initPresenter();
    }

    private void initializeActivityInjector() {
        // TODO: 2016/3/29 获取依赖等...
    }


    // TODO: 2016/3/29 暂时先让BaseActivity实现方法防止报错,以后再让各个界面各自实现逻辑
    @Override
    public void showLoadingView() {

    }

    @Override
    public void hideLoadingView() {

    }

    @Override
    public void showContentView() {

    }

    @Override
    public void hideContentView() {

    }

    @Override
    public void showErrorView() {

    }

    @Override
    public void hideErrorView() {

    }
}
