class CubeN extends ShapeN {
    
    public CubeN(double cote) {
        super(cote, 3);
    }
    
    @Override
    public double calculateBoundary() {
        return 6 * getCote() * getCote();
    }
}
