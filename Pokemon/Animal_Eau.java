
public class Animal_Eau extends A_Type_Base {
    public Animal_Eau(String type, String nom, int niveau, double vie, double attaque, double defence, String nomCompetence) {
        super(type, nom, niveau, vie, attaque, defence, nomCompetence);
    }
    
//verifier le multiplicateur，soit passitif？negatif？, null? 
    @Override
    public double calculerMultiplicateur(A_Type_Base typeAdversaire) {
        // Utiliser la classe utilitaire pour calculer le multiplicateur
        return TypeEffectiveness.calculerMultiplicateur(this.getType(), typeAdversaire.getType());
    }

    @Override
    public void utiliserCompetence(A_Type_Base cible) {
        System.out.println(this.getNom() + " 使用了水系技能 " + this.nomCompetence + " 攻击 " + cible.getNom() + "!");
        
        double multiplicateur = this.calculerMultiplicateur(cible);
        double degats = this.getAttaque() * multiplicateur - cible.getDefence() * 0.5;
        
        if (degats < 0) degats = 1;
        
        double nouvelleVie = cible.getVie() - degats;
        if (nouvelleVie < 0) nouvelleVie = 0;
        cible.setVie(nouvelleVie);
        
        System.out.println(TypeEffectiveness.getDescriptionEfficacite(multiplicateur));
        System.out.printf("%s 受到了 %.1f 点伤害！剩余生命值：%.1f\n", 
                         cible.getNom(), degats, cible.getVie());
    }   
}
