package Java17;

public sealed abstract class Intern extends Employee permits SoftwareIntern {
    public Intern(String nom, double salaire) {
        super(nom,salaire);
    }

    public void learn() {
        System.out.println("Le stagiaire apprend.");
    }
}
