package lzf.common.network;


import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import lzf.common.bean.BaseRequestMode;
import lzf.common.mvp.BaseView;


/**
 * @author Administrator
 * @date 2017/8/10 0010
 */
public abstract class CustomObserver<T> implements Observer<BaseRequestMode<T>> {

    private BaseView baseView;
    private Disposable disposable;

    /**
     * @param baseView activity 存在就显示 加载动画
     * @author lzf
     * create at 2017/8/25 0025 10:00
     * description
     */
    public CustomObserver(BaseView baseView) {
        this.baseView = baseView;
    }

    /**
     * @author lzf
     * create at 2017/8/25 0025 10:00
     * description 不显示加载动画
     */
    public CustomObserver() {
    }

    @Override
    public void onSubscribe(Disposable d) {
        this.disposable = d;
        if (baseView != null) {
            baseView.startLoading();
        }
    }

    @Override
    public void onComplete() {
        if (baseView != null) {
            baseView.stopLoading();
        }
        if (disposable.isDisposed()) {
            disposable.dispose();
        }
    }

    @Override
    public void onError(Throwable e) {
        if (baseView != null) {
            baseView.stopLoading();
            baseView.onError(e);
        }
        if (disposable.isDisposed()) {
            disposable.dispose();
        }
    }

    /*
    * final修饰方法
    * */
    @Override
    final public void onNext(BaseRequestMode<T> tBaseRequestMode) {
        if (tBaseRequestMode.getError() == 200 || tBaseRequestMode.getError() == 419) {
            onSuccess(tBaseRequestMode.getData());
        } else {
            if (tBaseRequestMode.getMsg() != null) {
                Exception exception = new Exception(tBaseRequestMode.getMsg());
                onError(exception);
            } else {
                Exception exception = new Exception("未知错误");
                onError(exception);
            }
        }
    }

    public abstract void onSuccess(T t);

}
