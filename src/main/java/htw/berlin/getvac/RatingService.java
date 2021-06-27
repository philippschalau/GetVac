package htw.berlin.getvac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private RatingService ratingService;

    public Rating save(Rating rating) {

        return ratingRepository.save(rating);
    }


    public Double arenaAverage(){
        Double average = ratingRepository.arenaRating();

        return average;
    }
    public Double erikaAverage(){
        Double average = ratingRepository.erikaRating();

        return average;
    }
    public Double tegelAverage(){
        Double average = ratingRepository.tegelRating();

        return average;
    }
    public Double tempelhofAverage(){
        Double average = ratingRepository.tempelhofRating();

        return average;
    }
    public Double messeAverage(){
        Double average = ratingRepository.messeRating();

        return average;
    }
    public Double velodromAverage(){
        Double average = ratingRepository.velodromRating();

        return average;
    }

    public List<String> showComments(){
        String comment;
        List<String> comments = new ArrayList<>();
        List<String> listOfComments = ratingRepository.comments();
        int upperbound = listOfComments.size() - 1;
        Random random = new Random();

        while(comments.size() < 3){
            comment = listOfComments.get(random.nextInt(upperbound));
            if(!comments.contains(comment) && comment != null){
                comments.add(comment);
            }
        }

        return comments;
    }

}
