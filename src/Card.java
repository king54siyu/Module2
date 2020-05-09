/**
 *      编程实现手机卡的枚举类
 *      作者：陈杨
 */

public enum Card {

    // 类型
    BIG("大卡"), SMALL("小卡"), MICRO("微型卡");

    // 私有化成员变量
    private final String cardDesc;

    // 私有化构造方法
    private Card(String cardDesc) {
        this.cardDesc = cardDesc;
    }

    // Getter 将相应的值送出去
    public String getCardDesc() {
        return cardDesc;
    }
}
