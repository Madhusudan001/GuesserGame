import java.util.Scanner;


public class LaunchGame {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.GetNumberfromGuesser();
        u.GetNumberfromPlayers();
        u.compare();
    }

}

