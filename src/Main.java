import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        ElementoMultimediale[] elementi= new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Inserisci il tipo di elemento a tua scelta, ecco la lista comandi: (1:Immagine,2:Audio,3:Video)");
            int tipoElementoScelto= value.nextInt();
            value.nextLine();
        }
    }
}
