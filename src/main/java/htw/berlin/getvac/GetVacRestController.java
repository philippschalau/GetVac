package htw.berlin.getvac;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetVacRestController {

    @Autowired
    TestCenterRepository testCenterRepository;

GetVacRestController(TestCenterRepository testCenterRepository){
    this.testCenterRepository = testCenterRepository;
}

    @GetMapping("/")
    public String index() {

        return "Hello World!";
    }

    @GetMapping("/centers")
    List<TestCenter> all(){
    return testCenterRepository.findAll();
    }

    @PostMapping("/centers")
    TestCenter newTestCenter(@RequestBody TestCenter newTestCenter){
    return testCenterRepository.save(newTestCenter);
    }






}