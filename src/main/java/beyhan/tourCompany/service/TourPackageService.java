package beyhan.tourCompany.service;

import beyhan.tourCompany.domain.TourPackage;
import beyhan.tourCompany.repo.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourPackageService {

    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourPackageService(TourPackageRepository tourPackageRepository){
        this.tourPackageRepository = tourPackageRepository;
    }

    public TourPackage createTourPackage(String code, String name){
        return tourPackageRepository.findById(code)
                .orElse( tourPackageRepository.save(new TourPackage(name,code)));
    }

    public Iterable<TourPackage> lookup(){
        return tourPackageRepository.findAll() ;}

    public long total(){return tourPackageRepository.count();}

}
