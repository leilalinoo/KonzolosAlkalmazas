
package konzolosalkalmazas;

public class Negyzet {
    int a = 3;
    int x = 2;
    int y = 3;
    public int getAterulet() {
        return a*a;
    }
     public String getKoordinata() {
         String koo = "x = "+x+","+"y = "+y;
        return koo;
    }
    
}
