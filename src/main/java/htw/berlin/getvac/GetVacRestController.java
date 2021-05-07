package htw.berlin.getvac;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetVacRestController {

    @Autowired
    private VacCenterRepository vacCenterRepository;

    GetVacRestController(VacCenterRepository vacCenterRepository) {

        this.vacCenterRepository = vacCenterRepository;
    }

    @GetMapping("/")
    public String index() {

        return "Welcome to GetVac!";
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