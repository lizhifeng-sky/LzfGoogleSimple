package lzf.common.mvp;

import lzf.common.network.APIService;
import lzf.common.network.SingleRetrofit;

/**
 *
 * @author lizhifeng
 * @date 2017/10/23 0023
 */

public abstract class BaseModel {
   protected APIService apiService = SingleRetrofit.create("http://new.antwk.com/api/");
}
