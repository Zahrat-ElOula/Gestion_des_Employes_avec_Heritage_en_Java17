package Java17;

public final class Manager extends Employee {
    public Manager(String nom, double salaire) {
        super(nom, salaire);
    }

    public void holdMeeting() {
        System.out.println("Le manager organise une réunion.");
    }
}

