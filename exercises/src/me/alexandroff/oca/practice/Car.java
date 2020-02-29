package me.alexandroff.oca.practice;

import java.util.*;
import java.util.function.Predicate;

public class Car {
    String company;
    int year;
    double price;
    String type;

    Car(String c, int y, double p, String t) {
        this.company = c;
        this.year = y;
        this.price = p;
        this.type = t;
    }

    public String toString() {
        return "(" + company + " " + year + " " + type + ")";
    }
}

class CarMall {
    List<Car> cars = new ArrayList<>();

    CarMall() {
        cars.add(new Car("Honda", 2012, 9000.0, "HATCH"));
        cars.add(new Car("Honda", 2018, 17000.0, "SEDAN"));
        cars.add(new Car("Toyota", 2014, 19000.0, "SUV"));
        cars.add(new Car("Ford", 2014, 13000.0, "SPORTS"));
        cars.add(new Car("Nissan", 2017, 8000.0, "SUV"));
    }

    List<Car> showCars(CarFilter cf) {
        ArrayList<Car> carsToShow = new ArrayList<>();
        for (Car c : cars) {
            if (cf.showCar(c)) carsToShow.add(c);
        }
        return carsToShow;
    }
}

interface CarFilter {
    boolean showCar(Car c);
}

class TestCars {
    public static void main(String[] args) {
        CarMall cm = new CarMall();
        CarFilter cf = new CompanyFilter("Honda");
        List<Car> carsByCompany = cm.showCars(cf);
        System.out.println(carsByCompany);
// OR with lambda
        List<Car> carsByType = cm.showCars(c -> c.type.equals("SUV"));
        System.out.println(carsByType);

        Predicate<Car> priceLow = p -> p.price < (15000.0);
        System.out.println(priceLow.test(new Car("Nissan", 2017, 8000.0, "SUV")));
    }
}

class CompanyFilter implements CarFilter {
    private String company;

    public CompanyFilter(String c) {
        this.company = c;
    }

    public boolean showCar(Car c) {
        return company.equals(c.company);
    }
}
//The compile generates the following from the lambda:
/*
class XYZ implements CarFilter{
public boolean showCar( Car < < parameterName > >){
return < < an expression that returns a boolean must appear here > >; } }

 */