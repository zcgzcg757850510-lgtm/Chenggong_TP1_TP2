abstract class ShapeN {
    private double cote;
    private int dimension;

    public ShapeN(double cote, int dimension) {
        this.cote = cote;
        this.dimension = dimension;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    public int getDimension() {
        return dimension;
    }

    public double calculateVolume() {
        return Math.pow(cote, dimension);
    }

    public abstract double calculateBoundary();
}
