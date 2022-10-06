package OOP.VererbungTierheim;

public abstract class Saeugetier {

    public String name;
    public int alter;

    public Saeugetier(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void geraeuschMachen(){
        System.out.println("Macht geräusch!");
    }

                    // jede Child-Klasse muss die Methode entweder selbst abstrakt deklarierem oder konkret implementieren
    public abstract void bewegen();  //{
        //System.out.println("Tier bewegt sich");
    //}


}
