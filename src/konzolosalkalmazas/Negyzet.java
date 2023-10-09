package konzolosalkalmazas;

public class Negyzet {

    private int a;
    private Koordinata koord;

    public int getATerulet() {
        return a * a;
    }

    public void setA(int a) {
        if (a <= 0) {
            a = 1;
        }
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public Koordinata getKoord() {
        return koord;
    }

    public void setKoord(Koordinata koord) {
        this.koord = koord;
    }

    @Override
    public String toString() {
        return "Negyzet{" + "a=" + a + ", x=" + koord.getX() +",y="+koord.getY()+ '}';
    }

    
    
    
    

}
