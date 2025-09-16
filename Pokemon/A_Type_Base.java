
public abstract class A_Type_Base {
    // Attributs de Base
    protected String type;
    protected int niveau;
    protected String nom;       
    protected double vie;         
    protected double attaque;     
    protected double defence;   
    protected String nomCompetence; 

    // Constructeur
    public A_Type_Base(String type, String nom, int niveau, double vie, double attaque, double defence, String nomCompetence) {
        this.type = type;
        this.nom = nom;
        this.niveau = niveau;
        this.vie = vie;
        this.attaque = attaque;
        this.defence = defence;
        this.nomCompetence = nomCompetence;
    }

    // Getters
    public int getNiveau() {
        return niveau;
    }
    public String getType() {  
        return type;
    }
        
        
    public String getNom() {
        return nom;
    }

    public double getVie() {
        return vie;
    }

    public double getAttaque() {
        return attaque;
    }

    public double getDefence() {
        return defence;
    }

    public String getNomCompetence() {
        return nomCompetence;
    }

    // Setters
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVie(double vie) {
        this.vie = vie;
    }

    public void setAttaque(double attaque) {
        this.attaque = attaque;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public void setNomCompetence(String nomCompetence) {
        this.nomCompetence = nomCompetence;
    }
    
    // Méthodes abstraites obligatoires pour les classes filles
    public abstract double calculerMultiplicateur(A_Type_Base typeAdversaire);
    public abstract void utiliserCompetence(A_Type_Base cible);

    // Override toString
    @Override
    public String toString() {
        return String.format("%s (niveau: %d, type: %s, Vie: %.1f, Attaque: %.1f, Défense: %.1f, Compétence: %s)",
                this.nom, this.niveau, this.type, this.vie, this.attaque, this.defence, this.nomCompetence);
    }
}
