package src;
public class GameCard {
    private String color;
    private String shape;
    private String shading;
    private int number;

    public GameCard(String color, String shape, String shading, int number) {
        this.color = color;
        this.shape = shape;
        this.shading = shading;
        this.number = number;
        System.out.println("made card" + this.toString());
    }

    public String getColor() {
        return color;
    }

    public String getShape() {
        return shape;
    }

    public String getShading() {
        return shading;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return number + " " + shading + " " + color + " " + shape;
    }

    public static boolean isSet(GameCard card1, GameCard card2, GameCard card3) {
        boolean colorSet = (card1.getColor().equals(card2.getColor()) && card2.getColor().equals(card3.getColor())) ||
                (!card1.getColor().equals(card2.getColor()) && !card2.getColor().equals(card3.getColor()) && !card1.getColor().equals(card3.getColor()));
        boolean shapeSet = (card1.getShape().equals(card2.getShape()) && card2.getShape().equals(card3.getShape())) ||
                (!card1.getShape().equals(card2.getShape()) && !card2.getShape().equals(card3.getShape()) && !card1.getShape().equals(card3.getShape()));
        boolean shadingSet = (card1.getShading().equals(card2.getShading()) && card2.getShading().equals(card3.getShading())) ||
                (!card1.getShading().equals(card2.getShading()) && !card2.getShading().equals(card3.getShading()) && !card1.getShading().equals(card3.getShading()));
        boolean numberSet = (card1.getNumber() == card2.getNumber() && card2.getNumber() == card3.getNumber()) ||
                (card1.getNumber() != card2.getNumber() && card2.getNumber() != card3.getNumber() && card1.getNumber() != card3.getNumber());

        return colorSet && shapeSet && shadingSet && numberSet;
    }
}
