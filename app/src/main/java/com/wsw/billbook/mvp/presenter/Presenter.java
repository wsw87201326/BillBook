/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.wsw.billbook.mvp.presenter;


import com.wsw.billbook.mvp.view.IBaseView;

public interface Presenter {

    void onStart();

    void onStop();

    void onPause();

    void attachView(IBaseView v);

    void onCreate();
}
