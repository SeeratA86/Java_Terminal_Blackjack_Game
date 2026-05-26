public class Dealer {
    private final Deck mainDeck;
    private final Deck secondaryDeck;
    private final Player[] players;
    private int turnCounter = 0;
    private static final int PLAYER_COUNT = 3;

    public Dealer() {
        this.mainDeck = new Deck(16);
        this.secondaryDeck = new Deck(8);
        this.players = new Player[PLAYER_COUNT];
        for (int i = 0; i < PLAYER_COUNT; i++) {
            players[i] = new Player();
        }
    }

    private void use() {

    }

    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.use();
    }
}
