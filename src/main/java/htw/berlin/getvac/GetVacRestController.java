package htw.berlin.getvac;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GetVacRestController {

    @RequestMapping("/")
    public String index() {

        return "Hello World!";
    }



}