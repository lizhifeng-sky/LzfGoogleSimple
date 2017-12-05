package lzf.common.base;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import java.util.Stack;

/**
 * @author Administrator
 */
class ActivityManager {
    private static Stack<FragmentActivity> activityStack;
    private static ActivityManager instance;

    private ActivityManager() {
    }

    /**
     * 单一实例
     */
    static ActivityManager getAppManager() {
        if (instance == null) {
            synchronized (ActivityManager.class) {
                if (instance == null) {
                    instance = new ActivityManager();
                }
            }
        }
        return instance;
    }

    /**
     * 添加Activity到堆栈
     */
    void addActivity(FragmentActivity activity) {
        if (activityStack == null) {
            activityStack = new Stack<>();
        }
        if (!activityStack.contains(activity)) {
            activityStack.add(activity);
        }
    }

    /**
     * 获取当前Activity（堆栈中最后一个压入的）
     */
    private FragmentActivity getCurrentActivity() {
        return activityStack.lastElement();
    }

    /**
     * 结束当前Activity（堆栈中最后一个压入的）
     */
    public void finishCurrentActivity() {
        FragmentActivity activity = activityStack.lastElement();
        finishActivity(activity);
        //栈内删除
        activityStack.remove(activity);
    }

    /**
     * 结束指定的Activity
     */
    void finishActivity(FragmentActivity activity) {
        if (activity != null) {
            activity.finish();
            activityStack.remove(activity);
        }
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void getActivity() {
        for (int i = 0; i < activityStack.size(); i++) {
            if (!activityStack.get(i).isDestroyed()) {
                Log.e("lzf_activity all", activityStack.get(i).toString());
            }
        }
    }

    /**
     * 结束指定类名的Activity
     */
    public void finishActivity(Class<?> cls) {
        for (FragmentActivity activity : activityStack) {
            if (activity.getClass().equals(cls)) {
                finishActivity(activity);
                activityStack.remove(activity);
            }
        }
    }

    /**
     * 结束所有Activity
     */
    public void finishAllActivity() {
        for (int i = 0, size = activityStack.size(); i < size; i++) {
            if (null != activityStack.get(i)) {
                activityStack.get(i).finish();
            }
        }
        activityStack.clear();
        System.exit(1);
    }

    public void reLoad() {
        for (int i = 0, size = activityStack.size(); i < size; i++) {
            if (null != activityStack.get(i)) {
                activityStack.get(i).finish();
            }
        }
        activityStack.clear();
    }

    /**
     * 注意这种方式 程序要符合 不保留模式 的要求
     */
    void onLowMemory() {
        FragmentActivity currentActivity = getCurrentActivity();
        for (int i = 0; i < activityStack.size(); i++) {
            if (activityStack.get(i) != null && activityStack.get(i) != currentActivity) {
                activityStack.get(i).finish();
                activityStack.remove(i);
            }
        }
    }
}
