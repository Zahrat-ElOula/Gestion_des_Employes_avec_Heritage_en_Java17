package Java17;

public final class SoftwareIntern extends Intern {
    public SoftwareIntern(String nom, double salaire) {
        super(nom,salaire);
    }

    public void doTask() {
        System.out.println("Le stagiaire développe une petite fonctionnalité.");
    }
}

