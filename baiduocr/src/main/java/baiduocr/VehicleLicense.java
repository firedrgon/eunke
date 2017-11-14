package baiduocr;

import baiduocr.util.Base64Util;
import baiduocr.util.FileUtil;
import baiduocr.util.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.net.URLEncoder;
import java.util.Map;

/**
 * 行驶证识别
 */
public class VehicleLicense {

    /**
     * 重要提示代码中所需工具类
     * FileUtil,Base64Util,HttpUtil,GsonUtils请从
     * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
     * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
     * 下载
     */
    public static void main(String[] args) {
        // 行驶证识别url
        String idcardIdentificate = "https://aip.baidubce.com/rest/2.0/ocr/v1/vehicle_license";
        // 本地图片路径
        String filePath = "E:\\Downloads\\velicinse.png";
        try {
            byte[] imgData = FileUtil.readFileByBytes(filePath, null);
            String imgStr = Base64Util.encode(imgData);
            String params = "detect_direction=true&" + URLEncoder.encode("image", "UTF-8") + "="
                    + URLEncoder.encode(imgStr, "UTF-8");
            /**
             * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
             */
            String accessToken = "24.8af56203607f5ab68cff5f63841d5e87.2592000.1512806617.282335-10343550";
            String result = HttpUtil.post(idcardIdentificate, accessToken, params);
            System.out.println(result);
            VehicleLicenseResult vehicleLicenseResult = JSONObject.parseObject(result, VehicleLicenseResult.class);
            System.out.println(JSONObject.toJSONString(vehicleLicenseResult));
            WordsResult wordsResult = vehicleLicenseResult.getWordsResult();
            Words brandType = wordsResult.getBrandType();
            System.out.println(brandType.getWords());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



















