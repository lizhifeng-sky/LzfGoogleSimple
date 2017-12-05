package com.google.simple.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.simple.databinding.UserItemBinding;
import com.google.simple.model.UserInfo;

import java.util.List;

/**
 * Created by lizhifeng on 2017/12/1 0001.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;
    private LayoutInflater layoutInflater;
    private int layoutId;
    private int variableId;
    private List<UserInfo> list;

    public MyAdapter(Context context, int layoutId, int variableId, List<UserInfo> list) {
        this.context = context;
        this.layoutId = layoutId;
        this.variableId = variableId;
        this.list = list;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        UserItemBinding userItemBinding = DataBindingUtil.inflate(layoutInflater, layoutId, parent, false);

        return new MyViewHolder(userItemBinding);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.userItemBinding.setVariable(list.get(position).getId(),list.get(position));
        holder.userItemBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        UserItemBinding userItemBinding;

        public MyViewHolder(UserItemBinding binding) {
            super(binding.getRoot());
            this.userItemBinding = binding;
        }
    }
}
