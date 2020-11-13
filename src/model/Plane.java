package model;

public class Plane {

    /*
    Plane (score 10)
    model - name of the plane (Any not empty string)
    country - country the plane belongs to (Any not empty string)
    year - year of publishing  (from 1903 to 2020)
    hours - hours in air (from 0 to 10000)
    military - is military or not
    weight - weight of plane (from 1000 KG to 160000 KG)
    wingspan - the maximum extent across the wings of an aircraft (from 10 - 45)
    topSpeed - maximal speed per hour (1000 km/h) (any not negative value)
    seats - number of seats (any not negative value)
    cost - cost of the plane (ex: 445.6$) (any not negative value)
     */

    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean military;
    private int weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double cost;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(!model.isEmpty()){
            this.model = model;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(!country.isEmpty()){
            this.country = country;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1903 && year <= 2020){
            this.year = year;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours >= 0 && hours <= 10000){
            this.hours = hours;
        }
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight >=  1000 && weight <= 160000){
            this.weight = weight;
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if(wingspan >= 10 && wingspan <= 45){
            this.wingspan = wingspan;
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if(topSpeed >= 0 && topSpeed <= 1000){
            this.topSpeed = topSpeed;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if(seats >= 0){
            this.seats = seats;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost >= 0){
            this.cost = cost;
        }
    }

    public Plane(String model, String country, int year, int hours, boolean military,
                 int weight, int wingspan, int topSpeed, int seats, double cost) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.military = military;
        this.weight = weight;
        this.wingspan = wingspan;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
    }
}
