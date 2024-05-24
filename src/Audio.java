public class Audio  extends ElementoMultimediale{
    private int durata;
    private  int volume;
    public Audio( String Titolo , int durata , int volume){
        super(Titolo);
        this.durata=durata;
        this.volume=volume;
    }
    public void alzaVolume(){
        volume++;
    }
    public void DiminuisciVolume(){
        if (volume > 0) volume--;
    }
    @Override
public void esegui(){
        for (int i=0 ; i < durata;i++){
            System.out.println(Titolo + " "+ "!".repeat(volume));
        }
    }
}
