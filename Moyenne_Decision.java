public class Moyenne_Decision {
    public static void main(String[] args){
        int note_1,note_2,note_3;
        note_1 = 15;
        note_2 = 20;
        note_3 = 18;
        float mean = (note_1 + note_2 + note_3)/ 3;
        if(mean >=10){
            System.out.print("Admis");
        }
        else{
            System.out.print("Ajourné");
        }

    }
    
}
