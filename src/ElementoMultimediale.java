public abstract class ElementoMultimediale {//creo un primo metodo abstract che andra poi ad essere esteso a tutti i suoi figli
    protected String Titolo; //creo la stringa titolo che poi passero come "super" ai figli
    public ElementoMultimediale( String Titolo){
        this.Titolo = Titolo;
    }
    public abstract void esegui();//il player esegui.
}
