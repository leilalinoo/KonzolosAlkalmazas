

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


  

    public String toString() {
        return "Négyzet koordinata{" + "x=" + x + ", y=" + y + '}';
    }

}
