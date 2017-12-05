package lzf.common.mvp;

/**
 *
 * @author lizhifeng
 * @date 2017/10/24 0024
 */

public interface BaseView {
    /**
     *开始加载
     * */
    void startLoading();
    /**
     *加载错误
     * @param throwable
     * */
    void onError(Throwable throwable);
    /**
     *停止加载
     * */
    void stopLoading();
}
