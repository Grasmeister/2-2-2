package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {
    private final CarService service;

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping(value = "/cars")
    public String carsCounter(Model model, @RequestParam(value = "count", required = false) String count) {
        List<Car> cars = service.addCars();
        if (count != null) {
            int x = Integer.parseInt(count);
            cars = service.carCountList(x);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }


}
