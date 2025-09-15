import java.util.Scanner;

public class MainInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Côté du carré : ");
        double coteCarre = scanner.nextDouble();
        Carre carre = new Carre(coteCarre);
        System.out.println("Carré : côté = " + carre.getCote() + ", Aire = " + carre.calculerAire());
        
        System.out.print("Côté du cube : ");
        double coteCube = scanner.nextDouble();
        Cube cube = new Cube(coteCube);
        System.out.println("Cube : côté = " + cube.getCote() + ", Surface = " + cube.calculerSurface() + ", Volume = " + cube.calculerVolume());
        
        System.out.print("Côté de l'hypercube : ");
        double coteHypercube = scanner.nextDouble();
        Hypercube hypercube = new Hypercube(coteHypercube);
        System.out.println("Hypercube : côté = " + hypercube.getCote() + ", Hypervolume = " + hypercube.calculerHypervolume() + ", Bordure = " + hypercube.calculerBordure());
        
        scanner.close();
    }
}