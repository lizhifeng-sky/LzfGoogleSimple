package lzf.common.network;

import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import lzf.common.bean.BaseRequestMode;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class ScheduleTransformer<T> implements ObservableTransformer<BaseRequestMode<T>,BaseRequestMode<T>> {

    @Override
    public ObservableSource<BaseRequestMode<T>> apply(io.reactivex.Observable<BaseRequestMode<T>> upstream) {
        return upstream.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
