public class Immagine extends ElementoMultimediale {
    private int luminosità;

    public Immagine(String Titolo , int luminosità){
        super(Titolo);
        this.luminosità=luminosità;
    }
    public void aumentaLuminosità(){
        luminosità++;
    }
    public void  diminuisciLuminosità(){
        luminosità--;
    }
}
