package info.trackwarrant.rail.equipment.carrier.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import info.trackwarrant.rail.equipment.carrier.Carrier;

public interface CarrierRepository extends CrudRepository<Carrier, String>
{

    List<Carrier> findByScac(String scac);
    List<Carrier> findByName(String scac);
}

