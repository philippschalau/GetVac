package htw.berlin.getvac;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetVacRestController {

    @Autowired
    VacCenterRepository testCenterRepository;

    GetVacRestController(VacCenterRepository testCenterRepository){
    this.testCenterRepository = testCenterRepository;
}

    @GetMapping("/")
    public String index() {

        return "Hello World!";
    }

    @GetMapping("/centers")
    List<VacCenter> all(){
    return testCenterRepository.findAll();
    }

    @PostMapping("/centers")
    VacCenter newTestCenter(@RequestBody VacCenter newTestCenter){
    return testCenterRepository.save(newTestCenter);
    }

    @DeleteMapping("{id}")
    public String deletePerson(@PathVariable("id") Long id) {

        if(id > 0) {
            if(testCenterRepository.delete(id)) {
                return "Deleted the center.";
            } else {
                return "Cannot delete the center.";
            }
        }
        return "The id is invalid for the center.";
    }








}