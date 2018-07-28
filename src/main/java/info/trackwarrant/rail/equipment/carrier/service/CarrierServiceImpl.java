package info.trackwarrant.rail.equipment.carrier.service;


// import package info.trackwarrant.rail.equipment.locomotive;;
import org.springframework.stereotype.Service;

import info.trackwarrant.rail.equipment.carrier.Carrier;
import info.trackwarrant.rail.equipment.carrier.CarrierService;


@Service
final class CarrierServiceImpl
implements CarrierService
{
    @Override
    public Carrier carrier()
    {
        final Carrier carrier = new Carrier();

        carrier.setScac( "EL" );
        carrier.setName( "Erie Lackawanna" );

        return carrier;
    }


    // @Override
    // public String hello( final Person person )
    // {
    //     return "Hello " + person.getFirstname() + " " + person.getLastname() + "!";
    // }
}
