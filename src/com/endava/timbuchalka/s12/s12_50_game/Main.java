package com.endava.timbuchalka.s12.s12_50_game;

/*
    Only add/edit code where it is stated in the description.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private final Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private final Map<String, String> vocabulary = new HashMap<>();

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main() {
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        command();
    }

    public void command() {
        Scanner scanner = new Scanner(System.in);
        int loc = 1;

        vocabulary.put("QUIT", "Q");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("NORTH", "N");

        while (loc != 0) {
            System.out.println(locations.get(loc).getDescription());
            System.out.print("Available exits are ");
            for (String exit: locations.get(loc).getExits().keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String command = "";
            String phrase = scanner.nextLine();
            for (String word : phrase.split(" ")) {
                if (vocabulary.containsKey(word.toUpperCase())) {
                    command = vocabulary.get(word.toUpperCase());
                    break;
                }
            }
            if (!command.isEmpty() && locations.get(loc).getExits().containsKey(command)) {
                loc = locations.get(loc).getExits().get(command);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
        System.out.println(locations.get(0).getDescription());
    }
}