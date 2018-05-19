package MinisterstwoPracy;

import java.util.Collection;
import java.util.LinkedList;

class Kanal {

    private Collection <Odbiorca> odbiorcy;

    Kanal(){
        this.odbiorcy = new LinkedList<Odbiorca>();
    }

    void zarejestruj(Odbiorca odbiorca){
        this.odbiorcy.add(odbiorca);
    }

    void odrejestruj(Odbiorca odbiorca){
        this.odbiorcy.remove(odbiorca);
    }

    void wyslij(String wiadomosc){
        for(Odbiorca o: odbiorcy){
            o.odbierz(wiadomosc);
        }
    }
}
