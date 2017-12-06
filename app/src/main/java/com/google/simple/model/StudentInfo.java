package com.google.simple.model;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.simple.BR;
import com.google.simple.R;
import com.google.simple.view.adapter.BindingAdapterType;

/**
 * Created by lizhifeng on 2017/12/5 0005.
 */

public class StudentInfo implements BindingAdapterType{
    private String name;
    private String age;
    private String avator;

    public StudentInfo(String name, String age, String avator) {
        this.name = name;
        this.age = age;
        this.avator = avator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }

    @BindingAdapter("avator")
    public static void setUserInfoAvtor(ImageView imageView, String avator) {
        Glide.with(imageView.getContext()).load(avator).into(imageView);
    }

    public void clickParent(View view) {
        Toast.makeText(view.getContext(), "学生 福步距", Toast.LENGTH_SHORT).show();
    }

    public void clickImage(View view) {
        Toast.makeText(view.getContext(), "学生 ImageView", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getType() {
        return R.layout.student_item;
    }

    @Override
    public int getId(){
        return BR.student;
    }
}
