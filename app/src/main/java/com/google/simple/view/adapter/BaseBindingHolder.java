package com.google.simple.view.adapter;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 *
 * @author lizhifeng
 * @date 2017/12/5 0005
 */

class BaseBindingHolder extends RecyclerView.ViewHolder {
    private ViewDataBinding dataBinding;
    BaseBindingHolder(ViewDataBinding dataBinding) {
        super(dataBinding.getRoot());
        this.dataBinding=dataBinding;
    }
    void setVariable(int id, Object value){
        dataBinding.setVariable(id,value);
        dataBinding.executePendingBindings();
    }

    ViewDataBinding getBinding(){
        return dataBinding;
    }
}
