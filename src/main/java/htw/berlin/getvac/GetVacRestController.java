package htw.berlin.getvac;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetVacRestController {

    @Autowired
    Environment env;
    //private TestCenter testCenter;

//    @GetMapping("/")
//    public String index() {
//
//        return env.getProperty("JDBC_DATABASE_URL");
//    }

    @GetMapping("/")
    public String index() {

        return "Hello World!";
    }




}