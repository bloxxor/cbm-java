package OOP.VererbungTierheim;

public class Katze extends Saeugetier{

    public Katze(String name, int alter){
        super (name, alter);
    }

    @Override   //mit override wird die Funktion der Elternklasse überschrieben!!!
                //muss vor jede Methode explizit erneut gesetzt werden!
    public void geraeuschMachen(){
        System.out.println("MIAU!");
    }

    public void bewegen(){}

    //public abstract void bewegen();
    // -> wenn die Methode als abstract deklariert ist, dann muss oben die Klasse auch als abstrakt deklariert sein!!!


}
