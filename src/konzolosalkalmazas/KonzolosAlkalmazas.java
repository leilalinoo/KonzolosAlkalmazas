package konzolosalkalmazas;

public class KonzolosAlkalmazas {
    
    public static void main(String[] args) {
        
        inditas();
    }
    
    private static void inditas() {
         Koordinata k = new Koordinata(4,5);
        Negyzet n = new Negyzet(3, k);
         Negyzet n2 = new Negyzet(4, k);

       
        


       
       
        System.out.println("a négyzet területe:" + n.getATerulet());
        System.out.println(k.toString());
        System.out.println("Egyforma-e? "+n.equals(n2));
        

    }

   

    
}
