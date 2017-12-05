package lzf.common.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lzf.common.mvp.BaseView;

/**
 * @author Administrator
 * @date 2017/9/15 0015
 */
public abstract class BaseFragment extends Fragment implements BaseUIFlow ,BaseView{
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return LayoutInflater.from(getContext()).inflate(getLayoutId(), container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.view = view;
        initVariable();
        initListener();
    }

    @Override
    public void startLoading() {
        System.out.println("startLoading");
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(throwable.getMessage());
    }

    @Override
    public void stopLoading() {
        System.out.println("stopLoading");
    }

    public View getFragmentContentView() {
        return view;
    }
}
