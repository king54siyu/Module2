/**
 *  编程实现上网套餐类信息
 *  作者：陈杨
 */

public class WebTaoCan extends TaoCanAbstract implements WebInterface {

    // 自定义成员变量
    private double web;

    public WebTaoCan() {
        super();
    }

    public WebTaoCan(double fee, double web) {
        super(fee);
        this.web = web;
    }

    // 自定以成员方法
    @Override
    public void show() {
        System.out.println("用户当前的上网套餐信息是上网流量：" + web + " 每月资费为：" + this.getFee());
    }

    @Override
    public void webService(double web, ShouJi shouJiCard) {
        if (web <= shouJiCard.getData()) {
            System.out.println("用户愉快的冲浪吧！");
        } else {
            System.out.println("别浪了，升级吧！");
        }
    }
}
