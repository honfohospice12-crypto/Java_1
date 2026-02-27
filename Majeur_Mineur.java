import java.util.Scanner;

public class Majeur_Mineur {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez saisir votre age : ");
        int age = sc.nextInt();
        if(age<18){
          System.out.print("Mineur");  
        }
        else{
            System.out.print("Majeur");
        }
        sc.close();
    }
    
}
