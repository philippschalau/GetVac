package htw.berlin.getvac;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GetVacRestController {

    @Autowired
    private VacCenterRepository vacCenterRepository;

    GetVacRestController(VacCenterRepository vacCenterRepository) {

        this.vacCenterRepository = vacCenterRepository;
    }

    @GetMapping("/")
     String getCenters(Model model) {

        model.addAttribute("listOfCenters", vacCenterRepository.findAll());


        return "landing";
    }

    @GetMapping("/centers")
    List<VacCenter> all() {

        return vacCenterRepository.findAll();
    }

    @PostMapping("/centers")
    VacCenter newTestCenter(@RequestBody VacCenter newVacCenter) {

        return vacCenterRepository.save(newVacCenter);
    }

    @DeleteMapping("/centers/{id}")
    public void delete(@PathVariable Long id){

        vacCenterRepository.deleteById(id);
    }



}