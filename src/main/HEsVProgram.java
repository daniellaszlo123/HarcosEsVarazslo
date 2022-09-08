
package main;

import java.util.Random;


public class HEsVProgram {

    static int H_elet=10, V_elet=10;
    static int H_helyzet=0, V_helyzet=2;
    static boolean harc=V_helyzet==H_helyzet;
    static char[] palya={'H', '_', 'V'};
    public static final int PALYA_HOSSZ=palya.length;
    static Random rnd=new Random();
    
    public static void main(String[] args) {
        palyaKiir();
        eleteroKiir();
        palyaTisztitas();
        ujPoz();
        vanEHarc();
    }

    private static void palyaKiir() {
        for (int i = 0; i < PALYA_HOSSZ; i++) {
            System.out.print(palya[i]+" ");
        }
        System.out.println("");
    }

    private static void eleteroKiir() {
    
    }

    private static void palyaTisztitas() {
        for (int i = 0; i < PALYA_HOSSZ; i++) {
            palya[i]='_';
        }
    }

    private static void ujPoz() {
    
    }

    private static void vanEHarc() {
    
    }
    
}
