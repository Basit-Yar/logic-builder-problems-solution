package com.learning.ipa.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution_01_02 {
    public static void main(String[] args) {

        Player[] players = new Player[4];
        Scanner scan = new Scanner(System.in);

        /**
         * to read the values of four Player objects referring attributes in the above-mentioned attribute sequence.         *
         */

        for (int i=0; i<players.length; i++) {
            int playerId = scan.nextInt();
            scan.nextLine();
            String playerName = scan.nextLine();
            int runs = scan.nextInt();
            scan.nextLine();
            String playerType = scan.nextLine();
            String matchType = scan.nextLine();

            players[i] = new Player(playerId, playerName, runs, playerType, matchType);
            System.out.println(players[i]);
        }

        /**
         * to read the value of two string parameter for capturing player type and match type.
         */

        System.out.print("Enter the player type: ");
        String playerType = scan.nextLine();
        System.out.print("Enter the match type: ");
        String matchType = scan.nextLine();

        int lowestRuns = findPlayerWithLowestRuns(players, playerType);

        if (lowestRuns > 0)
            System.out.println(lowestRuns);
        else
            System.out.println("No such player");

        Player[] requiredPlayers = findPlayerByMatchType(players, matchType);

        if (requiredPlayers != null)
            Arrays.stream(requiredPlayers)
                    .map(player -> player.getPlayerId())
                    .forEach(System.out::println);
        else
            System.out.println("No Player with given matchType");
    }

    /**
     * The method should return the least runs of the Player from an array of Player objects
     * for the given playerType.
     */
    public static int findPlayerWithLowestRuns(Player[] players, String playerType) {

        int lowestRuns = Arrays.stream(players)
                .filter(player -> player.getPlayerType().equalsIgnoreCase(playerType))
                .mapToInt(player -> player.getRuns())
                .min()
                .orElse(-1);

        return lowestRuns;
    }

    /** The method should return the array of Player objects belonging to the matchType passed
     *  as input parameter in Descending order of playerID.
     */
    public static Player[] findPlayerByMatchType(Player[] players, String matchType) {

        Player[] requiredPlayers = Arrays.stream(players)
                .filter(player -> player.getMatchType().equalsIgnoreCase(matchType))
                .sorted(Comparator.comparing(Player::getPlayerId).reversed())
                .toArray(Player[]::new);

        if (requiredPlayers.length < 1)
            return null;
        return requiredPlayers;
    }

}
