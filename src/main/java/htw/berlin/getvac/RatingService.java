package htw.berlin.getvac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private RatingService ratingService;

    public Rating save(Rating rating) {

        return ratingRepository.save(rating);
    }


    public double arenaAverage(){
        double average = ratingRepository.arenaRating();

        return average;
    }
    public double erikaAverage(){
        double average = ratingRepository.erikaRating();

        return average;
    }
    public double tegelAverage(){
        double average = ratingRepository.tegelRating();

        return average;
    }
    public double tempelhofAverage(){
        double average = ratingRepository.tempelhofRating();

        return average;
    }
    public double messeAverage(){
        double average = ratingRepository.messeRating();

        return average;
    }
    public double velodromAverage(){
        double average = ratingRepository.velodromRating();

        return average;
    }

}
