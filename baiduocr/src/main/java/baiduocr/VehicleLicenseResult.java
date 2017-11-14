package baiduocr;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by sheny on 2017/11/13.
 * 身份证识别，返回结果
 */
public class VehicleLicenseResult {
    @JSONField(name = "log_id")
    private String logId;
    @JSONField(name = "direction")
    private Integer direction;
    @JSONField(name = "words_result_num")
    private Integer wordsResultNum;
    @JSONField(name = "words_result")
    private WordsResult wordsResult;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public void setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
    }

    public WordsResult getWordsResult() {
        return wordsResult;
    }

    public void setWordsResult(WordsResult wordsResult) {
        this.wordsResult = wordsResult;
    }
}

class WordsResult{
    @JSONField(name = "品牌型号")
    private Words brandType;

    @JSONField(name = "发证日期")
    private Words certDate;

    @JSONField(name = "使用性质")
    private Words useType;

    @JSONField(name = "发动机号码")
    private Words engineNumber;

    @JSONField(name = "号牌号码")
    private Words vehicleNumber;

    @JSONField(name = "所有人")
    private Words ownerHuman;

    @JSONField(name = "住址")
    private Words address;

    @JSONField(name = "注册日期")
    private Words regiDate;

    @JSONField(name = "车辆识别代号")
    private Words vehicleAliasNumber;

    @JSONField(name = "车辆类型")
    private Words vehicleType;

    public Words getBrandType() {
        return brandType;
    }

    public void setBrandType(Words brandType) {
        this.brandType = brandType;
    }

    public Words getCertDate() {
        return certDate;
    }

    public void setCertDate(Words certDate) {
        this.certDate = certDate;
    }

    public Words getUseType() {
        return useType;
    }

    public void setUseType(Words useType) {
        this.useType = useType;
    }

    public Words getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(Words engineNumber) {
        this.engineNumber = engineNumber;
    }

    public Words getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(Words vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Words getOwnerHuman() {
        return ownerHuman;
    }

    public void setOwnerHuman(Words ownerHuman) {
        this.ownerHuman = ownerHuman;
    }

    public Words getAddress() {
        return address;
    }

    public void setAddress(Words address) {
        this.address = address;
    }

    public Words getRegiDate() {
        return regiDate;
    }

    public void setRegiDate(Words regiDate) {
        this.regiDate = regiDate;
    }

    public Words getVehicleAliasNumber() {
        return vehicleAliasNumber;
    }

    public void setVehicleAliasNumber(Words vehicleAliasNumber) {
        this.vehicleAliasNumber = vehicleAliasNumber;
    }

    public Words getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Words vehicleType) {
        this.vehicleType = vehicleType;
    }
}

class Words{
    private String words;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
}
