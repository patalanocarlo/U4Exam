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
      if (luminosità > 0) luminosità--;
    }
    @Override
    public void esegui(){
        System.out.println(Titolo + " " + "*".repeat(luminosità));
    }
}
