package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private CarServiceImpl service = new CarServiceImpl();
    private List<Car> cars = service.addCars();


    @GetMapping(value = "/cars")
//    public String cars(Model model) {
//
//        model.addAttribute("cars", cars);
//        return "cars";
//    }
//    @GetMapping(value = "/cars?count=?")
    public String carsCounter(Model model, @RequestParam(value = "count", required = false) String count) {

        if(count != null){
            int x = Integer.parseInt(count);
            cars = service.carCountList(x);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }




}
