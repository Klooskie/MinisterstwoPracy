import MinisterstwoPracy.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        System.out.println("-- Test --");

        Instytucja instytucja = new Instytucja();

        instytucja.dodajKanal("kanal1");
        instytucja.dodajKanal("kanal2");
        instytucja.dodajKanal("kanal3");

        for(int j = 1; j < 4; j++)
            for(int i = 1; i < 6; i++){
                String nazwa = "odbiorca" + j + i;
                Odbiorca odbiorca = instytucja.stworzOdbiorce(nazwa);
                instytucja.zarejestruj(odbiorca, "kanal" + j);
            }

        Odbiorca o = instytucja.stworzOdbiorce("odbiorca12");
        instytucja.zarejestruj(o, "kanal" + 2);

        Odbiorca od = instytucja.stworzOdbiorce("odbiorca13");
        instytucja.zarejestruj(od, "kanal" + 2);
        instytucja.zarejestruj(od, "kanal" + 3);

        instytucja.wyslij("Wiadomosc testowa 1", "kanal1");
        System.out.print("\n\n");
        instytucja.wyslij("Wiadomosc testowa 2", "kanal2");
        System.out.print("\n\n");
        instytucja.wyslij("Wiadomosc testowa 3", "kanal3");
        System.out.print("\n\n");

        Collection <String> zbiorKanalow = new HashSet<String>();
        zbiorKanalow.add("kanal1");
        zbiorKanalow.add("kanal2");
        instytucja.wyslij("Wiadomosc testowa dla zbioru kanalow", zbiorKanalow);

    }
    
}
