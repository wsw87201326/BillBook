package com.wsw.billbook.mvp.view;

/**
 * Created by wsw on 2016/3/29.
 */
public interface IBaseView {

    /**
     * 显示加载界面
     */
    void showLoadingView();

    /**
     * 隐藏加载界面
     */
    void hideLoadingView();

    /**
     * 显示内容界面
     */
    void showContentView();

    /**
     * 隐藏内容界面
     */
    void hideContentView();

    /**
     * 显示错误界面
     *
     */
    void showErrorView();

    /**
     * 隐藏错误界面
     */
    void hideErrorView();
}
