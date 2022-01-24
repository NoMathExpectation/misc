package NoMathExpectation.HearthstoneProbabilityProblem;

public class Main
{
    public static int main(String[] args)
    {
        //初始化牌库
        CardPool cardPool = new CardPool();
        //抽牌
        Player you = new Player(cardPool.draw(3));
        System.out.println("你抽到的手牌：" + you.getCards());
        //选择放弃并重抽
        



        return 0;
    }
}
