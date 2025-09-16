public class MainPokemon {
    public static void main(String[] args) {
        System.out.println("=== BIENVENUE DANS LE MONDE POKEMON ===");
        System.out.println("Démonstration simple de combat Pokemon\n");
        
        // Créer deux Pokemon pour le combat
        System.out.println("Création des Pokemon...");
        Animal_Electrique pokemon1 = new Animal_Electrique("electrique", "Pikachu", 25, 100.0, 55.0, 40.0, "Tonnerre");
        Animal_Eau pokemon2 = new Animal_Eau("eau", "Carapuce", 18, 90.0, 48.0, 65.0, "Pistolet à O");
        
        // Afficher les informations des Pokemon
        System.out.println("\nPokemon participants:");
        System.out.println("1. " + pokemon1.toString());
        System.out.println("2. " + pokemon2.toString());
        
        // Expliquer les types
        System.out.println("\n=== EXPLICATION DES TYPES ===");
        System.out.println("Électrique VS Eau");
        System.out.println("Électrique est super efficace contre Eau!");
        System.out.println("Multiplicateur de dégâts: 2.0x\n");
        
        // Démarrer le combat
        Combat combat = new Combat(pokemon1, pokemon2);
        combat.demarrerCombat();
        
        System.out.println("\n=== DÉMONSTRATION TERMINÉE ===");
        System.out.println("Ce projet illustre:");
        System.out.println("- Héritage (Pokemon héritent de A_Type_Base)");
        System.out.println("- Polymorphisme (utiliserCompetence implémentée différemment)");
        System.out.println("- Encapsulation (attributs protégés avec getters/setters)");
        System.out.println("- Classes abstraites (A_Type_Base)");
    }
}
