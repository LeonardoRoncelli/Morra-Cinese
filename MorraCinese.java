import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        String giocatore1;
        String giocatore2;
        String giocata1;
        String giocata2;
        System.out.print("Inserisci il nome del primo giocatore");
        giocatore1= input.nextLine();
        System.out.print("Inserisci il nome del secondo giocatore");
        giocatore2= input.nextLine();
        System.out.println("Gioca " +giocatore1);
        giocata1= input.nextLine();
        System.out.println("Gioca " +giocatore2);
        giocata2= input.nextLine();
        if (giocata1.equalsIgnoreCase("forbici")&&giocata2.equalsIgnoreCase("carta")){
            System.out.println("Vince " +giocatore1);
        }
        if (giocata1.equalsIgnoreCase("forbici")&&giocata2.equalsIgnoreCase("pietra")){
            System.out.println("Vince " +giocatore2);
        }
        if (giocata1.equalsIgnoreCase("carta")&&giocata2.equalsIgnoreCase("forbici")){
            System.out.println("Vince " +giocatore2);
        }
        if (giocata1.equalsIgnoreCase("carta")&&giocata2.equalsIgnoreCase("pietra")){
            System.out.println("Vince " +giocatore1);
        }
        if (giocata1.equalsIgnoreCase("pietra")&&giocata2.equalsIgnoreCase("forbici")){
            System.out.println("Vince " +giocatore1);
        }
        if (giocata1.equalsIgnoreCase("pietra")&&giocata2.equalsIgnoreCase("carta")){
            System.out.println("Vince " +giocatore2);
        }
    }
}