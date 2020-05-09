/**
 *      编程实现所有与手机相关类的测试
 *      作者：陈杨
 */

public class AllTest {

    public static void main(String[] args) {

        // 初始化几个对象
        ShouJi shouJi1 = new ShouJi(Card.BIG, 667788, "cy", "1234", 1000, 1000.0, 1000.0);
        ShouJi shouJi2 = new ShouJi(Card.SMALL, 778899, "qd", "1314", 500, 500.0, 500.0);
        ShouJi shouJi3 = new ShouJi(Card.MICRO, 889900, "zx", "456", 250, 250.0, 250.0);

        // 使用多态初始化相应的套餐
        TaoCanAbstract tongHuaTaoCan1 = new TongHuaTaoCan(1000, 1000.0, 1000);
        TaoCanAbstract webTaoCan1 = new WebTaoCan(100, 1000.0);

        tongHuaTaoCan1.show();
        System.out.println("-------------------------------------");
        webTaoCan1.show();
        System.out.println("-------------------------------------");
        // 使用子类的独有方法
        if (tongHuaTaoCan1 instanceof TongHuaTaoCan) {
            ((TongHuaTaoCan)tongHuaTaoCan1).tongHua(10000.0, shouJi1);
        } else {
            System.out.println("请你不要乱来！");
        }

        System.out.println("-------------------------------------");
        if (webTaoCan1 instanceof WebTaoCan) {
            ((WebTaoCan)webTaoCan1).webService(500, shouJi1);
        }
    }
}
