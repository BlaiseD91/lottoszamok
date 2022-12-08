/*
 * @author Sz�kely Bal�zs Csaba
 * @date 2022-12-08
 * 
 * A program 5-�s lott� tippet �ll�t el�. 5 k�l�b�z� 1 vagy ann�l nagyobb �s 90 vagy ann�l kisebb sz�m�rt�ket.
*/
import java.util.Random;


public class Lottoszamok {

    public static void main(String[] args) {
        int[] lottoszamok = new int[5]; // az 5 sz�m t�rol�s�r�l gondoskodunk
        Random rand = new Random(); // random oszt�ly p�ld�nyos�t�sa
        int seged; // random sz�m t�rol�s�t ideiglenesen megold� v�ltoz�
        boolean vanIlyen = false; // egy tippen bel�l nem akarjuk ugyanazt a sz�mot 2-szer, ennek vizsg�lat�ban seg�t
        int y = 0; // t�mb felt�lt�s�n�l seg�t

        do {// ciklus a t�mb felt�lt�s�re
            seged = rand.nextInt(90)+1;

            //vizsg�ljuk meg, hogy ez a sz�m szerepelt-e m�r a tippben
            for (int j = 0; j <= y; j++) {
                if (seged == lottoszamok[j])
                    vanIlyen = true;
            }

            //ha nem volt m�g az �j random sz�munkkal megegyez� sz�m, akkor be�rjuk a t�mbbe, ha volt m�r, akkor gener�lunk �jat
            if (!vanIlyen){
                lottoszamok[y] = seged;
                y++;
            }
            else
                vanIlyen = false;
        }while (y < lottoszamok.length);
        
        //�rassuk ki a kapott tippet
        System.out.println("Lott�sz�mok:");
        for (int i = 0; i < lottoszamok.length; i++) {
            System.out.print(lottoszamok[i] + " ");            
        }

    }
}