
public class Animal_Feu extends A_Type_Base {
    public Animal_Feu(String type, String nom, int niveau, double vie, double attaque, double defence, String nomCompetence) {
        super(type, nom, niveau, vie, attaque, defence, nomCompetence);
    }
    
    // 验证类型相克的乘数效果
    @Override
    public double calculerMultiplicateur(A_Type_Base typeAdversaire) {
        // 使用工具类计算类型相克乘数
        return TypeEffectiveness.calculerMultiplicateur(this.getType(), typeAdversaire.getType());
    }

    @Override
    public void utiliserCompetence(A_Type_Base cible) {
        System.out.println(this.getNom() + " 使用了火系技能 " + this.nomCompetence + " 攻击 " + cible.getNom() + "!");
        
        // 计算伤害
        double multiplicateur = this.calculerMultiplicateur(cible);
        double degats = this.getAttaque() * multiplicateur - cible.getDefence() * 0.5;
        
        // 确保伤害不为负数
        if (degats < 0) degats = 1;
        
        // 应用伤害
        double nouvelleVie = cible.getVie() - degats;
        if (nouvelleVie < 0) nouvelleVie = 0;
        cible.setVie(nouvelleVie);
        
        // 显示效果信息
        System.out.println(TypeEffectiveness.getDescriptionEfficacite(multiplicateur));
        System.out.printf("%s 受到了 %.1f 点伤害！剩余生命值：%.1f\n", 
                         cible.getNom(), degats, cible.getVie());
    }   
}
