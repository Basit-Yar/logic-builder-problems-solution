package com.learning.ipa.practice;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_01_02 {
    public static void main(String[] args) {

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

        return requiredPlayers;
    }

}
