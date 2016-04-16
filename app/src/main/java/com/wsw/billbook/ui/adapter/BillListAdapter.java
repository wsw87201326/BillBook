package com.wsw.billbook.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wsw.billbook.R;
import com.wsw.billbook.bean.DealItem;
import com.wsw.billbook.bean.ListDealAndTitle;
import com.wsw.billbook.ui.view.CustomItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wsw on 2016/3/29.
 */
public class BillListAdapter extends RecyclerView.Adapter<BillListAdapter.BillListViewHolder> {
    private static final int ONLY_ONE = 1;
    private static final int HEAD = 2;
    private static final int BOTTOM = 3;
    private static final int NORMAL = 4;
    List<ListDealAndTitle> listDealAndTitles = new ArrayList<>();
    private final Context context;

    public BillListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public BillListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BillListViewHolder(LayoutInflater.from(context).inflate(R.layout.item_bill, parent, false));
    }

    @Override
    public void onBindViewHolder(BillListViewHolder holder, int position) {
        DealItem dealItem = listDealAndTitles.get(position);

    }

    @Override
    public int getItemCount() {
        return listDealAndTitles == null ? 0 : listDealAndTitles.size();
    }

    public class BillListViewHolder extends RecyclerView.ViewHolder {
        public CustomItem customItem;

        public BillListViewHolder(View itemView) {
            super(itemView);
            this.customItem = (CustomItem) itemView;
        }
    }
}
