package com.example.zhuyo.ticket;

/**
 * Created by Admin on 2017/7/17.
 */

public class SystemConfig {

    // 接口返回成功
    public static final String CALL_BACK_SUCCESS = "1";

    // 接口返回失败
    public static final String CALL_BACK_FAIL = "0";

    // 机器人回复类型  默认回复
    public static final String IBOT_RESPONSE_TYPE_DEFAULT = "0";

    // 机器人回复类型  寒暄
    public static final String IBOT_RESPONSE_TYPE_COMMON = "1";

    // 机器人回复类型  转账
    public static final String IBOT_RESPONSE_TYPE_TRANSFER = "101";

    // 机器人回复类型  系统错误
    public static final String IBOT_RESPONSE_TYPE_SYS_ERROR = "-1";


    //  短信验证码： /robot/queryMobileSmsRobot
    public static final String SEND_TYPE_MOBILE_SMS = "/robot/queryMobileSmsRobot";

    // 短信验证码 新盾 /robot/transferMobileSmsRobot
    public static final String SEND_TYPE_MOBILE_SMS_XINDUN = "/robot/transferMobileSmsRobot";

    // 声纹验证码 ：/robot/sendVoiceSmsRobot
    public static final String SEND_TYPE_VOICE_SMS = "/robot/sendVoiceSmsRobot";

    // 发送验证码短信模板 ZG002
    public static final String SMS_MODEL_ZG002 = "ZG002";

    //天气查询
    public static final String WeatherAppkey = "vgrv1ybracazh5wb";//key
    public static final String WeatherBaseUrl = "https://api.seniverse.com/v3/weather/";//心知天气接口地址
    public static final String WeatherBaseUrlTest = "http://www.easy-mock.com/mock/5a13d2d9b013fd5a91f8d401/example/weather/";//心知天气接口地址
    public static final String Language = "zh-Hans";//返回的语言
    public static final String Unit = "c";//温度单位，c：当参数为c时，温度c、风速km/h、能见度km、气压mb
    public static final int Start = 0;//
    public static final int Days = 5;//

    /**
     * 　add by 20170802, 聊天消息类型定义 start
     **/
    // 0 发送文本不带头像 用户说话
    public static final int MESSAGE_TYPE_USER = 0;
    // 1 接收文本带头像 机器人说话
    public static final int MESSAGE_TYPE_ROBOT = 1;
    // 2 选择银行卡
    public static final int MESSAGE_TYPE_CHOOSE_CARD = 2;
    // 3 输入金额
    public static final int MESSAGE_TYPE_INPUT_AMOUNT = 3;
    // 4 确认转账信息
    public static final int MESSAGE_TYPE_COMFIRM_TRANSFER_INFO = 4;
    // 5 选择验证方式
    public static final int MESSAGE_TYPE_CHOOSE_VERIFY_TYPE = 5;
    // 6 声纹验证
    public static final int MESSAGE_TYPE_VERIFY_TYPE_VOICE = 6;
    // 7 密码验证
    public static final int MESSAGE_TYPE_VERIFY_TYPE_MESSAGE = 7;
    // 8 转账明细
    public static final int MESSAGE_TYPE_TRANSFER_DETAIL = 8;
    // 9 常用联系人列表
    public static final int MESSAGE_TYPE_CONTACT_LIST = 9;
    // 10 输入收款人和卡号
    public static final int MESSAGE_TYPE_INPUT_RVC_INFO = 10;
    // 11 显示确认收款人按钮
    public static final int MESSAGE_TYPE_COMFIRM_RVC_NAME = 11;

    /**　add by 20170802, 聊天消息类型定义 end**/

    /**
     * add by 20170811, 余额查询消息类型定义 start
     **/
    //12 显示卡类型选项
    public static final int MESSAGE_TYPE_SHOW_CHOICE_CARDTYPE = 12;

    //13 显示借记卡列表
    public static final int MESSAGE_TYPE_SHOW_DEBIT_CARD_LIST = 13;
    //14 显示信用卡列表
    public static final int MESSAGE_TYPE_SHOW_CREDIT_CARD_LIST = 14;
    //15 显示信用卡详细信息
    public static final int MESSAGE_TYPE_SHOW_CREDIT_CARD_INFO = 15;
    //16 显示借记卡详细信息（转账完成后查询余额）
    public static final int MESSAGE_TYPE_SHOW_DEBIT_CARD_INFO = 16;

    //27 显示余额查询之后的推送
    public static final int MESSAGE_TYPE_SHOW_BALANCE_COMMEND = 27;

    // 17 天气查询：展示天气详情和推送信息
    /**
     * add by 20170815, 天气消息类定义
     **/
    public static final int MESSAGE_TYPE_SHOW_WEATHER_INFO = 17;
    // 18 显示推送列表
    /**
     * add by 20170817, 推送消息类定义（2017/11/17优化后去掉）
     **/
    public static final int MESSAGE_TYPE_SHOW_WEATHER_COMMEND_INFO = 18;

}
