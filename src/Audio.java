public class Audio  extends ElementoMultimediale{//creo la classe public e la estendo come in riferimento al genitore
    private int durata; //come richiesto dalla traccia creo durata e volume come valori private
    private  int volume;
    public Audio( String Titolo , int durata , int volume){ //li passso prima come parametri al interno di Audio ovviamente anche il titolo che è l'elemento che dovra essere presente sempre in ogni elemento portante.
        super(Titolo);
        this.durata=durata;
        this.volume=volume;
    }
    public void alzaVolume(){
        volume++;           //Metodo void per alzare il volume
    }
    public void DiminuisciVolume(){
        if (volume > 0) volume--; //Metodo void per abbassare il volume che valute inizialmente la posizione del volume che se è maggiore di 0 allora si attivera per essere abbassato.
    }
    @Override
public void esegui(){ //il metodo esegui con un for loop che valuta come consolelog il titolo che andremo a digitare + la ripetzione del simbolo"!" che verra ripetuto con il comando "repeat"
        for (int i=0 ; i < durata;i++){
            System.out.println(Titolo + " "+ "!".repeat(volume));
        }
    }
}
