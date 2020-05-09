public class WuZiQiGameTest {

    public static void main(String[] args) {

        WuZiQiGame game = new WuZiQiGame();
        for (;;) {
           game.playQiPan();
           if (game.winQiPan()) break;
        }
    }
}
