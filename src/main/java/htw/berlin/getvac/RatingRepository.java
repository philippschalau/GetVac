package htw.berlin.getvac;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface RatingRepository extends CrudRepository<Rating, Long> {

    @Query(value="SELECT ROUND(AVG(grade),1) FROM rating WHERE vaccenter = 'Impfzentrum Arena'", nativeQuery = true)
    Double arenaRating();

    @Query(value="SELECT ROUND(AVG(grade),1) FROM rating WHERE vaccenter = 'Impfzentrum Erika-Heß-Eisstadion'", nativeQuery = true)
    Double erikaRating();

    @Query(value="SELECT ROUND(AVG(grade),1) FROM rating WHERE vaccenter = 'Impfzentrum Flughafen Tegel'", nativeQuery = true)
    Double tegelRating();

    @Query(value="SELECT ROUND(AVG(grade),1) FROM rating WHERE vaccenter = 'Impfzentrum Flughafen Tempelhof'", nativeQuery = true)
    Double tempelhofRating();

    @Query(value="SELECT ROUND(AVG(grade),1) FROM rating WHERE vaccenter = 'Impfzentrum Messe'", nativeQuery = true)
    Double messeRating();

    @Query(value="SELECT ROUND(AVG(grade),1) FROM rating WHERE vaccenter = 'Impfzentrum Velodrom'", nativeQuery = true)
    Double velodromRating();

    @Query(value="SELECT comment FROM rating", nativeQuery = true)
    List<String> comments();

}