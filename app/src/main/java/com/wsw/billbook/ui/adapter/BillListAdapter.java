package com.wsw.billbook.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wsw.billbook.R;
import com.wsw.billbook.bean.ListDealAndTitle;
import com.wsw.billbook.ui.view.CustomItem;
import com.wsw.billbook.ui.view.CustomTitle;

import java.util.ArrayList;
import java.util.List;

public class BillListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int ONLY_ONE = 1;
    private static final int HEAD = 2;
    private static final int BOTTOM = 3;
    private static final int NORMAL = 4;
    private static final int TITLE_TYPE_SHOW = 0x01;
    private static final int ITEM_TYPE_SHOW = 0x02;

    List<ListDealAndTitle> listDealAndTitles = new ArrayList<>();

    private final Context context;

    public BillListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TITLE_TYPE_SHOW) {
            return new BillListTitleViewHolder(LayoutInflater.from(context).inflate(R.layout.title_bill, parent, false));
        } else {
            return new BillListItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item_bill, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //获取数据
        ListDealAndTitle listDealAndTitle = listDealAndTitles.get(position);
        int item_time = listDealAndTitle.getDay();
        String title_time = listDealAndTitle.getYear() + "." + listDealAndTitle.getMouth();
        double inMoney = listDealAndTitle.getInMoney();
        double outMoney = listDealAndTitle.getOutMoney();

        if (holder instanceof BillListItemViewHolder) {
            BillListItemViewHolder billListItemViewHolder = (BillListItemViewHolder) holder;
            billListItemViewHolder.customItem.initData(listDealAndTitle.getShowType(), inMoney, outMoney, item_time);
        } else if (holder instanceof BillListTitleViewHolder) {
            BillListTitleViewHolder billListTitleViewHolder = (BillListTitleViewHolder) holder;
            billListTitleViewHolder.customTitle.initData(title_time, inMoney, outMoney);
        }

    }

    @Override
    public int getItemViewType(int position) {
        switch (listDealAndTitles.get(position).getItemTitleType()) {
            case TITLE_TYPE:
                return TITLE_TYPE_SHOW;
            case ITEM_TYPE:
                return ITEM_TYPE_SHOW;
        }
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return listDealAndTitles == null ? 0 : listDealAndTitles.size();
    }

    public class BillListItemViewHolder extends RecyclerView.ViewHolder {
        public CustomItem customItem;

        public BillListItemViewHolder(View itemView) {
            super(itemView);
            this.customItem = (CustomItem) itemView;
        }
    }

    public class BillListTitleViewHolder extends RecyclerView.ViewHolder {
        public CustomTitle customTitle;

        public BillListTitleViewHolder(View itemView) {
            super(itemView);
            this.customTitle = (CustomTitle) itemView;
        }
    }

    public void setBillList(List<ListDealAndTitle> list) {
        int positionStart = listDealAndTitles.size();
        listDealAndTitles.addAll(list);
        notifyItemRangeInserted(positionStart, list.size());
    }

    public void changeBillListItem(ListDealAndTitle listDealAndTitle, int postion) {

    }

    public void removeBillListItem() {

    }
}
