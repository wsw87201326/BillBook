package com.wsw.billbook.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import com.wsw.billbook.R;
import com.wsw.billbook.ui.adapter.BillListAdapter;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    BillListAdapter billListAdapter;
//    @Inject BillPresenter billPresenter;

    public static void start(Context context) {
        Intent starter = new Intent(context, MainActivity.class);
        context.startActivity(starter);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initViews();
        initPresenter();
    }

    private void initPresenter() {
        //模拟数据获取到了

    }

    private void initViews() {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
