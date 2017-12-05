package lzf.common.network;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/6 0006.
 */
public class RetrofitMap<T,R> {
    private Map<T,R> map;
    public RetrofitMap() {
        map=new HashMap<>();
    }
    public RetrofitMap<T, R> put(T key, R value){
        if (key!=null&&value!=null) {
            if (!map.containsKey(key)) {
                map.put(key,value);
            }else {
                Log.e("lzf_retrofit_map",key+" 已存在");
            }
        }else {
            Log.e("lzf_retrofit_map",key+" 或 "+value+"  不能为空");
        }
        return this;
    }
    public Map<T, R> build(){
        return map!=null?map:null;
    }
}
