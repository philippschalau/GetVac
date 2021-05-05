package htw.berlin.getvac;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacCenterRepository extends JpaRepository<VacCenter, Long> {
}
