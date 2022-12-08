/*
 * @author Székely Balázs Csaba
 * @date 2022-12-08
 * 
 * A program 5-ös lottó tippet állít elõ. 5 külöbözõ 1 vagy annál nagyobb és 90 vagy annál kisebb számértéket.
*/
import java.util.Random;


public class Lottoszamok {

    public static void main(String[] args) {
        int[] lottoszamok = new int[5]; // az 5 szám tárolásáról gondoskodunk
        Random rand = new Random(); // random osztály példányosítása
        int seged; // random szám tárolását ideiglenesen megoldó változó
        boolean vanIlyen = false; // egy tippen belül nem akarjuk ugyanazt a számot 2-szer, ennek vizsgálatában segít
        int y = 0; // tömb feltöltésénél segít

        do {// ciklus a tömb feltöltésére
            seged = rand.nextInt(90)+1;

            //vizsgáljuk meg, hogy ez a szám szerepelt-e már a tippben
            for (int j = 0; j <= y; j++) {
                if (seged == lottoszamok[j])
                    vanIlyen = true;
            }

            //ha nem volt még az új random számunkkal megegyezõ szám, akkor beírjuk a tömbbe, ha volt már, akkor generálunk újat
            if (!vanIlyen){
                lottoszamok[y] = seged;
                y++;
            }
            else
                vanIlyen = false;
        }while (y < lottoszamok.length);
        
        //Írassuk ki a kapott tippet
        System.out.println("Lottószámok:");
        for (int i = 0; i < lottoszamok.length; i++) {
            System.out.print(lottoszamok[i] + " ");            
        }

    }
}