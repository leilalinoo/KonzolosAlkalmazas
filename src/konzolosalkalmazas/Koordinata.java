
package konzolosalkalmazas;

public class Koordinata {
    int x = 2;
    int y = 3;

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

    @Override
    public String toString() {
        return "" + "x=" + x + ", y=" + y + '}';
    }
}
