/**
 *      编程实现通话套餐类
 *      作者：陈杨
 */

public class TongHuaTaoCan extends TaoCanAbstract implements TongHuaInterface {

    // 自定义成员变量
    private double time;
    private int messageCount;

    public TongHuaTaoCan() {
        super();
    }

    public TongHuaTaoCan(double fee, double time, int messageCount) {
        super(fee);
        this.time = time;
        this.messageCount = messageCount;
    }

    // 重写成员方法
    @Override
    public void show() {
        System.out.println("用户当前的通话套餐信息是通话时长：" + time  + " 短信条数为：" + messageCount + " 每月资费为：" + this.getFee());
    }

    @Override
    public void tongHua(double time, ShouJi shouJiCard) {
        if (time <= shouJiCard.getTime()) {
            System.out.println("用户您可以愉快的通话了，继续浪吧！");
        } else {
            System.out.println("请升级套餐类型！");
        }
    }
}
