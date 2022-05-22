package basic;

public class AIPlayer extends Player {
    @Override
    public Card show() {
        int index = (int) (Math.random() * hands.size());//產生從[1,10]
        return hands.remove(index);
    }

    @Override
    public void nameMySelf() {
        int id = (int) (Math.random() * 100) + 1;//產生從[1,10]
        this.name = "AI" + id;
    }
}
