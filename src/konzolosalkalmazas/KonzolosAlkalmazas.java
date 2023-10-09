package konzolosalkalmazas;

public class KonzolosAlkalmazas {


    public static void main(String[] args) {

      inditas();
    }

    private static void inditas() {
        Negyzet n = new Negyzet();
        Koordinata k = new Koordinata();
        n.setA(-2);
        k.setX(3);
        k.setY(-4);
        System.out.println("a négyzet területe:"+n.getATerulet());
        System.out.println(k.toString());

    }
    
}
