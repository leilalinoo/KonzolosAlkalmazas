package konzolosalkalmazas;

public class Negyzet {



    private int a;
    private Koordinata koord;

    public Negyzet(int a, Koordinata koord) {
        this.a = a;
        this.koord = koord;
    }


    public int getATerulet() {
        return a * a;
    }

    public void setA(int a) {

        if (a <= 0) {

            a = 1;
        }
        this.a = a;
    }

    public int getA() {
        return a;

    }

    public Koordinata getKoord() {
        return koord;
    }

    public void setKoord(Koordinata koord) {
        this.koord = koord;
    }
   /*  boolean egyforma_e(int egyikoldal, int masikoldal) {
        if(egyikoldal == masikoldal){
             return true;
        }
       return false;
    }
*/

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.a;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Negyzet other = (Negyzet) obj;
        return this.a == other.a;
    }

   
  
    @Override
    public String toString() {

        return "Negyzet{" + "a=" + a + ", x=" + koord.getX() +",y="+koord.getY()+ '}';

    }

    
    
    
    


    }
    

