/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coins;
import java.util.*;
/**
 *
 * @author bfdevera
 */
public class Coins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        
        double[] peso = {10,5,1,0.25};
        double maxPeso = 572.75;
        double MoneyProduce = 0;
        int counter = 0;
        int Quantity[] = new int[4];
        
        while (MoneyProduce < maxPeso) {
        if (MoneyProduce + peso[counter] <= maxPeso) {
            Quantity[counter] += 1;
            MoneyProduce=+peso[counter];
        }else counter++;
        }
         System.out.println("10 peso bill: " +Quantity[0] + "\n 5 peso bill: " +Quantity[1] + "\n 1 peso bill: " +Quantity[2] + "\n 25 cents bill: "+Quantity[3]);
        }    
        }
        
        
    
    

