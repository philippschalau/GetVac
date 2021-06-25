package htw.berlin.getvac;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends CrudRepository<Rating, Long> {

    @Query(value="SELECT ROUND(AVG(grade),1) FROM rating WHERE vaccenter = 'Impfzentrum Arena'", nativeQuery = true)
    double arenaRating();

    @Query(value="SELECT ROUND(AVG(grade),1) FROM rating WHERE vaccenter = 'Impfzentrum Erika-Heß-Eisstadion'", nativeQuery = true)
    double erikaRating();

    @Query(value="SELECT ROUND(AVG(grade),1) FROM rating WHERE vaccenter = 'Impfzentrum Flughafen Tegel'", nativeQuery = true)
    double tegelRating();

    @Query(value="SELECT ROUND(AVG(grade),1) FROM rating WHERE vaccenter = 'Impfzentrum Flughafen Tempelhof'", nativeQuery = true)
    double tempelhofRating();

    @Query(value="SELECT ROUND(AVG(grade),1) FROM rating WHERE vaccenter = 'Impfzentrum Messe'", nativeQuery = true)
    double messeRating();

    @Query(value="SELECT ROUND(AVG(grade),1) FROM rating WHERE vaccenter = 'Impfzentrum Velodrom'", nativeQuery = true)
    double velodromRating();
}