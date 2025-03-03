package Java17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean test = true;
        while (test) {
            System.out.println("1. Gestion des Managers");
            System.out.println("2. Gestion des Developers");
            System.out.println("3. Gestion des SoftwareEngineers");
            System.out.println("4. Gestion des SoftwareInterns");
            System.out.println("5. Quitter");
            System.out.print("Choisir une option : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nom : ");
                    String nomManager = scanner.nextLine();
                    System.out.print("Salaire : ");
                    double salaireManager = scanner.nextDouble();
                    scanner.nextLine();
                    Manager manager = new Manager(nomManager, salaireManager);
                    manager.work();
                    manager.holdMeeting();
                    break;
                case 2:
                    System.out.print("Nom : ");
                    String nomDev = scanner.nextLine();
                    System.out.print("Salaire : ");
                    double salaireDev = scanner.nextDouble();
                    scanner.nextLine();
                    Developer developer = new Developer(nomDev, salaireDev);
                    developer.work();
                    developer.writeCode();
                    break;
                case 3:
                    System.out.print("Nom : ");
                    String nomSE = scanner.nextLine();
                    System.out.print("Salaire : ");
                    double salaireSE = scanner.nextDouble();
                    scanner.nextLine();
                    SoftwareEngineer softwareEngineer = new SoftwareEngineer(nomSE, salaireSE);
                    softwareEngineer.work();
                    softwareEngineer.writeCode();
                    softwareEngineer.deployCode();
                    break;
                case 4:
                    System.out.print("Nom : ");
                    String nomSI = scanner.nextLine();
                    System.out.print("Salaire : ");
                    double salaireSI = scanner.nextDouble();
                    scanner.nextLine();
                    SoftwareIntern softwareIntern = new SoftwareIntern(nomSI, salaireSI);
                    softwareIntern.work();
                    softwareIntern.learn();
                    softwareIntern.doTask();
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    test = false;
                    break;
                default:
                    System.out.println("Option invalide ! Veuillez réessayer.");
            }
        }
        scanner.close();
    }
}