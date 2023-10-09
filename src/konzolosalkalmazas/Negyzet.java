
package konzolosalkalmazas;

public class Negyzet {

    int a = 5;
   

    public int getATerulet() {
        return a * a;
    }

    public void setA(int a) {
        if (a<=0) {
            a = 2;
        }
        this.a = a;
    }

  
    @Override
    public String toString() {
        return "A négyzet oldala: "+a+ "; "+ "A négyzet területe: "+getATerulet();
    }
}
