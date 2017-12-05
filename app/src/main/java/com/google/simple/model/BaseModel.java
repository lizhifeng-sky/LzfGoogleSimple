package com.google.simple.model;

import lzf.common.network.APIService;
import lzf.common.network.SingleRetrofit;

/**
 *
 * @author lizhifeng
 * @date 2017/11/30 0030
 */

class BaseModel {
    APIService apiService = SingleRetrofit.create("http://new.antwk.com/api/");
}
