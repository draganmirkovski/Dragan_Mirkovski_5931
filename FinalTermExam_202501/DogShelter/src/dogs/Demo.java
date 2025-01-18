package dogs;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    private static ArrayList<Puppy> puppies = new ArrayList<>();
    private static ArrayList<AdultDog> adultDogs = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add Puppy");
            System.out.println("2. Add Adult Dog");
            System.out.println("3. Display all dogs");
            System.out.println("4. Find youngest dog");
            System.out.println("5. Find oldest dog");
            System.out.println("6. Calculate average age");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addPuppy(scanner);
                case 2 -> addAdultDog(scanner);
                case 3 -> displayAllDogs();
                case 4 -> findYoungestDog();
                case 5 -> findOldestDog();
                case 6 -> calculateAverageAge();
                case 7 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 7);

        scanner.close();
    }

    private static void addPuppy(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter breed: ");
        String breed = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter training level: ");
        String trainingLevel = scanner.next();
        System.out.print("Is house trained (true/false): ");
        boolean isHouseTrained = scanner.nextBoolean();

        puppies.add(new Puppy(name, breed, age, trainingLevel, isHouseTrained));
        System.out.println("Puppy added successfully.");
    }

    private static void addAdultDog(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter breed: ");
        String breed = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter size: ");
        String size = scanner.next();
        System.out.print("Is vaccinated (true/false): ");
        boolean isVaccinated = scanner.nextBoolean();

        adultDogs.add(new AdultDog(name, breed, age, size, isVaccinated));
        System.out.println("Adult dog added successfully.");
    }

    private static void displayAllDogs() {
        System.out.println("Puppies:");
        for (Puppy puppy : puppies) {
            puppy.printDetails();
        }

        System.out.println("\nAdult Dogs:");
        for (AdultDog adultDog : adultDogs) {
            adultDog.printDetails();
        }
    }

    private static void findYoungestDog() {
        Dog youngest = null;

        for (Puppy puppy : puppies) {
            if (youngest == null || puppy.getAge() < youngest.getAge()) {
                youngest = puppy;
            }
        }

        for (AdultDog adultDog : adultDogs) {
            if (youngest == null || adultDog.getAge() < youngest.getAge()) {
                youngest = adultDog;
            }
        }

        if (youngest != null) {
            System.out.println("Youngest Dog:");
            youngest.printDetails();
        } else {
            System.out.println("No dogs available.");
        }
    }

    private static void findOldestDog() {
        Dog oldest = null;

        for (Puppy puppy : puppies) {
            if (oldest == null || puppy.getAge() > oldest.getAge()) {
                oldest = puppy;
            }
        }

        for (AdultDog adultDog : adultDogs) {
            if (oldest == null || adultDog.getAge() > oldest.getAge()) {
                oldest = adultDog;
            }
        }

        if (oldest != null) {
            System.out.println("Oldest Dog:");
            oldest.printDetails();
        } else {
            System.out.println("No dogs available.");
        }
    }

    private static void calculateAverageAge() {
        int totalAge = 0;
        int count = 0;

        for (Puppy puppy : puppies) {
            totalAge += puppy.getAge();
            count++;
        }

        for (AdultDog adultDog : adultDogs) {
            totalAge += adultDog.getAge();
            count++;
        }

        if (count > 0) {
            System.out.println("Average Age: " + (double) totalAge / count);
        } else {
            System.out.println("No dogs available.");
        }
    }
}