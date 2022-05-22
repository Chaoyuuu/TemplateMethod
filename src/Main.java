import basic.AIPlayer;
import basic.Deck;
import basic.Game;
import basic.Player;
import poker.PokerGame;
import uno.UNOGame;

import java.util.ArrayList;
import java.util.List;

import static basic.Game.NUMBER_OF_PLAYERS;

public class Main {
    public static void main(String[] args) {
        Game game = new PokerGame(createAIPlayers(), Deck.standardPokerDeck());
//        Game game = new UNOGame(createAIPlayers(), Deck.standardUNODeck());
        game.play();
        game.showWinner();
    }

    private static List<Player> createAIPlayers() {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_PLAYERS; i ++) {
            players.add(new AIPlayer());
        }
        return players;
    }
}
