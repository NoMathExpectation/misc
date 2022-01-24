package NoMathExpectation.HearthstoneProbabilityProblem;

import java.util.ArrayList;
import java.util.List;

public class CardPool
{
    private final List<String> pool = new ArrayList<>();
    private int drawCount = 0;

    CardPool()
    {
        pool.add("quest");

    }

    CardPool(List<String> cards)
    {
        pool.addAll(cards);
    }

    public List<String> draw(int count)
    {
        drawCount++;
        List<String> cardsReturn = new ArrayList<>();
        if(drawCount == 1)
        {
            cardsReturn.add("quest");
            pool.remove("quest");
        }
    }
}
