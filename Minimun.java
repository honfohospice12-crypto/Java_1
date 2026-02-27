import java.util.Scanner;

public class Minimun {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez saisir le premier nombre: ");
        int nbr1 = sc.nextInt();
        System.out.print("Veuillez saisir le deuxième nombre: ");
        int nbr2 = sc.nextInt();
        if(nbr1<nbr2){
           System.out.print("Le minimum des deux nombres entrés est: "+nbr1);
        }
        else{
            System.out.print("Le minimum des deux nombres entrés est: "+nbr2);
        }
        sc.close();
    }
}


