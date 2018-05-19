package MinisterstwoPracy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Instytucja {

    private Map <String, Kanal> kanaly;

    public Instytucja(){
        kanaly = new HashMap <String, Kanal>();
    }

    //obsluga kanalow
    public void dodajKanal(String nazwaKanalu){
        Kanal kanal = new Kanal();
        this.kanaly.put(nazwaKanalu, kanal);
    }

    public void usunKanal(String nazwaKanalu){
        this.kanaly.remove(nazwaKanalu);
    }

    public void wyslij(String wiadomosc, String nazwaKanalu){
        Kanal kanal = this.kanaly.get(nazwaKanalu);
        kanal.wyslij(wiadomosc + " (dla " + nazwaKanalu + ")");
    }

    public void wyslij(String wiadomosc, Collection <String> nazwyKanalow){
        for(String nazwaKanalu: nazwyKanalow) {
            Kanal kanal = this.kanaly.get(nazwaKanalu);
            kanal.wyslij(wiadomosc + " (dla " + nazwaKanalu + ")");
        }
    }

    //obsluga odbiorcow
    public Odbiorca stworzOdbiorce(String nazwa){
        return new Odbiorca(nazwa);
    }

    public void zarejestruj(Odbiorca odbiorca, String nazwaKanalu){
        Kanal kanal = this.kanaly.get(nazwaKanalu);
        kanal.zarejestruj(odbiorca);
    }

    public void odrejestruj(Odbiorca odbiorca, String nazwaKanalu){
        Kanal kanal = this.kanaly.get(nazwaKanalu);
        kanal.odrejestruj(odbiorca);
    }
}
