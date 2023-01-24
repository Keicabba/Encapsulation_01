package it.figuccia;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        House house = new House();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of floors: ");
        house.setFloorsNumber(scanner.nextInt());

        scanner.nextLine(); // invio forzato per nextInt() che non va a capo

        System.out.print("Enter the address: ");
        house.setAddress(scanner.nextLine());

        System.out.print("Enter the residents names separated by a comma: ");
        house.setResidentsNames(scanner.nextLine().split(","));

        System.out.printf("House details: %nFloors: %d %nAddress: %s %nResidents: %s%n",
                house.getFloorsNumber(), house.getAddress(),
                String.join(", ", house.getResidentsNames()));

    }
}
