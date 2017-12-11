package com.google.simple.model.wrapper;

/**
 * @author lizhifeng
 * @date 2017/12/8 0008
 */

public interface LayoutWrapper<T> {

    /**
     * @param t 适应的目标
     * @return this
     */
    LayoutWrapper setTarget(T t);

    /**
     * @return 适应的目标
     */
    T getTarget();

    /**
     * @return layoutId
     */
    int getType();

    /**
     * @return layout中的 BR.id
     */
    int getId();
}
