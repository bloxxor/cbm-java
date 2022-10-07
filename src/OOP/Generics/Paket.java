package OOP.Generics;

public class Paket<T> {

    private T inhalt;

    public T inhaltAuspacken() {
        return inhalt;
    }

    public void inhaltEinpacken(T inhalt) {
        this.inhalt = inhalt;
    }

}
