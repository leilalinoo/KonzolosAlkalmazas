package konzolosalkalmazas;

public class Negyzet {
    private int x = 5;
    private int y = 4;
    private int oldalHossz = 10;
    
    
    
    public int terulet(){
        return oldalHossz*oldalHossz;
    }

    public String getKoordinatak(){
        return "["+x+";"+y+"]";
    }

    public int getOldalHossz() {
        return oldalHossz;
    }
    
}
