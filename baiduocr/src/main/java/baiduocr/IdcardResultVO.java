package baiduocr;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by sheny on 2017/11/13.
 * 身份证识别结果
 */
public class IdcardResultVO {
    @JSONField(name = "log_id")
    private String logId;
    @JSONField(name = "image_status")
    private String imageStatus;
    @JSONField(name = "words_result_num")
    private Integer wordsResultNum;
    @JSONField(name = "words_result")
    private CardWordsResult wordsResult;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getImageStatus() {
        return imageStatus;
    }

    public void setImageStatus(String imageStatus) {
        this.imageStatus = imageStatus;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public void setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
    }

    public CardWordsResult getWordsResult() {
        return wordsResult;
    }

    public void setWordsResult(CardWordsResult wordsResult) {
        this.wordsResult = wordsResult;
    }
}

class CardWordsResult{
    @JSONField(name = "住址")
    private CardWords address;
    @JSONField(name = "出生")
    private CardWords birthday;
    @JSONField(name = "姓名")
    private CardWords userName;
    @JSONField(name = "公民身份号码")
    private CardWords idcard;
    @JSONField(name = "性别")
    private CardWords sex;
    @JSONField(name = "民族")
    private CardWords nation;

    public CardWords getAddress() {
        return address;
    }

    public void setAddress(CardWords address) {
        this.address = address;
    }

    public CardWords getBirthday() {
        return birthday;
    }

    public void setBirthday(CardWords birthday) {
        this.birthday = birthday;
    }

    public CardWords getUserName() {
        return userName;
    }

    public void setUserName(CardWords userName) {
        this.userName = userName;
    }

    public CardWords getIdcard() {
        return idcard;
    }

    public void setIdcard(CardWords idcard) {
        this.idcard = idcard;
    }

    public CardWords getSex() {
        return sex;
    }

    public void setSex(CardWords sex) {
        this.sex = sex;
    }

    public CardWords getNation() {
        return nation;
    }

    public void setNation(CardWords nation) {
        this.nation = nation;
    }
}

class CardWords{
    private String words;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
}