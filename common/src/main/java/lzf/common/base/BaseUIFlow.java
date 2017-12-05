package lzf.common.base;

/**
 * @author Administrator
 * @date 2017/8/10 0010
 * 一个界面的基本操作流程
 */
public interface BaseUIFlow {
    /**
     *return获取布局id
     * */
    int getLayoutId();
    /**
     *初始化数据
     * */
    void initVariable();
    /**
     *监听
     * */
    void initListener();

}
