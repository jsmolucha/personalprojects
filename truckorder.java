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
        String[] truckinfo = new String [0];
        String line;

        File f = new File("C:\\Users\\Jakub\\IdeaProjects\\CSC3630\\src\\truckorder");
        Scanner s = new Scanner(f);

        while(s.hasNextLine()){
            line  = s.nextLine();
            truckinfo = line.split(",");
            pos = Integer.parseInt(truckinfo[0]);
            truckid = truckinfo[1];
            zipcode = truckinfo[2];
            numpkg = truckinfo[3];
            truck tk = new truck(pos, truckid, zipcode, numpkg);
            trucks.push(tk);

        }
            s.close();

        System.out.printf("here is your truck order --------\n");
        for(truck t : trucks) {
            System.out.printf(t.toString());
        }

        String msg = "enter zipcode do you want:";

        String zipinput = getinputfromuser(msg);

        int position = 0;
        for (truck tk : trucks) {
          if(tk.getZipcode().equalsIgnoreCase(zipinput)) {
                System.out.printf("\npos: %s  truckid: %s  zipcode: %s  npack: %s",
                        tk.getPos(), tk.getTruckid(), tk.getZipcode(), tk.getNumpkg());
                position++;
           }
        }
        System.out.printf("\nFound " + position + " trucks with zip code " + zipinput);
            String msg2 = "\ndid you wanna remove these trucks? (Y | N)";
            String yinput = getinputfromuser2(msg2);

                for (truck tk2 : trucks) {
                    if(tk2.getZipcode().equalsIgnoreCase(zipinput) && yinput.equalsIgnoreCase("y")) {

                        Iterator<truck> itr = trucks.iterator();

                        while(itr.hasNext()); {
                            truck zip = itr.next();
                            if(zip.equals(zipinput)) {
                                itr.remove();
                            }
                        }
                     }
                 }

        System.out.printf("stack size is: %s ", trucks.size());

    }

    private static String getinputfromuser2(String msg2) {
        Scanner input2 = new Scanner(System.in);
        System.out.printf(msg2);
        String yninput = input2.next();
        return yninput;
    }


    private static void showmethezips(Stack<truck> trucks) {
        System.out.printf("Here is your truck \n");

    }

    private static String getinputfromuser(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.printf(msg);
        String zipcodeinput = input.next();
        return zipcodeinput;

    }


}
