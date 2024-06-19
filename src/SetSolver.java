package src;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SetSolver {
    public static void main(String[] args) {
        String url = "https://www.setgame.com/set/puzzle";
        System.out.println("Starting Set Solver...");

        try {
            long startTime = System.currentTimeMillis();

            System.out.println("Connecting to URL...");
            Document doc = Jsoup.connect(url).get();
            System.out.println("Connected.");

            // Print the raw HTML content for debugging
            System.out.println("Raw HTML content:");
            System.out.println(doc.html());

            // Adjust the selector based on actual HTML structure
            Elements cardElements = doc.select("img[src*='images/cards/']");
            System.out.println("Number of card elements: " + cardElements.size());

            List<GameCard> cards = new ArrayList<>();
            for (Element cardElement : cardElements) {
                // Extract card attributes from the image src attribute
                String src = cardElement.attr("src");
                String[] parts = src.split("/");
                String cardInfo = parts[parts.length - 1].replace(".gif", "");
                String[] attributes = cardInfo.split("_");

                String color = attributes[0];
                String shape = attributes[1];
                String shading = attributes[2];
                int number = Integer.parseInt(attributes[3]);

                cards.add(new GameCard(color, shape, shading, number));
                System.out.println("Added card: " + color + " " + shape + " " + shading + " " + number);
            }

            System.out.println("Total cards: " + cards.size());
            Game game = new Game(cards);
            List<List<GameCard>> sets = game.findSets();
            System.out.println("Number of sets found: " + sets.size());

            for (List<GameCard> set : sets) {
                System.out.println(set);
            }

            long endTime = System.currentTimeMillis();
            System.out.println("Execution time: " + (endTime - startTime) + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
