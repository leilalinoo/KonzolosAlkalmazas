package konzolosalkalmazas;

public class Negyzet {

    int a;

    public int getATerulet() {
        return a * a;
    }

    public void setA(int a) {
        if (a < 1) {
            a = 1;
        }
        this.a = a;
    }

    public int getA() {
        return a;
    }
    
}
