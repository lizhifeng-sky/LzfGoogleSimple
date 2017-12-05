package lzf.common.bean;

/**
 *
 * @author Administrator
 * @date 2017/5/17 0017
 */
public class BaseRequestMode<T> {
    public int code;
    public String msg;
    public T data;

    public int getError() {
        return code;
    }

    public void setError(int error) {
        this.code = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
