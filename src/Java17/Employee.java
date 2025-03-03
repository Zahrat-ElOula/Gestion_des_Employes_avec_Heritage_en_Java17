package Java17;

public sealed abstract class Employee permits Manager, Developer, Intern {
    private String nom;
    private double salaire;

    public Employee(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public void work() {
        System.out.println("Bonjour "+nom);
    }

    public String getNom() {
        return nom;
    }

    public double getSalaire() {
        return salaire;
    }
}
