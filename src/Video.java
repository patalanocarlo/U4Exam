public class Video extends ElementoMultimediale { //dopo audio ho realizzato video.java andando sempre a estendere il suo genitore.
    private int durata; //creo i valori int come richiesti nella traccia per il video.
    private int volume;
    private int luminosità;
    public Video(String Titolo, int durata ,int volume , int luminosità){ //anche qui li passo come valori e ovviamente gli passo la stringa del titolo che come detto prima deve essere presente.
        super(Titolo);
        this.durata=durata;
        this.volume=volume ;
        this.luminosità=luminosità;
    }
    public void alzaVolume(){
        volume++; //qui una funzionalita per alzare e successivamente abbassare il volume e aumentare e diminuire la luminosità.
    }
    public void abbassaVolume(){
        if (volume > 0) volume--;
    }

    public void aumentaLuminosita() {
        luminosità++;
    }

    public void diminuisciLuminosita() {
        if (luminosità > 0) luminosità--;
    }
    public void esegui() { //qui stampo il titolo e la sequenza in ordine dei valori che poi daro a volume e luminosità sotto forma di "!" e "*"
        for (int i = 0; i < durata; i++) {
            System.out.println(Titolo + " " + "!".repeat(volume) + "*".repeat(luminosità));
        }
    }
}
