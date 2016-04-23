package net.betterbing.javabasic.encode;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by aibb on 16/4/23.
 * <p/>
 * 在url中输入特殊字符的时候,在请求Url的时候需要对url中的特殊字数进行一个转换
 * 否则在传输的时候会出问题
 */
public class UrlEncode {

    public static void main(String[] args) {
        String baseUrl = "http://www.betterbing.net?params=";
        String params = "?jjjki:ikeik/";
        String paramsEncoded = null;
        try {
            paramsEncoded = URLEncoder.encode(params, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("url:" + params);
        System.out.println("encode url:" + paramsEncoded);
        String paramsDecoded = null;
        try {
            paramsDecoded = URLDecoder.decode(paramsEncoded, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("decode url:" + paramsDecoded);
    }

}
