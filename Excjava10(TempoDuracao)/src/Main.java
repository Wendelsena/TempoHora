import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       int HoraInicio, HoraTermino;

       System.out.println("Descubra quanto tempo durou sua partida de Valorant.");

       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       System.out.println("\nQual foi o horario de início?:  ");
       HoraInicio = sc.nextInt();
        
       System.out.println("\nQual o horario de término?:  ");
       HoraTermino = sc.nextInt();

       if (HoraInicio == 0 && HoraTermino == 0) {
    	   System.out.println("A partida durou 24 horas, misericordia!");
       }
       
       else if (HoraInicio > HoraTermino) {
    	   System.out.printf("\nA partida durou %d hora(s)", (24 - HoraInicio) + HoraTermino );
       }
       
       else {
    	   System.out.printf("\nA partida durou %d hora(s)", HoraTermino - HoraInicio );
       }

        	sc.close();

        }

    }