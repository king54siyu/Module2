/**
 *  编程实现五子棋游戏的类
 *  作者：陈杨
 */

import java.util.Scanner;

public class WuZiQiGame {

    // 成员变量
    // 玩家： ture = 黑方（X） false = 白方（O）
    private boolean player = true;
    // 棋盘：用来存储棋盘
    private char[][] qipan = new char[17][17];
    // 上一手
    private int lastX;
    private int lastY;

    // 自定义构造方法，在创建实例的时候，准备好棋盘
    public WuZiQiGame() {
        for (int i = 0; i < qipan.length; i++) {
            if (0 == i) {
                qipan[i] = new char[] {' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            } else {
                for (int j = 0; j < qipan[i].length; j++) {
                    if (0 == j) {
                        qipan[i][j] = qipan[0][i];
                    } else {
                        qipan[i][j] = '+';
                    }
                }
            }
        }
    }

    // 自定义成员方法，绘制棋盘，根据玩家的身份和下棋的位置
    private void drawQiPan(int x, int y) {

        if (player) {
            qipan[x][y] = 'X';
        } else {
            qipan[x][y] = 'O';
        }

        // 展示棋盘
        System.out.println("这一手的结果是：");
        for (int i = 0; i < qipan.length; i++) {
            for (int j = 0; j < qipan[i].length; j++) {
                System.out.print(qipan[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void play() {

        for (;;) {
            Scanner sc = new Scanner(System.in);
            lastX = sc.nextInt();
            lastY = sc.nextInt();
            if ('+' == qipan[lastX][lastY]) {
                drawQiPan(lastX, lastY); break;
            } else {
                System.out.println("此处已经下过！请重新选择位置！");
            }
        }
    }

    // 自定义成员方法提示相应的选手下棋，并且记录
    public void playQiPan() {

        if (player) {
            System.out.println("黑方选手请下棋！给定下棋的位置坐标！");
            play();
        } else {
            System.out.println("白方选手请下棋！给定下棋的位置坐标");
            play();
        }
    }

    // 自定义成员方法判断是否获胜
    private boolean win() {
        char symbol = qipan[lastX][lastY];
        boolean res = false;
        int countHeng = 0;
        int countZong = 0;
        int countZuoShang = 0;
        int countYouXia = 0;

        // 根据最后的位置来判断要在什么范围内查看
        int tmp = lastX - 4;
        int beginX = Math.max(tmp, 1);

        tmp = lastY - 4;
        int beginY = Math.max(tmp, 1);

        tmp = lastX + 4;
        int endX = Math.min(tmp, 16);

        tmp = lastY + 4;
        int endY = Math.min(tmp, 16);

        // 纵向看是否获胜
        for (int i = beginX; i < endX; i++) {
            if (qipan[i][lastY] == symbol && qipan[i+1][lastY] == symbol) {
                countZong++;
            } else if (countZong >= 4) {
                res = true;
            } else if (qipan[i][lastY] != symbol && qipan[i+1][lastY] != symbol) {
                countZong = 0;
            }
        }

        // 横向看是否获胜
        for (int i = beginY; i < endY; i++) {
            if (qipan[lastX][i] == symbol && qipan[lastX][i+1] == symbol) {
                countHeng++;
            } else if (countHeng >= 4) {
                res = true;
            } else if (qipan[lastX][i] != symbol && qipan[lastX][i+1] != symbol){
                countHeng = 0;
            }
        }

        // 右下看是否获胜
        for (int i = beginX, j = beginY; i < endX && j < endY; i++, j++) {
            if (qipan[i][j] == symbol && qipan[i+1][j+1] == symbol) {
                countYouXia++;
            } else if (countYouXia >= 4) {
                res = true;
            } else if (qipan[i][j] != symbol && qipan[i+1][j+1] != symbol) {
                    countYouXia = 0;
            }
        }

        // 右下看是否获胜
        for (int i = beginX, j = endY; i < endX && j > beginY; i++, j--) {
            if (qipan[i][j] == symbol && qipan[i+1][j-1] == symbol) {
                countZuoShang++;
            } else if (countZuoShang >= 4) {
                res = true;
            } else if (qipan[i][j] != symbol && qipan[i+1][j-1] != symbol) {
                    countZuoShang = 0;
            }
        }

        player = !player;
        return  res;
    }

    // 自定义成员方法判断获胜
    public boolean winQiPan() {

        if (player) {
            // 四种方向获胜，任意一个满足是获胜，以上一手的位置作为原点去判断
            boolean res = win();
            if (res) {
                System.out.println("黑方获胜！");
                return true;
            } else {
                System.out.println("游戏继续...");
                return false;
            }
        } else {
            boolean res = win();
            if (res) {
                System.out.println("白方获胜！");
                return true;
            } else {
                System.out.println("游戏继续...");
                return false;
            }
        }
    }
}
