package htw.berlin.getvac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetVacHtmlController {

    @Autowired
    private VacCenterRepository vacCenterRepository;

    @GetMapping(path = Endpoints.LANDING)
    String landing(Model model) {

        model.addAttribute("listOfCenters", vacCenterRepository.findAll());

        return "landing";
    }

    @GetMapping(path = Endpoints.ARENA)
    String arena() {

        return "arena";
    }

    @GetMapping(path = Endpoints.ERIKA)
    String erika() {

        return "erika";
    }

    @GetMapping(path = Endpoints.TEGEL)
    String tegel() {

        return "tegel";
    }

    @GetMapping(path = Endpoints.TEMPELHOF)
    String tempelhof() {

        return "tempelhof";
    }

    @GetMapping(path = Endpoints.MESSE)
    String messe() {

        return "messe";
    }

    @GetMapping(path = Endpoints.VELODROM)
    String velodrom() {

        return "velodrom";
    }
}
