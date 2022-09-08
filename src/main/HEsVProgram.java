
package main;

import java.util.Random;

public class HEsVProgram {

    static int H_elet=10, V_elet=10;
    static int H_helyzet/*=0*/, V_helyzet/*=2*/;
    //static boolean harc=V_helyzet==H_helyzet;
    static char[] palya={'H', '_', 'V'};
    public static final int PALYA_HOSSZ=palya.length;
    static Random rnd=new Random();
    
    public static void main(String[] args) {
        while (H_elet>0 && V_elet>0) {
            palyaKiir();
            eleteroKiir();
            palyaTisztitas();
            ujPoz();
            vanEHarc();
        }
    }

    private static void palyaKiir() {
        for (int i = 0; i < PALYA_HOSSZ; i++) {
            System.out.print(palya[i]+" ");
        }
        System.out.println("");
    }

    private static void eleteroKiir() {
        System.out.println("********Életerő*******");
        System.out.printf("Harcos: %d\tVarázsló: %d\n", H_elet, V_elet);
        System.out.println("**********************");
    }

    private static void palyaTisztitas() {
        for (int i = 0; i < PALYA_HOSSZ; i++) {
            palya[i]='_';
        }
    }

    private static void ujPoz() {
        H_helyzet=rnd.nextInt(PALYA_HOSSZ);
        V_helyzet=rnd.nextInt(PALYA_HOSSZ);
        palya[H_helyzet]='H';
        palya[V_helyzet]='V';
    }

    private static void vanEHarc() {
        boolean harc=V_helyzet==H_helyzet;
        if (harc) {
            palya[V_helyzet]='X';
            System.out.println("Harc!");
            H_elet-=rnd.nextInt(6)+1;
            V_elet-=rnd.nextInt(6)+1;
            eleteroKiir();
        }
    }
    
}
