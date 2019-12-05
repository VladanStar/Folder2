
package javamt05;

import java.util.Scanner;


public class JavaMT05 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unestite iznos za isplatu: ");
        int iznos;
        iznos = input.nextInt();
        
        int isplata5000 = 0;
        int isplata2000 = 0;
        int isplata1000 = 0;
        int isplata500 = 0;
        int isplata200 = 0;
        int isplata100 = 0;
        int isplata50 = 0;
        int isplata20 = 0;
        int isplata10 = 0;
        int isplata5 = 0;
        int isplata2 = 0;
        int isplata1 = 0;
        
        while(iznos >= 5000){
            isplata5000++;
            iznos -=5000;
        
        }
       while(iznos >= 2000){
            isplata2000++;
            iznos -=2000;
        
        }
        while(iznos >= 1000){
            isplata1000++;
            iznos -=1000;
        
        }
        while(iznos >= 500){
            isplata500++;
            iznos -=500;
        
        }
        while(iznos >= 200){
            isplata200++;
            iznos -=200;
        
        }
        while(iznos >= 100){
            isplata100++;
            iznos -=100;
        
        }
        while(iznos >= 50){
            isplata50++;
            iznos -=50;
        
        }
            
        while(iznos >= 20){
            isplata20++;
            iznos -=20;
        
        }
        while(iznos >= 10){
            isplata10++;
            iznos -=10;
        
        } 
        while(iznos >= 5){
            isplata5++;
            iznos -=5;
        
        } 
        while(iznos >= 2){
            isplata2++;
            iznos -=2;
        
        } 
        while(iznos >= 1){
            isplata10++;
            iznos -=1;
        
        } 
        
        if(isplata5000 > 0){
            System.out.println("I(splatiti za isplatu  "+ isplata5000+ " novcanica od 5000 din)");
        }
         if(isplata2000 > 0){
            System.out.println("I(splatiti za isplatu  "+ isplata2000+ " novcanica od 2000 din)");
        }
          if(isplata1000 > 0){
            System.out.println("I(splatiti za isplatu  "+ isplata1000+ " novcanica od 1000 din)");
        }
           if(isplata500 > 0){
            System.out.println("I(splatiti za isplatu  "+ isplata500+ " novcanica od 500 din)");
        }
            if(isplata200 > 0){
            System.out.println("I(splatiti za isplatu  "+ isplata200+ " novcanica od 200 din)");
        }
             if(isplata100 > 0){
            System.out.println("I(splatiti za isplatu  "+ isplata100+ " novcanica od 100 din)");
        }
              if(isplata50 > 0){
            System.out.println("I(splatiti za isplatu  "+ isplata50+ " novcanica od 50 din)");
        }
               if(isplata20 > 0){
            System.out.println("I(splatiti za isplatu  "+ isplata20+ " novcanica od 20 din)");
        }
                if(isplata10 > 0){
            System.out.println("I(splatiti za isplatu  "+ isplata10+ " novcanica od 10 din)");
        }
                 if(isplata5 > 0){
            System.out.println("I(splatiti za isplatu  "+ isplata5+ " novcanica od 5 din)");
        }
                  if(isplata2 > 0){
            System.out.println("I(splatiti za isplatu  "+ isplata2+ " novcanica od 2 din)");
        }
                   if(isplata1 > 0){
            System.out.println("I(splatiti za isplatu  "+ isplata1+ " novcanica od 1 din)");
        }
    }
    
}
