package Java17;

public class SoftwareEngineer extends Developer {
    public SoftwareEngineer(String nom, double salaire) {
        super(nom,salaire);
    }

    public void deployCode() {
        System.out.println("Le Software Engineer déploie son code en production.");
    }
}

