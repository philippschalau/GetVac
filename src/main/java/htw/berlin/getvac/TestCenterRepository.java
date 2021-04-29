package htw.berlin.getvac;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCenterRepository extends CrudRepository<TestCenter, Long> {
}
