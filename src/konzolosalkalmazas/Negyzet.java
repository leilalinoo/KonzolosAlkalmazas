package konzolosalkalmazas;

public class Negyzet {

    int a = 5;
    int x = 2;
    int y = 3;

    public int getATerulet() {
        return a * a;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Negyzet{" + " x=" + x + ", y=" + y + '}';
    }
}
