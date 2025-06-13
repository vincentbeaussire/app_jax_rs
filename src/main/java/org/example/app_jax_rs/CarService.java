package org.example.app_jax_rs;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CarService {

    public static Car save(int id, String brand, int yearManufacture, String color) {
        return new Car(id, brand, yearManufacture, color);
    }
}
