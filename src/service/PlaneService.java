package service;

import model.Plane;

import java.util.Scanner;

public class PlaneService {
    /*
    Task 1. (score 5)
    Create function:
    Parameter one Plane
    Result: print all information of the plane
     */

    public Plane create(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the plane:");
        String model = scanner.next();
        System.out.println("Enter the country the plane belongs to:");
        String country  = scanner.next();
        System.out.println("Enter the year of publishing:");
        int year = scanner.nextInt();
        System.out.println("Enter the hours in air:");
        int hours = scanner.nextInt();
        System.out.println("Enter is military or not:");
        boolean military = scanner.nextBoolean();
        System.out.println("Enter weight of plane:");
        int weight = scanner.nextInt();
        System.out.println("Enter the maximum extent across the wings of an aircraft:");
        int wingspan = scanner.nextInt();
        System.out.println("Enter maximal speed per hour:");
        int topSpeed = scanner.nextInt();
        System.out.println("Enter the number of seats:");
        int seats = scanner.nextInt();
        System.out.println("Enter the cost of the plane:");
        double cost = scanner.nextDouble();

        return new Plane(model,country,year, hours, military, weight,wingspan, topSpeed, seats, cost);
    }

    public void printInfoOfOnePlane(Plane plane){

        System.out.println("Model: " + plane.getModel());
        System.out.println("Country: " + plane.getCountry());
        System.out.println("Year: " + plane.getYear());
        System.out.println("Hours: " + plane.getHours());
        System.out.println("Military: " + plane.isMilitary());
        System.out.println("Weight: " + plane.getWeight());
        System.out.println("Wingspan: " + plane.getWingspan());
        System.out.println("TopSpeed: " + plane.getTopSpeed());
        System.out.println("Seats: " + plane.getSeats());
        System.out.println("Cost: " + plane.getCost());

    }

    /*
    Task 2. (score 5)
    Create function:
    Parameter one Plane
    Result: print cost and topSpeed if the plane is military otherwise print model and country
     */

    public void printBasedOnMilitaryOrNot(Plane plane){

        if(plane.isMilitary()){
            System.out.println("Cost: " + plane.getCost());
            System.out.println("TopSpeed: " + plane.getTopSpeed());
        } else {
            System.out.println("Model: " + plane.getModel());
            System.out.println("Country: " + plane.getCountry());
        }
    }

    /*
    Task 3. (score 7)
    Create function:
    Parameter two Planes
    Result: return the plane which one is newer (if they have the same age return first one).
     */

    public Plane newerPlane(Plane plane1, Plane plane2){

            if(plane1.getYear() < plane2.getYear()){
                return plane2;
            } else if(plane1.getYear() > plane2.getYear()) {
                return plane2;
            } else {
                return plane1;
            }
    }

    /*
    Task 4. (score 7)
    Create function:
    Parameter two Planes
    Result: return the model of the plane which has bigger wingspan (if they have the same - return second one).
     */

    public String biggerWingspan(Plane plane1, Plane plane2){
        if(plane1.getWingspan() < plane2.getWingspan()){
            return plane2.getModel();
        } else if(plane1.getWingspan() > plane2.getWingspan()) {
            return plane1.getModel();
        } else {
            return plane2.getModel();
        }
    }

    /*
    Task 5. (score 7)
    Create function:
    Parameter three Planes
    Result: print country of the plane with smallest seats count (if they have the same - print first).
     */

    public void smallestSeats(Plane plane1, Plane plane2, Plane plane3) {

        Plane min = plane1;

        if (plane2.getSeats() < min.getSeats())
            min = plane2;

        if (plane3.getSeats() < min.getSeats()) {
            min = plane3;
        }

        System.out.println(min.getCountry());
    }

    /*
    Task 6. (score 7)
    Create function:
    Parameter array of Planes
    Result: print all not military planes.
     */

    public void printNotMilitaryPlanes(Plane[] planes) {
            for (Plane p:planes){
                if(!(p.isMilitary())){
                    System.out.println("*********");
                    printInfoOfOnePlane(p);
                }
        }
    }

    /*
    Task 7. (score 10)
    Create function:
    Parameter array of Planes
    Result: print all military planes which were in air more than 100 hours.
     */

    public void printMilitaryPlanesMoreThan100Hours(Plane[] planes) {
        for (Plane p:planes){
            if(p.isMilitary() && p.getHours() > 100){
                System.out.println("*********");
                printInfoOfOnePlane(p);
            }
        }
    }

    /*
    Task 8. (score 10)
    Create function:
    Parameter array of Planes
    Result: return the plane with minimal weight (if there are some of them return last one).
     */

    public Plane minimalWeight(Plane[] planes) {

        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeight() <= min.getWeight()) {
                min = planes[i];
            }
        }
        return min;
    }

    /*
    Task 9. (score 10)
    Create function:
    Parameter array of Planes
    Result: return the plane with minimal cost from all military planes
     (if there are some of them return first one).
     */

    public Plane minimalCost(Plane[] planes) {

        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getCost() < min.getCost()) {
                min = planes[i];
            }
        }
        return min;
    }

    /*
    Task 10. (score 12)
    Create function:
    Parameter array of Planes
    Result: print planes in ascending form order by year
     */

    public void orderByYear(Plane[] planes) {

        Plane temp;
        for (int i = 0; i < planes.length; i++) {
            for (int j = 1; j < (planes.length - i); j++) {
                if (planes[j - 1].getYear() > planes[j].getYear()) {
                    temp = planes[j - 1];
                    planes[j - 1] = planes[j];
                    planes[j] = temp;
                }
            }
        }
        for (Plane p:planes){
                System.out.println("*********");
                printInfoOfOnePlane(p);
            }
    }

}
