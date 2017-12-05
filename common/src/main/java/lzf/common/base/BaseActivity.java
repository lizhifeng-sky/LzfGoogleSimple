package lzf.common.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import lzf.common.mvp.BaseView;


/**
 * @author Administrator
 * @date 2017/9/15 0015
 */
public abstract class BaseActivity extends AppCompatActivity implements BaseUIFlow ,BaseView{
    /**
     * activityCount 记录前台activity数
     */
    private static int activityCount = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ActivityManager.getAppManager().addActivity(this);
        initVariable();
        initListener();
    }

    @Override
    public void initVariable() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void startLoading() {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    protected void onStart() {
        super.onStart();
        activityCount++;
    }

    @Override
    protected void onStop() {
        super.onStop();
        activityCount--;
        if (activityCount==0){
            //app进入后台
            ActivityManager.getAppManager().onLowMemory();
        }
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        /*
         * 低内存 只保留栈顶activity 此时进行内存回收 是最后的时机了
         * */
        Log.e("lzf_lowMemory","onLowMemory");
        ActivityManager.getAppManager().onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        Log.e("lzf_lowMemory","onTrimMemory"+"   "+level);
        super.onTrimMemory(level);

        /*
         * 低内存 只保留栈顶activity 此时进行内存回收是不错的时机
         * */
//        ActivityManager.getAppManager().onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityManager.getAppManager().finishActivity(this);
    }
}
