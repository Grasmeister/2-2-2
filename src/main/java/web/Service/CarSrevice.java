package web.Service;

import web.model.Car;

import java.util.List;

public interface CarSrevice {
    List<Car> addCars();
    List<Car> carCountList(int count);

}
