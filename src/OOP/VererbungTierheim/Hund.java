package OOP.VererbungTierheim;

public class Hund extends Saeugetier{

    public Hund(String name, int alter){
        super (name, alter);
    }

    @Override   //mit override wird die Funktion der Elternklasse überschrieben!!!
    public void geraeuschMachen(){
        //super.geraeuschMachen();    //übernimmt die Funktion aus der Elternklasse und gibt die aus!
        System.out.println("WUFF!");
    }

    public void bewegen(){
        System.out.println(name + " hüpft vor sich her");    // die Variablen wie name werden per extends auch von der Elternklasse vererbt!
    }
}
