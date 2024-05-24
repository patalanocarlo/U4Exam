import  java.util.Scanner;
public class Main {
    public static void main(String[] args) { //per prima cosa mi sono importato lo Scanner fulcro del Main.
        Scanner value=new Scanner(System.in); //per mia comodità gli ho dato un nome value per l'utilizzo.
        ElementoMultimediale[] elementi= new ElementoMultimediale[5]; //mi sono creato un array vuoto al quale applicherò una sorta di push dove entreranno solo massimo 5 elementi.

        for (int i = 0; i < 5; i++){ // qui imposto un for loop che dice che finche i  sarà minore di 5 allora io:
            System.out.println("Inserisci il tipo di elemento a tua scelta, ecco la lista comandi: (1:Immagine,2:Audio,3:Video)"); //stampo il messaggio per far scegliere il tipo di elemento selezionato.
            int tipoElementoScelto= value.nextInt(); //da qui permetto la scrittura del comando attraverso il mio scanner.
            value.nextLine();
            System.out.println("Inserisci un Titolo che desideri:");//ora faccio utilizzare il titolo che poi sarà diverso in fase finale.
            String TitoloDelelementoScelto=value.nextLine(); //qua utilizzo lo scanner sul titolo
            if (tipoElementoScelto==1){      //qua creo un simil equals dove vado a dire che se il l'elemento selezionato è 1 farò:
                System.out.println("Vedo che hai scelto l'Immagine."); //faccio inserire al utente la luminsoità e il titolo.
                System.out.println("Inserisci la luminosità:");
                int luminosità = value.nextInt();
                elementi[i]=new Immagine(TitoloDelelementoScelto,luminosità);
            } else if  (tipoElementoScelto == 2) { //analogamente faro cosi per tutto il sistema di if condition al interno del for
                System.out.println("Vedo che hai scelto l'Audio");
                System.out.println("Inserisci la durata: "); //inserisoc durata e volume attraverso lo scanner.
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
        int scelta; //in finale vado a crearmi un nuovo valore di scelta il quale stamperà:
        do { //mi stampa tutti gli elmenti attraverso la loro posizione nell'array riempito da 1 a 6 e vado a chiuder il sistema al seguito del comando "0"
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

