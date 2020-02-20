import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class allstarbaseball {
    public static void main(String[] args) {
        String player;
        double batavg;
        int inning = 0;
        int hits = 0;
        int runs = 0;
        int strikes = 0;
        Queue<player> lineup = new LinkedList<>();
        lineup.add(new player("Ty Cobb", 0.366));
        lineup.add(new player("Rogers Hornsby", 0.359));
        lineup.add(new player("Joe Jackson", 0.356));
        lineup.add(new player("Ted Williams", 0.344));
        lineup.add(new player("Lefty O’Doul", 0.349));
        lineup.add(new player("Babe Ruth", 0.342));
        lineup.add(new player("Lou Gehrig", 0.340));
        lineup.add(new player("Joe DiMaggio", 0.323));
        lineup.add(new player("Tony Gwynn", 0.339));


        for (player p : lineup) {

            System.out.printf("\n player: %s bat avg: %s", p.getPlayer(), p.getBatavg());

        }



        while ( inning < 9 ) {
            String msg = "\nWould you like to start a game? y or n";

            for (int i = 0; i < inning; i++) {

            }

            inning++;
            String gameprompt = promptforgame(msg);

            if (gameprompt.equalsIgnoreCase("y")) {

                System.out.printf("\nInning: %s start", inning);

                while (lineup.size() > 1) {

                    player nextplayer = lineup.remove();
                    var d = Math.random();

                    //---------
                    if (d < nextplayer.getBatavg()) {

                        System.out.printf("\nHIT!! %s with bat avg %s", nextplayer.getPlayer(), nextplayer.getBatavg());
                        hits++;

                    } else {
                        System.out.printf("\nSTRIKE!! %s with bat avg %s", nextplayer.getPlayer(), nextplayer.getBatavg());
                        strikes++;
                    }

                    if (hits >= 3) {
                        runs++;
                    }

                    if (strikes >= 3) {

                        System.out.printf("\n---inning is over |inning: %s | hits: %s | runs: %s |", inning, hits, runs);
                        System.out.printf("\n play another inning? y or n");
                        String gameprompt2 = promptforanothergame();
                        if (gameprompt2.equalsIgnoreCase("y")) {
                            inning++;
                            hits = 0;
                            strikes =0;

                        }
                    }
                    if (inning == 9) {
                        System.out.printf("GAME OVER, INNING 9");
                        System.exit(1);
                    }
                    lineup.add(nextplayer);
                }


                System.out.printf("\nInning %s results: runs %s | hits: %s | strikes: %s", inning, runs, hits, strikes);
                inning++;
            } else {
                System.out.printf("ok, closing");
                System.exit(1);
            }
        }


    }

    private static String promptforanothergame() {
        Scanner s = new Scanner(System.in);
        String yinput2 = s.next();
        return yinput2;
    }

    private static String promptforgame(String msg) {
        Scanner s = new Scanner(System.in);
        System.out.printf(msg);
        String yinput = s.next();
        return yinput;
    }
}
