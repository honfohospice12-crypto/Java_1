import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre entier : ");
        int n = sc.nextInt();
        int i;
        long factoriel = 1;
        for(i =1 ;i<=n; i ++){
            factoriel = factoriel*i;
        }
        System.out.println("Le factoiel du nombre saisi est : " + factoriel);
        sc.close();
    }
    
}
