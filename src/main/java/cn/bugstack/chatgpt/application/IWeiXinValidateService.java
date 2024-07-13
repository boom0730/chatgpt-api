package cn.bugstack.chatgpt.application;

/**
 * @author 小傅哥，微信：fustack
 * @description 微信公众号验签服务
 */
public interface IWeiXinValidateService {

    boolean checkSign(String signature, String timestamp, String nonce);

}
