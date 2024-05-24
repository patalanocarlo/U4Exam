import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        ElementoMultimediale[] elementi= new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Inserisci il tipo di elemento a tua scelta, ecco la lista comandi: (1:Immagine,2:Audio,3:Video)");
            int tipoElementoScelto= value.nextInt();
            value.nextLine();
            System.out.println("Inserisci un Titolo che desideri:");
            String TitoloDelelementoScelto=value.nextLine();
            if (tipoElementoScelto==1){
                System.out.println("Vedo che hai scelto l'Immagine.");
                System.out.println("Inserisci la luminosità:");
                int luminosità = value.nextInt();
                elementi[i]=new Immagine(TitoloDelelementoScelto,luminosità);
            } else if  (tipoElementoScelto == 2) {
                System.out.println("Vedo che hai scelto l'Audio");
                System.out.println("Inserisci la durata: ");
                int durata = value.nextInt();
                System.out.println("Inserisci il volume: ");
                int volume = value.nextInt();
                elementi[i] = new Audio(TitoloDelelementoScelto, durata, volume);
            }else if (tipoElementoScelto == 3) {
                System.out.println("Inserisci la durata: ");
                int durata = value.nextInt();
                System.out.println("Inserisci il volume: ");
                int volume = value.nextInt();
                System.out.println("Inserisci la luminosità: ");
                int luminosita = value.nextInt();
                elementi[i] = new Video(TitoloDelelementoScelto, durata, volume, luminosita);
            }
        }
        int scelta;
        do {
            System.out.println("Inserisci il numero dell'elemento da eseguire (1-5) oppure 0 per finire: ");
            scelta=value.nextInt();
            if (scelta > 0 && scelta <= 5) {
                ElementoMultimediale elemento = elementi[scelta - 1];
                elemento.esegui();
            }
        } while (scelta != 0);
      value.close();
        }
    }

