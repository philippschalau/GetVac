package htw.berlin.getvac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetVacHtmlController {

    @Autowired
    private VacCenterRepository vacCenterRepository;

    @GetMapping("/")
    String getCenters(Model model) {

        model.addAttribute("listOfCenters", vacCenterRepository.findAll());

        return "landing";
    }
}
