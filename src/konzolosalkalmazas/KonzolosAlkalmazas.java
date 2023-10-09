package konzolosalkalmazas;

public class KonzolosAlkalmazas {
    
    public static void main(String[] args) {
        
        inditas();
    }
    
    private static void inditas() {
        Negyzet n = new Negyzet();
        Koordinata k = new Koordinata();

        n.setA(4);
        k.setX(2);
        k.setY(5);
        System.out.println("a négyzet területe:" + n.getATerulet());
        System.out.println(k.toString());
        

    }
    
}
