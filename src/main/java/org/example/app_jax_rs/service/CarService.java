package org.example.app_jax_rs.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.app_jax_rs.model.Car;

@ApplicationScoped
public class CarService {

    public static Car save(int id, String brand, int yearManufacture, String color) {
        return new Car(id, brand, yearManufacture, color);
    }
}
