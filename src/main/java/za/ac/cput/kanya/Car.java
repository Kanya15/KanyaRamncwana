package za.ac.cput.kanya;

import java.time.LocalDate;
import java.util.Objects;

public class Car {

    @Override
    public int hashCode() {
        return Objects.hash(registration);
    }

    private String carModel;
    private int carYear, passengers, registration;
    private LocalDate purchasedate;

    public Car(String carModel, int registration) {

        this.carModel = carModel;
        this.registration = registration;
    }

    public String getCarModel() {

        return carModel;
    }

    public void setCarModel(String carModel) {

        this.carModel = carModel;

    }

    public int getCarYear() {

        return carYear;
    }

    public void setCarYear(int carYear) {

        this.carYear = carYear;
    }

    public int getPassengers() {

        return passengers;
    }

    public void setPassengers(int passengers) {

        this.passengers = passengers;
    }

    public int getRegistration() {

        return registration;
    }

    public void setRegistration(int registration) {

        this.registration = registration;
    }

    public LocalDate getPurchasedate() {

        return purchasedate;
    }

    public void setPurchasedate(LocalDate purchasedate) {

        this.purchasedate = purchasedate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carYear=" + carYear +
                ", passengers=" + passengers +
                ", registration=" + registration +
                ", purchasedate=" + purchasedate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return registration == car.registration;
    }

}
