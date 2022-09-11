
package modell;

import java.util.Random;


public class Harcos {
    private int eletero;
    private int pozicio;
//    private int sebzes;
    private Random rnd=new Random();    
    
    public Harcos() {
        this(0);
    }
    
    public Harcos(int pozicio) {
        this(pozicio, 10);
    }
    
    public Harcos(int pozicio, int eletero){
        this.pozicio=pozicio;
        this.eletero=eletero;
    }

    public int getEletero() {
        return eletero;
    }

    public int getPozicio() {
        return pozicio;
    }

    public int getSebzes() {
        return rnd.nextInt(6)+1;
    }

    public void setPozicio() {
        this.pozicio = rnd.nextInt(Palya.PALYA_HOSSZ);
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }
    
}
