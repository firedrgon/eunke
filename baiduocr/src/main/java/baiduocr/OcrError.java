package baiduocr;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by sheny on 2017/11/13.
 */
public class OcrError {
    @JSONField(name = "error_msg")
    private String errorMsg;
    @JSONField(name = "error_code")
    private String errorCode;

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
