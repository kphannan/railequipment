package info.trackwarrant.rail.equipment.locomotive.service;


// import package info.trackwarrant.rail.equipment.locomotive;;
import org.springframework.stereotype.Service;

import info.trackwarrant.rail.equipment.locomotive.Locomotive;
import info.trackwarrant.rail.equipment.locomotive.LocomotiveService;


@Service
final class LocomotiveServiceImpl
implements LocomotiveService
{
    @Override
    public Locomotive locomotive()
    {
        final Locomotive locomotive = new Locomotive();

        locomotive.setScac( "EL" );
        locomotive.setNumber( "1234" );

        return locomotive;
    }


    // @Override
    // public String hello( final Person person )
    // {
    //     return "Hello " + person.getFirstname() + " " + person.getLastname() + "!";
    // }
}
