package booking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlightDemo {

    public static Passenger createPassenger(String firstName, String lastName, String passportNumber) {
        return new Passenger(firstName, lastName, passportNumber);
    }

    public static Flight createFlight(String flightNumber, String origin, String destination, LocalDateTime departureTime) {
        return new Flight(flightNumber, origin, destination, departureTime);
    }

    public static void addPassengerToFlight(Flight flight, Passenger passenger) {
        flight.addPassenger(passenger);
    }

    public static void displayPassengerInfo(Passenger passenger) {
        passenger.displayInfo();
    }

    public static void displayFlightInfo(Flight flight) {
        flight.displayFlightInfo();
    }

    public static ArrayList<Passenger> findPassengersOnFlight(Flight flight, String lastName) {
        return (ArrayList<Passenger>) flight.getPassengers()
                .stream()
                .filter(passenger -> passenger.getLastName().equalsIgnoreCase(lastName))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Passenger> allPassengers = new ArrayList<>();
        List<Flight> flights = new ArrayList<>();


        flights.add(createFlight("F101", "New York", "Los Angeles", LocalDateTime.of(2025, 1, 20, 8, 0)));
        flights.add(createFlight("F102", "Chicago", "Miami", LocalDateTime.of(2025, 1, 20, 10, 30)));
        flights.add(createFlight("F103", "Dallas", "Seattle", LocalDateTime.of(2025, 1, 20, 12, 0)));


        Random random = new Random();
        for (int i = 1; i <= 15; i++) {
            String firstName = "First" + i;
            String lastName = "Last" + (i % 5); // Shared last names for testing
            String passportNumber = "PA" + (100000 + random.nextInt(900000));
            allPassengers.add(createPassenger(firstName, lastName, passportNumber));
        }


        for (Passenger passenger : allPassengers) {
            Flight flight = flights.get(random.nextInt(flights.size()));
            addPassengerToFlight(flight, passenger);
        }

        for (Flight flight : flights) {
            while (flight.getPassengers().size() < 5) {
                Passenger extraPassenger = createPassenger("Extra", "Passenger", "PA" + (100000 + random.nextInt(900000)));
                addPassengerToFlight(flight, extraPassenger);
            }
        }

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Search for passengers by last name");
            System.out.println("2. Display flight information");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter flight number: ");
                    String flightNumber = scanner.next();
                    System.out.print("Enter last name to search: ");
                    String lastName = scanner.next();

                    Flight flight = flights.stream()
                            .filter(f -> f.getFlightNumber().equalsIgnoreCase(flightNumber))
                            .findFirst()
                            .orElse(null);

                    if (flight != null) {
                        ArrayList<Passenger> foundPassengers = findPassengersOnFlight(flight, lastName);
                        if (foundPassengers.isEmpty()) {
                            System.out.println("No passengers found with last name " + lastName);
                        } else {
                            System.out.println("Passengers found:");
                            for (Passenger passenger : foundPassengers) {
                                passenger.displayInfo();
                            }
                        }
                    } else {
                        System.out.println("Flight not found.");
                    }
                }
                case 2 -> {
                    for (Flight flight : flights) {
                        displayFlightInfo(flight);
                    }
                }
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}