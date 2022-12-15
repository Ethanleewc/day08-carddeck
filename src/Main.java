import java.util.Optional;

public class Main {

    public static void main(String[] args) {
       DeckOfCards deck = new DeckOfCards();
       //System.out.println(deck) ;

       deck.shuffle();

       // ? what is the danger
       Optional<Card> opt =  deck.take();
       if (opt.isPresent()) {
            Card c = opt.get();
            System.out.printf("Drawn: %s of %s\n",c.getName(), c.getSuit());
       }

       //opt.ifPresent(c -> {
       //     System.out.printf("suit: %s\n", c.getSuit());
       //});
    }
}