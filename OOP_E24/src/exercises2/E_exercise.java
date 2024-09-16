/*
Problem 5. We want to model a double (2 vs. 2) badminton tournament.
• Write a class to represent a badminton player. A player has a first name,
a last name, an age, a number of won and lost matches, and an optional
sponsor. Write appropriate constructors for the player class. Add a
method to the player class to compute that player’s win-loss ratio.
• Write a class to represent a team. A team has a team name and consists
of two players. Add an appropriate constructor. Add a method to
compute the average age of the team.
• Write a class to represent a single match between two teams, red and
blue. Add an appropriate constructor. Add a method to compute the
average age of all the players in the match. Add a method to find the
player with the best win-lost ratio of all the players in the match. Add
a method to signal that one team has won/lost the match and update
the player statistics of each player accordingly.
*/

class Player {
    private String firstName;
    private String lastName;
    private int age;
    private int wins;
    private int losses;
    private String sponsor;

    Player(String fn, String ln, int a, int w, int l, String s) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
        this.wins = w;
        this.losses = l;
        this.sponsor = s;
    }

    Player(String fn, String ln, int a, int w, int l) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
        this.wins = w;
        this.losses = l;
        this.sponsor = null;
    }

    double winRatio() {
        return (double) this.wins / this.losses;
    }

    String stats() {
        return this.firstName + " " + this.lastName
                + " has " + this.wins + " wins and " + this.losses + " losses.";
    }
}

class Team {
    private String name;
    private Player player1;
    private Player player2;

    Team(String n, Player p1, Player p2) {
        this.name = n;
        this.player1 = p1;
        this.player2 = p2;
    }

    double avgAge() {
        return (double) (player1.age + player2.age) / 2;
    }

    Player bestPlayer() {
        return player1.winRatio() >= player2.winRatio() ? player1 : player2;
    }

    void teamWin() {
        player1.wins += 1;
        player2.wins += 1;
    }

    void teamLoss() {
        player1.losses += 1;
        player2.losses += 1;
    }

    void stats() {
        System.out.println(this.player1.stats());
        System.out.println(this.player2.stats());
    }
}

class Match {
    private Team redTeam;
    private Team blueTeam;

    Match(Team t1, Team t2) {
        this.redTeam = t1;
        this.blueTeam = t2;
    }

    double avgAge() {
        return (redTeam.avgAge() + blueTeam.avgAge()) / 2;
    }

    Player bestPlayer() {
        return redTeam.bestPlayer().winRatio() >= blueTeam.bestPlayer().winRatio() ? redTeam.bestPlayer() : blueTeam.bestPlayer();
    }

    void redWin() {
        System.out.println(redTeam.name + " wins!");
        redTeam.teamWin();
        blueTeam.teamLoss();
    }

    void blueWin() {
        System.out.println(blueTeam.name + " wins!");
        redTeam.teamLoss();
        blueTeam.teamWin();
    }

    void stats() {
        System.out.println("Red team (" + redTeam.name + "):");
        redTeam.stats();
        System.out.println("Blue team (" + blueTeam.name + "):");
        blueTeam.stats();
    }
}

public class E_exercise {
    public static void main(String[] args) {
        Player bertram = new Player("Bertram", "Ipsen", 30, 5, 0);
        Player alberte = new Player("Alberte", "Lohse", 28, 3, 2, "MBS AAU");
        Player peter = new Player("Peter", "Soenderby", 29, 4, 1);
        Player monique = new Player("Monique", "Fruerlund", 29, 2, 3);

        Team albertram = new Team("Albertram", bertram, alberte);
        Team moneter = new Team("Moneter", peter, monique);

        Match aeroe = new Match(albertram, moneter);
        aeroe.stats();
        aeroe.redWin();
        aeroe.stats();
        aeroe.redWin();
        aeroe.stats();
        aeroe.blueWin();
        aeroe.stats();
        System.out.println("The best player is: " + aeroe.bestPlayer().firstName);
    }
}
