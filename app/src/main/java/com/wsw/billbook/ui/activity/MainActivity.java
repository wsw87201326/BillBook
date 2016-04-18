package com.wsw.billbook.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.wsw.billbook.R;
import com.wsw.billbook.bean.ItemTitleType;
import com.wsw.billbook.bean.ListDealAndTitle;
import com.wsw.billbook.bean.ShowType;
import com.wsw.billbook.ui.adapter.BillListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.recycler)
    RecyclerView recycler;

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

        List<ListDealAndTitle> listDealAndTitles = new ArrayList<>();
        ListDealAndTitle title = new ListDealAndTitle(ShowType.HEAD, ItemTitleType.TITLE_TYPE,2016,4,0,2000,3000);
        ListDealAndTitle item1 = new ListDealAndTitle(ShowType.NORMAL,ItemTitleType.ITEM_TYPE,2016,4,15,3000,200);
        ListDealAndTitle item2 = new ListDealAndTitle(ShowType.BOTTOM,ItemTitleType.ITEM_TYPE,2016,4,13,0,2800);

        listDealAndTitles.add(title);
        listDealAndTitles.add(item1);
        listDealAndTitles.add(item2);
        billListAdapter.setBillList(listDealAndTitles);
    }

    private void initViews() {
        setSupportActionBar(toolbar);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setHasFixedSize(true);
        recycler.setItemAnimator(new DefaultItemAnimator());
        billListAdapter =new BillListAdapter(this);
        recycler.setAdapter(billListAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
