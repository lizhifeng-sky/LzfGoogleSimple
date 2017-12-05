package com.google.simple.view.adapter;

import android.support.annotation.LayoutRes;

/**
 *
 * @author lizhifeng
 * @date 2017/12/5 0005
 */

public interface BindingAdapterType {
    @LayoutRes int getType();
    int getId();
}
