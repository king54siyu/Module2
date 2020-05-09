/**
 *     编程实现抽象套餐类， 具有一下的成员变量和抽象方法
 *     1。 成员变量：每月资费
 *     2。 成员方法：显示
 *     作者：陈杨
 */

public abstract class TaoCanAbstract {

    // 自定义成员变量
    private double fee;

    public TaoCanAbstract() {
    }

    public TaoCanAbstract(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    // 自定义成员方法
    public abstract void show();
}
