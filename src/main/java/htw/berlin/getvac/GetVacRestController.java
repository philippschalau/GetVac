package htw.berlin.getvac;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetVacRestController {

    @Autowired
    private RatingService ratingService;


    @PostMapping("/rating")
    public Rating createRating(@AuthenticationPrincipal OidcUser user, @RequestBody Rating rating) {
        rating.setOwner(user.getEmail());
        return ratingService.save(rating);
    }



}