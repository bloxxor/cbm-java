package OOP.VererbungTierheim;

public class Perser extends Katze{

    boolean langHaarig = true;

    public Perser(String name, int alter){
        super(name, alter);
    }
    @Override
    public void bewegen(){
        System.out.println("Bewegt sich elegant");
    }
}
