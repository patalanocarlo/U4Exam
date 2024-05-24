public class Immagine extends ElementoMultimediale { //In modo analogo ho creato le immagini con una struttura simile alle altre classi viste prima
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
    //funzionalita finale per stampare il repeat della luminosita legata al immagine.
    public void esegui(){
        System.out.println(Titolo + " " + "*".repeat(luminosità));
    }
}
