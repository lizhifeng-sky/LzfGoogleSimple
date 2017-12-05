package lzf.common.network;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/**
 * Created by Administrator on 2017/9/7 0007.
 */
public class FileRequestMultiBody {
    private MultipartBody.Builder builder;

    public FileRequestMultiBody() {
        builder = new MultipartBody.Builder()
                .setType(MultipartBody.FORM);
    }

    public FileRequestMultiBody addParam(String key, String value) {
        builder.addFormDataPart(key, value);
        return this;
    }

    public FileRequestMultiBody addImageParam(String key, String filePath) {
        File file = new File(filePath);
        builder.addFormDataPart(key, file.getName(), RequestBody.create(MediaType.parse("image/*"), file));
        return this;
    }

    public FileRequestMultiBody addVideoParam(String key, String filePath) {
        File file = new File(filePath);
        builder.addFormDataPart(key, file.getName(), RequestBody.create(MediaType.parse("video/*"), file));
        return this;
    }

    public RequestBody build() {
        return builder != null ? builder.build() : null;
    }
}
