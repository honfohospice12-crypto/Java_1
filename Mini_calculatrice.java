import java.util.Scanner;

public class Mini_calculatrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez saisir le premier nombre pour l'opérartion: ");
        float nbr1 = sc.nextFloat();
        System.out.print("Veuillez saisir le second nombre pour l'opérartion: ");
        float nbr2 =sc.nextFloat();
        System.out.println("On vous propose quatres opérations: ");
        System.out.println("1-Addition");
        System.out.println("2-Soustraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        System.out.print("Choisissez une operation en utilisant le nombre: ");
        int nbr = sc.nextInt();
        float a = nbr1 + nbr2 ;
        float b = nbr1 - nbr2 ;
        float c = nbr1 * nbr2;
        float d = nbr1 / nbr2;
        if(nbr ==1){
            System.out.print("Le resultat attendu est: "+ a);
        }
        else if (nbr ==2) {
            System.out.print("Le resultat attendu est: "+ b);
        }
        else if (nbr ==3) {
            System.out.print("Le resultat attendu est: "+ c);
        }
        else{
            System.out.print("Le resultat attendu est: "+ d);
        }
        sc.close();
    }
    
}
