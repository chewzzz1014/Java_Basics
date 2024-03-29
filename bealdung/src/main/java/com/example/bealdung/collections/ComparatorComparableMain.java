package com.example.bealdung.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparableMain {

    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);


        System.out.println("Before Sorting : " + footballTeam);
        Collections.sort(footballTeam);
        System.out.println("After Sorting : " + footballTeam);

        PlayerRankingComparator playerRankingComparator = new PlayerRankingComparator();
        System.out.println("Before Sorting by player ranking : " + footballTeam);
        Collections.sort(footballTeam, playerRankingComparator);
        System.out.println("After Sorting by player ranking: " + footballTeam);

        // Comparator using lambda
        Comparator byRanking = Comparator.comparing(Player::getRanking);
        Comparator byAge = Comparator.comparing(Player::getAge);


    }
}
