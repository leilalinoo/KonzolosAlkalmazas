package konzolosalkalmazas;

public class KonzolosAlkalmazas {
    
    public static void main(String[] args) {
        
        inditas();
    }
    
    private static void inditas() {
         Koordinata k = new Koordinata(4,5);
        Negyzet n = new Negyzet(3, k);
       

       
        


        n.setA(4);
       
        System.out.println("a négyzet területe:" + n.getATerulet());
        System.out.println(k.toString());
        

    }
    
}
