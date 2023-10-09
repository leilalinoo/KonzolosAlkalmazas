

package konzolosalkalmazas;

public class Koordinata {

    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Koordinata(int x, int y) {
        this.x = x;
        this.y = y;
    }


  

    @Override
    public String toString() {
        return "Négyzet koordinata{" + "x=" + x + ", y=" + y + '}';
    }

}
