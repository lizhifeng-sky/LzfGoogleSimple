package com.google.simple.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.simple.R;
import com.google.simple.databinding.ActivityTextBinding;


public class TextActivity extends AppCompatActivity {
    private ActivityTextBinding activityTextBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityTextBinding= DataBindingUtil.setContentView(this,R.layout.activity_text);
        activityTextBinding.setTitle1("事件绑定1");
        activityTextBinding.setTitle2("事件绑定2");
        activityTextBinding.setTitle3("事件绑定3");
        activityTextBinding.setTitle4("change ok");

        activityTextBinding.setEvent(new EventListener() {
            @Override
            public void click1(View v) {
                activityTextBinding.setTitle1("事件1方法调用");
            }

            @Override
            public void click2(View v) {
                activityTextBinding.setTitle2("事件2方法调用");
            }

            @Override
            public void cilck3(String s) {
                activityTextBinding.setTitle3(s);
            }
        });
    }
}
