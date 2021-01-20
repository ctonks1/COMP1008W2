public class Card {
    private String faceName;
    private int faceValue;
    private String suit;

    public Card(String faceName, String suit, int faceValue) {
        set faceName(faceName);
        setSuit(suit);
        setfaceValue(faceValue);
    }

    public Card(String faceName, String suit) {
        this.faceName = faceName;
        this.suit = suit;
    }
}
