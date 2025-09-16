public class Combat {
    private A_Type_Base pokemon1;
    private A_Type_Base pokemon2;
    
    public Combat(A_Type_Base pokemon1, A_Type_Base pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }
    
    public void demarrerCombat() {
        System.out.println("=== COMBAT POKEMON ===");
        System.out.println(pokemon1.getNom() + " VS " + pokemon2.getNom());
        System.out.println("Le combat commence!\n");
        
        A_Type_Base attaquant = pokemon1;
        A_Type_Base defenseur = pokemon2;
        int tour = 1;
        
        while (pokemon1.getVie() > 0 && pokemon2.getVie() > 0) {
            System.out.println("--- Tour " + tour + " ---");
            afficherStatuts();
            
            System.out.println(attaquant.getNom() + " attaque!");
            attaquant.utiliserCompetence(defenseur);
            
            if (defenseur.getVie() <= 0) {
                System.out.println(defenseur.getNom() + " est K.O.!");
                System.out.println(attaquant.getNom() + " remporte le combat!");
                break;
            }
            
            // Changer de tour
            A_Type_Base temp = attaquant;
            attaquant = defenseur;
            defenseur = temp;
            
            tour++;
            System.out.println();
        }
        
        System.out.println("=== FIN DU COMBAT ===");
    }
    
    private void afficherStatuts() {
        System.out.printf("%s: %.1f PV | %s: %.1f PV\n", 
                         pokemon1.getNom(), pokemon1.getVie(),
                         pokemon2.getNom(), pokemon2.getVie());
    }
}
