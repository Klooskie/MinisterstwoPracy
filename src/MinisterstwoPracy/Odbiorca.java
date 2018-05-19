package MinisterstwoPracy;

public class Odbiorca {

    private String nazwa;

    Odbiorca(String nazwa){
        this.nazwa = nazwa;
    }

    void odbierz(String wiadomosc){
        System.out.println(this.nazwa + " otrzymal wiadomosc: " + wiadomosc);
    }

    @Override
    public boolean equals(Object o){
        if (o == null || getClass() != o.getClass()) return false;
        if(((Odbiorca) o).nazwa.equals(this.nazwa)) return true;
        return false;
    }
}
