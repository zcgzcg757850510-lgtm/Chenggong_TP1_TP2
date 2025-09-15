public class Cube extends Carre {
    
    public Cube(double cote) {
        super(cote);
    }
    
    public double calculerSurface() {
        return 6 * calculerAire();
    }
    
    public double calculerVolume() {
        return cote * cote * cote;
    }
}
