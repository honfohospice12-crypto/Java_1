import java.util.Scanner;

public class Info_utilisateur {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez saisir votre prenom : ");
        String prenom = sc.nextLine();
        System.out.print("Veuillez saisir votre age : ");
        int age = sc.nextInt();
        System.out.println("Bienvenue " +prenom+ ". Vous avez "+age+"ans.");
        sc.close();
    }
    
}
