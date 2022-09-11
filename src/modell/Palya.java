
package modell;

public class Palya {
    public static final int PALYA_HOSSZ=3;
    char[] palya=new char[PALYA_HOSSZ];

    public Palya() {
        setPalyaUres();
    }

    public char[] getPalya() {
        return palya;
    }

    public void setMezo(int poz, char jel) {
        palya[poz]=jel;
    }
    
    public void setPalyaUres(){
        for (int i = 0; i < PALYA_HOSSZ; i++) {
            palya[i]='_';
        }
    }
    
    
}
