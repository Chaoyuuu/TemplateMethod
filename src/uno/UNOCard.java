package uno;

import basic.Card;
import uno.Color;

public class UNOCard extends Card {
    private final Color color;
    private final uno.Number number;

    public UNOCard(Color color, uno.Number number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public int compare(Card card) {
        return 0;
    }
}
