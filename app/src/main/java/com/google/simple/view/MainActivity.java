package com.google.simple.view;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;

import com.google.simple.R;
import com.google.simple.databinding.ActivityMainBinding;
import com.google.simple.view.adapter.MultipleBindingAdapter;
import com.google.simple.viewmodel.UserViewModel;

/**
 * @author Administrator
 */
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.activity_main, null, false);
        setContentView(mBinding.getRoot());
        UserViewModel userViewModel = ViewModelProviders.of(MainActivity.this).get(UserViewModel.class);
        mBinding.setClick(() -> userViewModel.getUser().observe(MainActivity.this, userBean -> {
            if (userBean != null) {
                mBinding.text.setText(userBean.toString());
                if (mBinding.recycler.getVisibility() == View.GONE) {
                    mBinding.recycler.setVisibility(View.VISIBLE);
                }
            }
            mBinding.executePendingBindings();
        }));
        userViewModel.getUserList().observe(this, userInfoList -> {
            if (userInfoList!=null) {
                mBinding.recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                mBinding.recycler.setAdapter(new MultipleBindingAdapter(userInfoList,MainActivity.this));
            }
            mBinding.executePendingBindings();
        });

    }
}
