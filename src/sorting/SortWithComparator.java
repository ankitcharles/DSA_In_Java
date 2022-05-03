package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithComparator {

    public SortWithComparator(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    private int ranking;
        private String name;
        private int age;

         public String getName() {
            return name;
         }

        public int getRanking() {
            return ranking;
        }
        public static class PlayerRankingComparator implements Comparator<SortWithComparator> {
            @Override
            public int compare(SortWithComparator player1, SortWithComparator player2) {
                return Integer.compare(player1.getRanking(), player2.getRanking());
            }
           // PlayerRankingComparator playerRankingComparator = new PlayerRankingComparator();
        }
        public static <footballTeam> void main(String[] args) {
            List<SortWithComparator> footballTeam = new ArrayList<>();
            /*sorting.Player p1 = new sorting.Player(24, "John", 21);
            sorting.Player p2 = new sorting.Player(35, "Roger", 23);
            sorting.Player p3 = new sorting.Player(14, "Steven", 19); */
           PlayerRankingComparator playerRankingComparator = new PlayerRankingComparator();

            SortWithComparator player1 = new SortWithComparator(24,"John",21);
            SortWithComparator player2 = new SortWithComparator(35,"Roger",23);
            SortWithComparator player3 = new SortWithComparator(14,"Steven",19);
            footballTeam.add(player1);
            footballTeam.add(player2);
            footballTeam.add(player3);

            System.out.println("Before sorting:");
            for (SortWithComparator player : footballTeam) {
                System.out.println("player name:" + player.getName());

            }
            Collections.sort(footballTeam,playerRankingComparator);
            System.out.println("After Sorting:");
            for (SortWithComparator player : footballTeam) {
                System.out.println("player in sorting order:" + player.getName());
            }

        }
    }

