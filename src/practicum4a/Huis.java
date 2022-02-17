package practicum4a;
public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adres, int bouwjaar) {
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }
    public void setHuisbaas(Persoon hb){
        this.huisbaas = hb;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    public String toString(){
        String output = "Huis " + adres + " is gebouwd in " + bouwjaar +  "\nen heeft huisbaas " + huisbaas;
        return output;
    }
}