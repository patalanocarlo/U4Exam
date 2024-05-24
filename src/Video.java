public class Video extends ElementoMultimediale {
    private int durata;
    private int volume;
    private int luminosità;
    public Video(String Titolo, int durata ,int volume , int luminosità){
        super(Titolo);
        this.durata=durata;
        this.volume=volume ;
        this.luminosità=luminosità;
    }
    public void alzaVolume(){
        volume++;
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
    public void esegui() {
        for (int i = 0; i < durata; i++) {
            System.out.println(Titolo + " " + "!".repeat(volume) + "*".repeat(luminosità));
        }
    }
}
