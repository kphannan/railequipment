package info.trackwarrant.rail.equipment.carrier.repository;

import java.util.List;

// import java.util.concurrent.Future;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import info.trackwarrant.rail.equipment.carrier.Carrier;

// public interface CarrierRepository extends CrudRepository<Carrier, String>
// {

//     List<Carrier> findByScac(String scac);
//     List<Carrier> findByName(String scac);
// }




@RepositoryRestResource(collectionResourceRel = "carrier", path = "carrier")
public interface CarrierRepository extends PagingAndSortingRepository<Carrier, String> {

    // Future<Carrier>       findById(@Param("scac") String scac);
    // Carrier       findById(@Param("scac") String scac);
    List<Carrier> findByScac(@Param("scac") String scac);
    List<Carrier> findByName(@Param("name") String name);
}
