import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.zip.GZIPInputStream;

public class truckorder {

    public static void main(String[] args) throws FileNotFoundException {
        String truckid;
        String numpkg;
        String zipcode;
        int pos;
        Stack<truck> trucks = new Stack<>();
        String[] truckinfo = new String[0];
        String line;

        File f = new File("C:\\Users\\Jakub\\IdeaProjects\\CSC3630\\src\\truckorder");
        Scanner s = new Scanner(f);

        while (s.hasNextLine()) {
            line = s.nextLine();
            truckinfo = line.split(",");
            pos = Integer.parseInt(truckinfo[0]);
            truckid = truckinfo[1];
            zipcode = truckinfo[2];
            numpkg = truckinfo[3];
            truck tk = new truck(pos, truckid, zipcode, numpkg);
            trucks.push(tk);

        }
        s.close();

        System.out.printf("-------- here is your truck order --------\n");
        for (truck t : trucks) {
            System.out.printf(t.toString());
        }
        while (trucks.size() > 1) {

            String msg = "\n enter zipcode you want to search:";

            String zipinput = getinputfromuser(msg);

            if (zipinput.matches("\\d{5}")) {
                int position = 0;
                for (truck tk : trucks) {
                    if (tk.getZipcode().equalsIgnoreCase(zipinput)) {
                        System.out.printf("\npos: %s  truckid: %s  zipcode: %s  npack: %s",
                                tk.getPos(), tk.getTruckid(), tk.getZipcode(), tk.getNumpkg());
                        position++;
                    }
                }
                System.out.printf("\nFound " + position + " trucks that contain zip code " + zipinput);
                String msg2 = "\ndid you wanna remove these trucks? (Y | N)";
                String yinput = getinputfromuser2(msg2);

                if (yinput.equalsIgnoreCase("y")) {
                    trucks.removeIf(truck -> truck.getZipcode().equals(zipinput));

                } else {
                    System.out.printf("Ok, will not remove trucks, goodbye :)");
                    System.exit(1);
                }
                System.out.printf("\n-------- here is your new truck order --------\n");
                for (truck t : trucks) {
                    System.out.printf(t.toString());
                }

                System.out.printf("\nsuccessfully removed " + position + " trucks with zipcode " + zipinput);
                System.out.printf("\nthere are still %s ", trucks.size() + " trucks left");

                String msg4 = "\nwould you like to remove more trucks? ";

                String yinput2 = getinputfromuser2(msg4);

                if ( yinput2.equalsIgnoreCase("y")) {


                } else {
                    System.out.printf("\nok, quitting program, goodbye :)");
                    System.exit(1);
                }

            } else {
                System.out.printf("cannot parse input of %s", zipinput);

            }
        }
    }


    private static String getinputfromuser2(String msg2) {
        Scanner input2 = new Scanner(System.in);
        System.out.printf(msg2);
        String yninput = input2.next();
        return yninput;
    }

    private static String getinputfromuser(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.printf(msg);
        String zipcodeinput = input.next();
        return zipcodeinput;
    }
}
