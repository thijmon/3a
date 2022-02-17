package practicum2a;

public class Zwembad {

    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double breedte, double lengte, double diepte){
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }

    public void setBreedte(double breedte){
        this.breedte = breedte;
    }

    public double getBreedte(){
        return breedte;
    }

    public void setLengte(double lengte){
        this.lengte = lengte;
    }

    public double getLengte(){
        return lengte;
    }

    public void setDiepte(double diepte){
        this.diepte = diepte;
    }

    public double getDiepte(){
        return diepte;
    }

    public double inhoud(){
        double result = breedte * lengte * diepte;
        return result;
    }
    public String toString(){
        return "Dit zwembad is " + breedte +" meter breed, "+ lengte+" meter lang, en "+ diepte+" meter diep";
    }
}
