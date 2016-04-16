package com.wsw.billbook.ui.activity;

/**
 * Create By :wsw
 * 2016-02-17 16:07
 */
public interface IBaseActivity {
    /**
     * 初始化Presenter
     */
    void initPresenter();

    /**
     * 显示问题界面
     */
    void showQuestion();


    /**
     * 初始化Dagger2的依赖
     */
    void initializeDependencyInjector();

    /**
     * 初始化界面
     */
    void initContentView();

    /**
     * 初始化ButterKnife
     */
    void initButterKnife();

    /**
     * 初始化标题栏
     */
    void initToolbar();

    /**
     * 初始化界面
     */
    void initView();

}
