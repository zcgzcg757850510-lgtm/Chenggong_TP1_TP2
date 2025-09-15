public class MainPolymorphism {
    public static void main(String[] args) {
        ShapeN[] shapes = {
            new CarreN(5.0),
            new CubeN(4.0),
            new HypercubeN(3.0)
        };
        
        for (ShapeN shape : shapes) {
            if (shape instanceof CarreN) {
                System.out.println("Carré : côté = " + shape.getCote() + ", Aire = " + shape.calculateVolume() + ", Bordure = " + shape.calculateBoundary());
            } else if (shape instanceof CubeN) {
                System.out.println("Cube : côté = " + shape.getCote() + ", Volume = " + shape.calculateVolume() + ", Surface = " + shape.calculateBoundary());
            } else if (shape instanceof HypercubeN) {
                System.out.println("Hypercube : côté = " + shape.getCote() + ", Hypervolume = " + shape.calculateVolume() + ", Bordure = " + shape.calculateBoundary());
            }
        }
    }
}
