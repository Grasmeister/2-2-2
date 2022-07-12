package web.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarSrevice{
    List<Car> carList = new ArrayList<>();
    @Override
    public List<Car> addCars() {
        carList.add(new Car("Ford1", "Focus", 97856));
        carList.add(new Car("Ford1", "Explored", 77766));
        carList.add(new Car("Fiat1", "Tipo", 66554));
        carList.add(new Car("Mitsubishi1", "Pajero", 16976));
        carList.add(new Car("AstenMartin1", "Cobra", 99999));
        return carList;
    }

    @Override
    public List<Car> carCountList(int count) {

        List<Car> cars = new ArrayList<>();
        if (count >= carList.size()) {
            return carList;
        }
        for (int i = 0; i < count; i++){
            cars.add(carList.get(i));
        }
        return cars;
    }


}
