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
    String landing(Model model) {

        model.addAttribute("listOfCenters", vacCenterRepository.findAll());

        return "landing";
    }

    @GetMapping("/arenaBooking")
    String arena(Model model) {

        model.addAttribute("listOfCenters", vacCenterRepository.findAll());

        return "arena";
    }

    @GetMapping("/erikaBooking")
    String erika(Model model) {

        model.addAttribute("listOfCenters", vacCenterRepository.findAll());

        return "erika";
    }

    @GetMapping("/tegelBooking")
    String tegel(Model model) {

        model.addAttribute("listOfCenters", vacCenterRepository.findAll());

        return "tegel";
    }

    @GetMapping("/tempelhofBooking")
    String tempelhof(Model model) {

        model.addAttribute("listOfCenters", vacCenterRepository.findAll());

        return "tempelhof";
    }

    @GetMapping("/messeBooking")
    String messe(Model model) {

        model.addAttribute("listOfCenters", vacCenterRepository.findAll());

        return "messe";
    }

    @GetMapping("/velodromBooking")
    String velodrom(Model model) {

        model.addAttribute("listOfCenters", vacCenterRepository.findAll());

        return "velodrom";
    }
}
