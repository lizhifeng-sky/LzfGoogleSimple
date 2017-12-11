package com.google.simple.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MediatorLiveData;
import android.support.annotation.NonNull;

import com.google.simple.model.DataRepository;
import com.google.simple.model.StudentInfo;
import com.google.simple.model.UserInfo;
import com.google.simple.model.wrapper.LayoutWrapper;
import com.google.simple.model.wrapper.StudentItemWrapper;
import com.google.simple.model.wrapper.UserItemWrapper;

import java.util.ArrayList;
import java.util.List;

import lzf.common.bean.UserBean;

/**
 * @author lizhifeng
 * @date 2017/11/30 0030
 */

public class UserViewModel extends AndroidViewModel {
    private MediatorLiveData<UserBean> userBeanMediatorLiveData;

    public UserViewModel(@NonNull Application application) {
        super(application);
        userBeanMediatorLiveData = new MediatorLiveData<>();
    }

    public LiveData<UserBean> getUser() {
        /*
         *dataRepository 主要目的是封装网络请求 便于扩展其他数据来源
         * */
        DataRepository.getInstance().login(userBeanMediatorLiveData,
                "15824857592",
                "888888");
        return userBeanMediatorLiveData;
    }

    public LiveData<List<LayoutWrapper>> getUserList() {
        /*
         *dataRepository 主要目的是封装网络请求 便于扩展其他数据来源
         * */
        List<LayoutWrapper> list = new ArrayList<>();
        list.add(new UserItemWrapper().setTarget(new UserInfo("张三", "23", "http://new.antwk.com/drive//avatar/2017-11-28/ace25ba2-182a-4421-8d07-9f453394f4c3.jpg")));
        list.add(new StudentItemWrapper().setTarget(new StudentInfo("xuesheng 张三", " xuesheng 28", "http://blog.zhaiyifan.cn/uploads/wechat-public-qcode.jpg")));
        list.add(new UserItemWrapper().setTarget(new UserInfo("张三", "23", "http://new.antwk.com/drive//avatar/2017-11-28/ace25ba2-182a-4421-8d07-9f453394f4c3.jpg")));
        list.add(new StudentItemWrapper().setTarget(new StudentInfo("xuesheng 张三", " xuesheng 28", "http://blog.zhaiyifan.cn/uploads/wechat-public-qcode.jpg")));
        list.add(new UserItemWrapper().setTarget(new UserInfo("张三", "23", "http://new.antwk.com/drive//avatar/2017-11-28/ace25ba2-182a-4421-8d07-9f453394f4c3.jpg")));
        list.add(new StudentItemWrapper().setTarget(new StudentInfo("xuesheng 张三", " xuesheng 28", "http://blog.zhaiyifan.cn/uploads/wechat-public-qcode.jpg")));
        list.add(new UserItemWrapper().setTarget(new UserInfo("张三", "23", "http://new.antwk.com/drive//avatar/2017-11-28/ace25ba2-182a-4421-8d07-9f453394f4c3.jpg")));
        list.add(new StudentItemWrapper().setTarget(new StudentInfo("xuesheng 张三", " xuesheng 28", "http://blog.zhaiyifan.cn/uploads/wechat-public-qcode.jpg")));
        list.add(new UserItemWrapper().setTarget(new UserInfo("张三", "23", "http://new.antwk.com/drive//avatar/2017-11-28/ace25ba2-182a-4421-8d07-9f453394f4c3.jpg")));
        list.add(new StudentItemWrapper().setTarget(new StudentInfo("xuesheng 张三", " xuesheng 28", "http://blog.zhaiyifan.cn/uploads/wechat-public-qcode.jpg")));
        list.add(new UserItemWrapper().setTarget(new UserInfo("张三", "23", "http://new.antwk.com/drive//avatar/2017-11-28/ace25ba2-182a-4421-8d07-9f453394f4c3.jpg")));
        list.add(new StudentItemWrapper().setTarget(new StudentInfo("xuesheng 张三", " xuesheng 28", "http://blog.zhaiyifan.cn/uploads/wechat-public-qcode.jpg")));
        list.add(new UserItemWrapper().setTarget(new UserInfo("张三", "23", "http://new.antwk.com/drive//avatar/2017-11-28/ace25ba2-182a-4421-8d07-9f453394f4c3.jpg")));
        list.add(new StudentItemWrapper().setTarget(new StudentInfo("xuesheng 张三", " xuesheng 28", "http://blog.zhaiyifan.cn/uploads/wechat-public-qcode.jpg")));
        list.add(new UserItemWrapper().setTarget(new UserInfo("张三", "23", "http://new.antwk.com/drive//avatar/2017-11-28/ace25ba2-182a-4421-8d07-9f453394f4c3.jpg")));
        list.add(new StudentItemWrapper().setTarget(new StudentInfo("xuesheng 张三", " xuesheng 28", "http://blog.zhaiyifan.cn/uploads/wechat-public-qcode.jpg")));
        list.add(new UserItemWrapper().setTarget(new UserInfo("张三", "23", "http://new.antwk.com/drive//avatar/2017-11-28/ace25ba2-182a-4421-8d07-9f453394f4c3.jpg")));
        list.add(new StudentItemWrapper().setTarget(new StudentInfo("xuesheng 张三", " xuesheng 28", "http://blog.zhaiyifan.cn/uploads/wechat-public-qcode.jpg")));
        list.add(new UserItemWrapper().setTarget(new UserInfo("张三", "23", "http://new.antwk.com/drive//avatar/2017-11-28/ace25ba2-182a-4421-8d07-9f453394f4c3.jpg")));
        list.add(new StudentItemWrapper().setTarget(new StudentInfo("xuesheng 张三", " xuesheng 28", "http://blog.zhaiyifan.cn/uploads/wechat-public-qcode.jpg")));
        list.add(new UserItemWrapper().setTarget(new UserInfo("张三", "23", "http://new.antwk.com/drive//avatar/2017-11-28/ace25ba2-182a-4421-8d07-9f453394f4c3.jpg")));

        MediatorLiveData<List<LayoutWrapper>> mediatorLiveData = new MediatorLiveData<>();
        mediatorLiveData.setValue(list);
        return mediatorLiveData;
    }
}
