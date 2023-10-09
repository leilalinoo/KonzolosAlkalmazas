package konzolosalkalmazas;

public class KonzolosAlkalmazas {

    public static void main(String[] args) {

      inditas();
    }

    private static void inditas() {
        Negyzet n = new Negyzet();
        System.out.println("a négyzet területe:"+n.getATerulet());
        System.out.println(n.toString());
    }
    
}
