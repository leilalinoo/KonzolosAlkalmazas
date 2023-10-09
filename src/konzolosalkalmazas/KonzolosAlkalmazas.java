
package konzolosalkalmazas;

public class KonzolosAlkalmazas {

    
    public static void main(String[] args) {
        negyzetkiir();
    }

    private static void negyzetkiir() {
        Negyzet n1 = new Negyzet();
        System.out.println("A négyzet területe: "+n1.getAterulet()+ " ,"+"A négyzet koordinátája: "+n1.getKoordinata());
    }
    
}
