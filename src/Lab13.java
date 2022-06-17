// Ariam Salazar
// Math-130
// Professor Raul Vargas
// May 13,2021

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab13 {
    public static void main(String[] args) throws Exception{
        
        String  shipType = null;
        String name = null;
        int year;
        int passengers;
        int cargo;

        File shipsFile = new File("ships.txt");
        Scanner scan = new Scanner(shipsFile);

        Ship[] array = new Ship[10];
        
        System.out.println("================");
        
        for(int i = 0; i < array.length; i++){
            if(i <=4){
              shipType = scan.next();
              name = scan.next();
              scan.next();
              year = scan.nextInt();
            
            array[i] = new Ship(name,year);
            System.out.println(array[i]);
            if(i == 4){
                System.out.println("========");
            }
            }

            else if(i > 4 && i <= 6){
              shipType = scan.next();
              name = scan.next();
              scan.next();
              passengers = scan.nextInt();

              array[i] = new CruiseShip(name,passengers);
              System.out.println(array[i]);

              if(i == 6){
                System.out.println("========");
            }
                
            }
            else{
              shipType = scan.next();
              name = scan.next();
              scan.next();
              cargo = scan.nextInt();

              array[i] = new CargoShip(name,cargo);
              System.out.println(array[i]);
            }

        }
        System.out.println("================");




    }
}
