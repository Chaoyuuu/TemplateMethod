package basic;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    protected String name;
    protected final List<Card> hands = new ArrayList<>();

    public abstract Card show();
    public abstract void nameMySelf();

    public void getCard(Card card) {
        hands.add(card);
    }

    public String getName() {
        return name;
    }
}
