package com.example.lucene.ut;

/**
 * Greated by Terry on 2019/4/17
 * Time: 9:55
 */



import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.lucene.ut.GsonUtils;
import com.example.lucene.ut.HttpUtil;

public class SimNet {
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
        // 短文本相似度url
        String simNetUrl = "https://aip.baidubce.com/rpc/2.0/nlp/v2/simnet";
        try {
            String shortText1 = "你好百度";
            Map<String, Object> qslots_params = new HashMap<String, Object>();
            qslots_params.put("terms_sequence", shortText1);
            qslots_params.put("type", 0);
            qslots_params.put("items", new ArrayList());
            List<Object> qslots = new ArrayList<Object>();
            qslots.add(qslots_params);

            String shortText2 = "你好世界";
            Map<String, Object> tslots_params = new HashMap<String, Object>();
            tslots_params.put("terms_sequence", shortText2);
            tslots_params.put("type", 0);
            tslots_params.put("items", new ArrayList());
            List<Object> tslots = new ArrayList<Object>();
            tslots.add(tslots_params);

            Map<String, Object> input = new HashMap<String, Object>();
            input.put("qslots", qslots);
            input.put("tslots", tslots);
            input.put("type", 0);

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("input", input);

            String params = GsonUtils.toJson(map);
            params = URLEncoder.encode(params, "GBK");

            /**
             * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
             */
            String accessToken = "24.7035c15862ad7ac4aeee0493c011659d.2592000.1558059545.282335-16037513";
            String result = HttpUtil.post(simNetUrl, accessToken, params);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}