package com.learning.ipa.practice;

import java.util.Arrays;

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

    // TODO: 10/22/2024 : The method should return the array of Player objects belonging to the matchType passed as input parameter in Descending order of playerID. 
    public static void findPlayerByMatchType(Player[] players, String matchType) {
        
    }

}
