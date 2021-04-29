package htw.berlin.getvac.classes;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface testCenterRepository extends CrudRepository<testCenter, Long> {
}
