import java.util.ArrayList;
import java.util.stream.Collectors;

public class Deck {
    private final ArrayList<Card> cards;
    public Deck(int size) {
          this.cards = CardLibrary.ALL_CARDS.subList(0, size).stream().map(Card::copy).collect(Collectors.toCollection(ArrayList::new));
    }
}
