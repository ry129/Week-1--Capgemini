import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize deck
        String[] deck = initializeDeck();

        // Shuffle the deck
        shuffleDeck(deck);

        System.out.println("Enter the number of players:");
        int players = sc.nextInt();

        System.out.println("Enter the number of cards per player:");
        int cardsPerPlayer = sc.nextInt();

        // Distribute cards and display them
        if (players * cardsPerPlayer <= deck.length) {
            String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);
            displayCards(distributedCards);
        } else {
            System.out.println("Not enough cards for the given number of players and cards per player.");
        }

        sc.close();
    }

    // Method to initialize the deck
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                          "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + random.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    // Method to distribute cards
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        String[][] playerCards = new String[players][cardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex++];
            }
        }
        return playerCards;
    }

    // Method to display cards of each player
    public static void displayCards(String[][] playerCards) {
        for (int i = 0; i < playerCards.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : playerCards[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}
