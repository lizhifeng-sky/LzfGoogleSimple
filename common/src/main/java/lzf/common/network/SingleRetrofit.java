package lzf.common.network;

import android.content.Context;
import android.os.Environment;

import java.io.File;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.functions.Function;
import lzf.common.bean.BaseRequestMode;
import lzf.common.network.interceptor.LogInterceptor;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by Administrator on 2017/8/10 0010.
 */
public class SingleRetrofit {
    public static final int DEFAULT_TIMEOUT = 5;
    private static APIService apiService;
    private static SingleRetrofit mInstance;
    private Context context;//用于做网络状态 拦截器 不需要可以不用理会

    private SingleRetrofit(String baseUrl) {
        File httpCacheDirectory = new File(Environment.getExternalStorageDirectory(), "responses");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .cache(new Cache(httpCacheDirectory, 10 * 1024 * 1024))
                .addInterceptor(new LogInterceptor());
        Retrofit mRetrofit = new Retrofit.Builder()
                .client(builder.build())
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        apiService = mRetrofit.create(APIService.class);
    }

    public static SingleRetrofit getInstance(String baseUrl) {
        if (mInstance == null) {
            synchronized (SingleRetrofit.class) {
                mInstance = new SingleRetrofit(baseUrl);
            }
        }
        return mInstance;
    }

    public static APIService create(String url) {
        getInstance(url);
        return apiService;
    }

    public static APIService create(Context context, String url) {
        getInstance(url);
        return apiService;
    }
}
