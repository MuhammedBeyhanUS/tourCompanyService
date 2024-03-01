package beyhan.tourCompany.service;

import beyhan.tourCompany.domain.Difficulty;
import beyhan.tourCompany.domain.Region;
import beyhan.tourCompany.domain.Tour;
import beyhan.tourCompany.domain.TourPackage;
import beyhan.tourCompany.repo.TourPackageRepository;
import beyhan.tourCompany.repo.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourService {

    private TourRepository tourRepository;
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourService(TourRepository tourRepository, TourPackageRepository tourPackageRepository){
        this.tourRepository = tourRepository;
        this.tourPackageRepository = tourPackageRepository;
    }

    public Tour createTour(String title, String description, String blurb, Integer price, String duration,
                            String bullets, String keywords, String tourPackageName,
                            Difficulty difficulty, Region region){
        TourPackage tourPackage = tourPackageRepository.findByName()
        return tourRepository.save(new Tour());
    }


}
