package lzf.common.network;

import lzf.common.bean.BaseRequestMode;
import rx.Observable;
import rx.functions.Func1;

/**
 * Created by Administrator on 2017/8/28 0028.
 */
public class RetrofitProxy {
    public static <T> Observable<T> getData(Observable<BaseRequestMode<T>> observable, CustomSubscriber<T> customSubscriber) {
        if (observable != null) {
            observable
                    .compose(new ScheduleTransformer<T>())
                    .subscribe(customSubscriber);
            return observable.map(new Func1<BaseRequestMode<T>, T>() {
                @Override
                public T call(BaseRequestMode<T> tBaseRequestMode) {
                    return tBaseRequestMode.getData();
                }
            });
        }else {
            throw new NullPointerException("observable can't be null at RetrofitProxy.getData()");
        }
    }

    public static <T> Observable<BaseRequestMode<T>> getData(Observable<BaseRequestMode<T>> observable) {
        if (observable != null) {
            return observable
                    .compose(new ScheduleTransformer<T>());
        }else {
            throw new NullPointerException("observable can't be null at RetrofitProxy.getData()");
        }
    }
}
