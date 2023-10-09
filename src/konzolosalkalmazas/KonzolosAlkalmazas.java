package konzolosalkalmazas;

public class KonzolosAlkalmazas {


    public static void main(String[] args) {

      inditas();
    }

    private static void inditas() {
        Negyzet n = new Negyzet();
        Koordinata k = new Koordinata();
        k.setX(5);
        k.setY(6);
        System.out.println(n.toString()+ " ; "+"A koordinátája:  "+k.toString());
        
    }
    
}
