package htw.berlin.getvac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetVacHtmlController {

    @Autowired
    private VacCenterRepository vacCenterRepository;

    @Autowired
    private RatingService ratingService;

    @GetMapping(path = Endpoints.LANDING)
    public String landing(Model model) {

        model.addAttribute("arenaRating", ratingService.arenaAverage());
        model.addAttribute("erikaRating", ratingService.erikaAverage());
        model.addAttribute("tegelRating", ratingService.tegelAverage());
        model.addAttribute("tempelhofRating", ratingService.tempelhofAverage());
        model.addAttribute("messeRating", ratingService.messeAverage());
        model.addAttribute("velodromRating", ratingService.velodromAverage());

        model.addAttribute("comment", ratingService.showComments());


        return "landing";
    }

    @GetMapping(path = Endpoints.RATING)
    public String rating(Model model) {

        model.addAttribute("listOfCenters", vacCenterRepository.findAll());

        return "rating";
    }



}
