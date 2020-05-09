/**
 *   编程实现用户消费信息类
 *   作者：陈杨
 */

public class UserInfo {

    // 自定义成员变量
    private double totalTime;
    private double totalWeb;
    private double totalCost;

    public UserInfo() {
    }

    public UserInfo(double totalTime, double totalWeb, double totalCost) {
        this.totalTime = totalTime;
        this.totalWeb = totalWeb;
        this.totalCost = totalCost;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getTotalWeb() {
        return totalWeb;
    }

    public void setTotalWeb(double totalWeb) {
        this.totalWeb = totalWeb;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
