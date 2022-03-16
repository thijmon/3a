package practicum2b;

public class Voetbalclub {
    private String naam;
    private int gewonnen;
    private int gelijk;
    private int verloren;
    public Voetbalclub(String nm){
        naam = nm;
    }
    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            gewonnen = gewonnen + 1;
        if (ch == 'g')
            gelijk = gelijk + 1;
        if (ch == 'v')
            verloren = verloren + 1;
    }
    public int aantalPunten(){
        int punten = gewonnen * 3 + gelijk;
        return punten;
    }
    public int aantalGespeeld(){
        int gespeeld = gewonnen + gelijk + verloren;
        return gespeeld;
    }

    public String toString(){
        return naam+ "   " + aantalGespeeld() + " " + gewonnen + " "+ gelijk +" "+ verloren+" " + aantalPunten();
    }
}
