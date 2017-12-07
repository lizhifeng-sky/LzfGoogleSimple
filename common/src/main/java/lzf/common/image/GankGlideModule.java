package lzf.common.image;

import android.content.Context;
import android.os.Environment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.module.GlideModule;

import java.io.File;

/**
 *
 * @author Administrator
 * @date 2017/8/15 0015
 */
public class GankGlideModule implements GlideModule {
    private static final int DISK_CACHE_SIZE = 100 * 1024 * 1024;
    public static final int MAX_MEMORY_CACHE_SIZE = 10 * 1024 * 1024;

    @Override
    public void applyOptions(final Context context, GlideBuilder builder) {
        //设置磁盘缓存的路径 path
        final File cacheDir = new File(Environment.getExternalStorageDirectory().getPath()+"/gank");
        if(!cacheDir.exists()){
            cacheDir.mkdirs();
        }
        builder.setDiskCache(new DiskCache.Factory() {
            @Override
            public DiskCache build() {
                return DiskLruCacheWrapper.get(cacheDir, DISK_CACHE_SIZE);
            }
        });
        //设置内存缓存大小，一般默认使用glide内部的默认值
        builder.setMemoryCache(new LruResourceCache(MAX_MEMORY_CACHE_SIZE));
    }

    @Override
    public void registerComponents(Context context, Glide glide) {

    }
}
