import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
    private final ArrayList<Card> hand;
    public static final int MAX_HAND_SIZE = 2;

    public Player() {
        this.hand = new ArrayList<Card>();
    }
}
