package com.google.simple.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.simple.R;
import com.google.simple.databinding.ActivityTextBinding;

import lzf.common.base.BaseActivity;


public class TextActivity extends BaseActivity {

    private ActivityTextBinding activityTextBinding;
    @Override
    public int getLayout() {
        return R.layout.activity_text;
    }

    @Override
    public void initVariable() {
        super.initVariable();

    }
}
