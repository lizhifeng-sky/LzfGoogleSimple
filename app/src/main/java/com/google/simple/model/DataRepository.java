package com.google.simple.model;

import android.arch.lifecycle.MediatorLiveData;

import lzf.common.bean.UserBean;
import lzf.common.network.CustomObserver;

/**
 *
 * @author lizhifeng
 * @date 2017/11/30 0030
 */

public class DataRepository {
    private static NetworkProvider networkProvider= NetworkProvider.getInstance();
    private static DataRepository sInstance;
    public static DataRepository getInstance() {
        if (sInstance == null) {
            synchronized (DataRepository.class) {
                if (sInstance == null) {
                    sInstance = new DataRepository();
                }
            }
        }
        return sInstance;
    }
    public void login(MediatorLiveData<UserBean> userBeanMediatorLiveData,
                      String name,
                      String pass) {
        networkProvider.doLogin(name, pass).subscribe(new CustomObserver<UserBean>() {
            @Override
            public void onSuccess(UserBean userBean) {
                userBeanMediatorLiveData.setValue(userBean);
            }
        });
    }
}
