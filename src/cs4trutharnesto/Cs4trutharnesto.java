/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4trutharnesto;

/**
 *
 * @author TRUTH
 */
public class Cs4trutharnesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String volleyballplayer1 =("Brent Cristobal ");
        String position1 =("Wing Spiker ");
        String sex1 =("Male ");
        System.out.println("Volleyball Player 1 \nName: " + volleyballplayer1 + "\nVolleyball Position: " + position1 + "\nSex: " + sex1);
        String volleyballplayer2 =("DC Orongan ");
        String position2 =("Libero ");
        String sex2 =("Female ");
        System.out.println("\n\nVolleyball Player 2 \nName: " + volleyballplayer2 + "\nVolleyball Position: " + position2 + "\nSex: " + sex2);
        String volleyballplayer3 =("Miguel Cayetano ");
        String position3 =("Wing Spiker ");
        String sex3 =("Male ");
        System.out.println("\n\nVolleyball Player 3 \nName: " + volleyballplayer3 + "\nVolleyball Position: " + position3 + "\nSex: " + sex3);

        System.out.println("\n\nIt is "+sex1==sex3+" that "+volleyplayer1+" and "+volleyplayer3+" are the same gender");
        System.out.println("\nIt is "+position1==position3+" that "+volleyplayer1+" and "+volleyplayer3+" play the same position");
        System.out.println("\nIt is "+sex1==sex2+" that "+volleyplayer1+" and "+volleyplayer2+" are the same gender");
    }
    
}
