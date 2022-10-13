public class Speler {

    private String kleur;
    private int id;
    private int positie;
    private boolean persoon = false;
    private boolean gewonnen = false;

    public Speler(String kleur, int id, int positie, boolean persoon, boolean gewonnen) {
        this.kleur = kleur;
        this.id = id;
        this.positie = positie;
        this.persoon = persoon;
        this.gewonnen = gewonnen;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(int input) {
        switch (input) {
            case 1:
                kleur = "Rood";
                break;
            case 2:
                kleur = "Blauw";
                break;
            case 3:
                kleur = "Groen";
                break;
            case 4:
                kleur = "Geel";
                break;
            case 5:
                kleur = "Zwart";
                break;
            case 6:
                kleur = "Wit";
                break;
            default:
                System.out.println("Verkeerde invoer!");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPositie() {
        return positie;
    }

    public void setPositie(int positie) {
        this.positie = positie;
    }

    public boolean isPersoon() {
        return persoon;
    }

    public void setPersoon(boolean persoon) {
        this.persoon = persoon;
    }

    public boolean isGewonnen() {
        return gewonnen;
    }

    public void setGewonnen(boolean gewonnen) {
        this.gewonnen = gewonnen;
    }
}
