import java.util.Locale;
import java.util.Scanner;

public class Main {
 

 
    public static void main(String[] args) 
    {
       double pierwsza_l;  
       double druga_l;
       char znak;      
       Scanner wej = new Scanner(System.in);   
       
 
       System.out.println("Dodawanie dwóch liczb - wciśnij 1");
       System.out.println("Odejmowanie dwóch liczb - wciśnij 2");
       System.out.println("Mnożenie dwóch liczb - wciśnij 3");
       System.out.println("Dzielenie dwóch liczb - wciśnij 4");
       
 
       znak = wej.next().charAt(0);  

        System.out.println("Podaj pierwszą liczbę:"); 
       pierwsza_l = wej.nextDouble();
       System.out.println("Podaj drugą liczbę:");
       druga_l = wej.nextDouble();
      
       switch(znak)     
       {
           case '1':    
           {
               System.out.println(pierwsza_l + druga_l);
               break;
           }
           case '2':    
           {
               System.out.println(pierwsza_l - druga_l);
               break;
           }
           case '3':    
           {
               System.out.println(pierwsza_l * druga_l);
               break;
           }
           case '4':   
           {           
               if(druga_l !=0)
               {
                 System.out.println(pierwsza_l / druga_l + "oraz reszty: " +
                         pierwsza_l % druga_l);
               }
               else
               {
                   System.out.println("Nie dzielimy przez zero!!!");
               }
               break;
           }
           
               
          
 
       }
 
    }
}
