package com.google.simple.view.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 *
 * @author lizhifeng
 * @date 2017/12/5 0005
 */
@Deprecated
public abstract class BaseBindingAdapter<DATA,BIND extends ViewDataBinding> extends RecyclerView.Adapter<BaseBindingHolder> {
    private List<DATA> data;
    private Context context;
    private int layoutId;
    protected BIND dataBinding;

    protected BaseBindingAdapter(List<DATA> data, Context context, @LayoutRes int layoutId) {
        this.data = data;
        this.context = context;
        this.layoutId = layoutId;
    }

    @Override
    public BaseBindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        dataBinding=DataBindingUtil.inflate(LayoutInflater.from(context),layoutId,parent,false);
        return new BaseBindingHolder(dataBinding);
    }

    @Override
    public void onBindViewHolder(BaseBindingHolder holder, int position) {
        setModel(data.get(position));
        dataBinding.executePendingBindings();
    }

    /**
     * @param data 加载item
     */
    protected abstract void setModel(DATA data);

    @Override
    public int getItemCount() {
        return data==null?0:data.size();
    }
}
