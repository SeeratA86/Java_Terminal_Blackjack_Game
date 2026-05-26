public class Card {
    private final String name;
    private final int attack;
    private final WeaponStyle style;
    private int health;
    private boolean isActive;

    public Card(String name, int attack, WeaponStyle style) {
        this.name = name;
        this.attack = attack;
        this.style = style;
        this.health = 100;
        this.isActive = true;
    }

    //Do not remove this. You do not need to use this in your implementation.
    public static Card copy(Card card) {
        return new Card(card.name, card.attack, card.style);
    }
}
