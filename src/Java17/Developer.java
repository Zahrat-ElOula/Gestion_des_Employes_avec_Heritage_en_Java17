package Java17;

public non-sealed class Developer extends Employee {
    public Developer(String nom, double salaire) {
        super(nom,salaire);
    }

    public void writeCode() {
        System.out.println("Le développeur écrit du code.");
    }
}
