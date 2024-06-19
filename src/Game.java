package src;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<GameCard> cards;

    public Game(List<GameCard> cards) {
        this.cards = cards;
    }

    public List<List<GameCard>> findSets() {
        List<List<GameCard>> sets = new ArrayList<>();
        for (int i = 0; i < cards.size(); i++) {
            for (int j = i + 1; j < cards.size(); j++) {
                for (int k = j + 1; k < cards.size(); k++) {
                    if (GameCard.isSet(cards.get(i), cards.get(j), cards.get(k))) {
                        List<GameCard> set = new ArrayList<>();
                        set.add(cards.get(i));
                        set.add(cards.get(j));
                        set.add(cards.get(k));
                        sets.add(set);
                    }
                }
            }
        }
        return sets;
    }
}
