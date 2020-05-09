/**
 *  编程实现手机类
 *  作者：陈杨
 */

public class ShouJi {

    // 手机的属性
    private Card cardType;
    private int cardNum;
    private String userName;
    private String pin;
    private double remain;
    private double time; // unit: min
    private double data;

    // 自定义无参构造方法
    public ShouJi() {
    }

    // 自定以有参构造方法

    public ShouJi(Card cardType, int cardNum, String userName, String pin, double remain, double time, double data) {
        this.cardType = cardType;
        this.cardNum = cardNum;
        this.userName = userName;
        this.pin = pin;
        this.remain = remain;
        this.time = time;
        this.data = data;
    }
    public Card getCardType() {
        return cardType;
    }

    public void setCardType(Card cardType) {
        this.cardType = cardType;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getRemain() {
        return remain;
    }

    public void setRemain(double remain) {
        this.remain = remain;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    // 自定义成员方法
    public void show() {
        System.out.println("当前用户的卡号是" + getCardNum() + " 用户名是" + getUserName() + "。 您的账户余额为：" + getRemain());
    }
}
