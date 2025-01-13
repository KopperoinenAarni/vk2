package main;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Car newCar = new Car();
        System.out.print("Anna auton merkki: ");
        String brand = sc.nextLine();
        newCar.setBrand(brand);
        System.out.print("Anna auton malli: ");
        String model = sc.nextLine();
        newCar.setModel(model);

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Näytä auton tila");
            System.out.println("2) Muokkaa auton merkkiä ja mallia");
            System.out.println("3) Kiihdytä autoa");
            System.out.println("4) Hidasta autoa");
            System.out.println("0) Lopeta ohjelma");

            if(sc.hasNextLine()) {
                int i = 0;
                String stringInput = sc.nextLine();
                if (!stringInput.isEmpty()) {
                    i = Integer.parseInt(stringInput);
                }

                switch(i) {
                    case 1:
                        newCar.printSpecs();
                        break;
                    case 2:
                        System.out.print("Anna uusi auton merkki: ");
                        brand = sc.nextLine();
                        newCar.setBrand(brand);
                        System.out.print("Anna uusi auton malli: ");
                        model = sc.nextLine();
                        newCar.setModel(model);
                        break;
                    case 3:
                        System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                        int speed = sc.nextInt();
                        if (speed > 0) {
                            newCar.accelerate(speed);
                        } else {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                        }
                        sc.nextLine();
                        break;
                    case 4:
                        System.out.print("Kuinka monta km/h haluat hidastaa? ");
                        speed = sc.nextInt();
                        if (speed > 0) {
                            newCar.decelerate(speed);
                        } else {
                            System.out.print("Nopeuden täytyy olla positiivinen luku.");
                        }
                        sc.nextLine();
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
    ;
    }
}
