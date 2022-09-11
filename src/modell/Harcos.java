
package modell;

import java.util.Random;


public class Harcos {
    private int eletero;
    private int pozicio;
    private int sebzes;
    private Random rnd=new Random();    
    
    public Harcos() {
        this(10);
    }
    
    public Harcos(int eletero) {
        this.eletero=eletero;
        this.pozicio=0;
    }

    public int getEletero() {
        return eletero;
    }

    public int getPozicio() {
        return pozicio;
    }

    public int getSebzes() {
        return sebzes;
    }

    public void setPozicio(int pozicio) {
        this.pozicio = pozicio;
    }
    
    
}
