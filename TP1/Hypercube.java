public class Hypercube extends Cube {
    
    public Hypercube(double cote) {
        super(cote);
    }
    
    public double calculerHypervolume() {
        return cote * cote * cote * cote;
    }
    
    public double calculerBordure() {
        return 8 * calculerVolume();
    }
}
