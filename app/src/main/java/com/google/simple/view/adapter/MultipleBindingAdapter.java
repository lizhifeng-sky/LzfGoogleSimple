package com.google.simple.view.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.google.simple.model.wrapper.LayoutWrapper;

import java.util.List;

/**
 *
 * @author lizhifeng
 * @date 2017/12/5 0005
 */

public  class MultipleBindingAdapter extends RecyclerView.Adapter<BaseBindingHolder> {
    private List<? extends LayoutWrapper> data;
    private Context context;

    public MultipleBindingAdapter(List<? extends LayoutWrapper> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public BaseBindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding viewDataBinding= DataBindingUtil.inflate(LayoutInflater.from(context), viewType, parent, false);
        return new BaseBindingHolder(viewDataBinding);
    }

    @Override
    public void onBindViewHolder(BaseBindingHolder holder, int position) {
        holder.setVariable(data.get(position).getId(),data.get(position));
        Log.e("viewData",holder.getBinding().toString());
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    @Override
    public int getItemViewType(int position) {
        return data.get(position).getType();
    }
}
