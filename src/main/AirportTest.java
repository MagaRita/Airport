package main;

import model.Plane;
import service.PlaneService;

public class AirportTest {

    public static void main(String[] args) {

        /*
        AirportTest (score 10)
        use all the methods from PlaneService using Scanner object.
         */

        //I used the Scanner in the create function.

        PlaneService service = new PlaneService();
        Plane plane1 = service.create();
        System.out.println("-----------------------");
        System.out.println("Task 1");
        service.printInfoOfOnePlane(plane1);

        System.out.println("-----------------------");
        System.out.println("Task 2");
        service.printBasedOnMilitaryOrNot(plane1);

        System.out.println("-----------------------");
        System.out.println("Task 3");

        Plane plane2 = service.create();
        System.out.println("-----------------------");
        System.out.println("The newer plane is:");
        service.printInfoOfOnePlane(service.newerPlane(plane1, plane2));

        System.out.println("-----------------------");
        System.out.println("Task 4");

        System.out.println("The plane which has the bigger wingspan is: " +
                service.biggerWingspan(plane1,plane2));


        System.out.println("-----------------------");
        System.out.println("Task 5");
        Plane plane3 = service.create();
        System.out.println("-----------------------");
        System.out.println("The plane with smallest seats belongs to: " );
        service.smallestSeats(plane1, plane2, plane3);


        System.out.println("-----------------------");
        System.out.println("Task 6");
        Plane[] pl = {plane1,plane2,plane3};
        System.out.println("Print not military planes");
        service.printNotMilitaryPlanes(pl);

        System.out.println("-----------------------");
        System.out.println("Task 7");
        System.out.println("Print military planes with more than 100 hours");
        service.printMilitaryPlanesMoreThan100Hours(pl);

        System.out.println("-----------------------");
        System.out.println("Task 8");
        System.out.println("Minimal weight plane is:");
        service.printInfoOfOnePlane(service.minimalWeight(pl));


        System.out.println("-----------------------");
        System.out.println("Task 9");
        System.out.println("Minimal cost plane is:");
        service.printInfoOfOnePlane(service.minimalCost(pl));

        System.out.println("-----------------------");
        System.out.println("Task 10");
        service.orderByYear(pl);
    }

}
