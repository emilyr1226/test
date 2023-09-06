/**
 * Represents a card, with one of the four suits as in our regular playing cards,
 * and a rank of any positive integer greater than or equal to 1.
 * <p>
 * All methods in this class must be done in Theta(1) time.
 * <p>
 * The Card class is immutable and implements {@link #hashCode()} and
 * {@link #equals(Object)} methods, to be done in part 2 of this assignment.
 * It can serve as the key type for hashtables.
 */
public class Card {
    public final int rank;
    public final char suit;

    private Card card;

    public final static int ACE = 1;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;

    /**
     * constructs a card with the specified rank and suit.
     *
     * @param rank the rank of the card, must be >= 1
     * @param suit the suit of the card, must be 'C', 'D', 'H', or 'S'
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Card(int rank, char suit) {
        if ((rank < 1) || (rank > 13))
            throw new IllegalArgumentException("Rank must be between 1 and 13");
        if (suit != 'C' && suit != 'D' && suit != 'H' && suit != 'S')
            throw new IllegalArgumentException("Suit must be C, D, H, or S");

        this.rank = rank;
        this.suit = suit;

    }

    /**
     * Computes and returns a hashcode of the card
     *
     * @return a hashcode of the card
     */
    @Override
    public int hashCode() {
        // TODO Complete for part 2
        int hash = 17;
        hash = 31 * hash + ((Integer) rank).hashCode();
        hash = 31 * hash + ((Character) suit).hashCode();
        return hash;
    }

    /**
     * determines if this card is equal to that object
     *
     * @param that an object to be checked for equivalence with this card
     * @return true if that object is a card that is equivalent to this card,
     * false otherwise
     */
    @Override
    public boolean equals(Object that) {
        // TODO Complete for part 2
        if (that == this) return true;
        if (that == null) return false;
        if (that.getClass() != this.getClass())
           return false;
        Card equal = (Card) that;
        if (this.rank != equal.rank) return false;
        if (this.suit != equal.suit) return false;
        return true;

    }
    /**
     * a String representation of the card, e.g. "7C", with no space or any
     * other character before or after the rank and suit
     *
     * @returns a String representation of the card
     */
    public String toString() {
        String card = Integer.toString(rank) + suit;
        if (rank == ACE) {
            card = Character.toString((char) 65) + suit;
        }
        if (rank == JACK) {
            card = Character.toString((char) 74) + suit;
        }
        if (rank == QUEEN) {
            card = Character.toString((char) 81) + suit;
        }
        if (rank == KING) {
            card = Character.toString((char) 75) + suit;
        }
        return card;

    }

    public static void main(String[] args) {
        // TODO Test your code
    }
}
