package addhaarserviceapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import addhaarserviceapp.entity.AddhaarService;

public interface AadhaarRepository extends JpaRepository<AddhaarService,String>{

}
