package com.google.simple.model.wrapper;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.simple.BR;
import com.google.simple.R;
import com.google.simple.model.UserInfo;

/**
 * @author lizhifeng
 * @date 2017/12/11 0011
 */

public class UserItemWrapper implements LayoutWrapper<UserInfo> {
    private UserInfo userInfo;

    @Override
    public UserItemWrapper setTarget(UserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    @Override
    public UserInfo getTarget() {
        return userInfo;
    }

    @Override
    public int getType() {
        return R.layout.user_item;
    }

    @Override
    public int getId() {
        return BR.user;
    }

    @BindingAdapter("avator")
    public static void setUserInfoAvtor(ImageView imageView, String avator) {
        Glide.with(imageView.getContext()).load(avator).into(imageView);
    }

    public void clickParent(View view) {
        Toast.makeText(view.getContext(), "福步距", Toast.LENGTH_SHORT).show();
    }

    public void clickImage(View view) {
        Toast.makeText(view.getContext(), "ImageView", Toast.LENGTH_SHORT).show();
    }
}
