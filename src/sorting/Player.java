package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Player implements Comparable<Player> {

    private int ranking;

    public String getName() {
        return name;
    }

    private String name;
    private int age;

    public int getRanking() {
        return ranking;
    }

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Player otherPlayer){
        return Integer.compare(getRanking(),otherPlayer.getRanking());

    }

    public static <footballTeam> void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player p1 = new Player(24,"John",21);
        Player p2 = new Player(35,"Roger",23);
        Player p3 = new Player(14,"Steven",19);
        footballTeam.add(p1);
        footballTeam.add(p2);
        footballTeam.add(p3);

        System.out.println("Before sorting:");
        for (Player player : footballTeam){
            System.out.println("player name:" +player.getName());

        }
        Collections.sort(footballTeam);
        System.out.println("After Sorting:");
        for (Player player : footballTeam){
            System.out.println("player in sorting order:" +player.getName());
        }

    }
}
