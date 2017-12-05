package com.google.simple.model;

import lzf.common.bean.BaseRequestMode;
import lzf.common.bean.UserBean;
import lzf.common.network.ScheduleTransformer;
import rx.Observable;

/**
 *
 * @author lizhifeng
 * @date 2017/11/30 0030
 */

class NetworkProvider extends BaseModel{
    private static NetworkProvider modelProvider =new NetworkProvider();
    static NetworkProvider getInstance(){
        if (modelProvider ==null){
            synchronized (NetworkProvider.class){
                if (modelProvider ==null){
                    modelProvider =new NetworkProvider();
                }
            }
        }
        return modelProvider;
    }

    Observable<BaseRequestMode<UserBean>> doLogin(String email,
                                                  String pwd) {
        return apiService.doLogin(email,pwd).compose(new ScheduleTransformer<>());
    }
}
