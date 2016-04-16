package com.wsw.billbook.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wsw.billbook.R;
import com.wsw.billbook.bean.ListDeal;
import com.wsw.billbook.bean.ShowType;
import com.wsw.billbook.ui.view.DealItem;

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
    List<ListDeal> listDeals = new ArrayList<>();
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
        ListDeal listDeal = listDeals.get(position);

        if (listDeals.size() == 1) { //只有一项时
            holder.dealItem.setShowType(ShowType.ONLY_ONE);
        } else if (position == 0) {//为头部
            holder.dealItem.setShowType(ShowType.HEAD);
        } else if (position == listDeals.size() - 1){//为尾部时
            holder.dealItem.setShowType(ShowType.BOTTOM);
        }else{//普通视图
            holder.dealItem.setShowType(ShowType.NORMAL);
        }

        holder.dealItem.setMoney(listDeal.getMoney(),listDeal.getPayEvent());
        holder.dealItem.setTime(listDeal.getDate());
    }

    @Override
    public int getItemCount() {
        return listDeals == null ? 0 : listDeals.size();
    }

    public class BillListViewHolder extends RecyclerView.ViewHolder {
        public DealItem dealItem;

        public BillListViewHolder(View itemView) {
            super(itemView);
            this.dealItem = (DealItem) itemView;
        }
    }
}
