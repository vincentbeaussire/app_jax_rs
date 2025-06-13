package org.example.app_jax_rs;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/car")
public class CarResource {

    private CarService carService;

    @Inject
    public CarResource(CarService carService) {
        this.carService = carService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Car getCar() {
        return new Car(1, "Mercedes", 2025, "black");
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Car postCar(Car car) {
        car.setId(10);
        return car;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("withservice")
    public Car postCarWithService() {
        return CarService.save(2, "Audi", 2024, "white");
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/params")
    public Car postCarWithParams(@QueryParam("brand") String brand, @QueryParam("yearManufacture") int yearManufacture, @QueryParam("color") String color) {
        return carService.save(3, brand, yearManufacture, color);
    }

    @DELETE
    @Path("/delete/{id}")
    public int deleteCar(@PathParam("id") int id) {
        return id;
    }
}
