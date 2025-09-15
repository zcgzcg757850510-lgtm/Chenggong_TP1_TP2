public class Carre {
    protected double cote;
    
    public Carre(double cote) {
        this.cote = cote;
    }
    
    public double getCote() {
        return cote;
    }
    
    public void setCote(double cote) {
        this.cote = cote;
    }
    
    public double calculerAire() {
        return cote * cote;
    }
}
