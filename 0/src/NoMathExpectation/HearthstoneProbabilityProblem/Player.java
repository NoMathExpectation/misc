package NoMathExpectation.HearthstoneProbabilityProblem;

import java.util.ArrayList;
import java.util.List;

public class Player
{
    private List<String> cards = new ArrayList<>();

    Player()
    {}

    Player(List<String> cards)
    {give(cards);}

    public void give(String card)
    {cards.add(card);}

    public void give(List<String> cards)
    {cards.addAll(cards);}

    public List<String> getCards()
    {return cards;}
}
