class HypercubeN extends ShapeN {
    
    public HypercubeN(double cote) {
        super(cote, 4);
    }
    
    @Override
    public double calculateBoundary() {
        return 8 * getCote() * getCote() * getCote();
    }
}
