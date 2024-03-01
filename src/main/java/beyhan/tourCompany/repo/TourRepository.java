package beyhan.tourCompany.repo;

import beyhan.tourCompany.domain.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<Tour, Integer> {
}
