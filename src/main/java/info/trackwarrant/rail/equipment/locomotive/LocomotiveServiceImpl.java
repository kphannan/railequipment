package info.trackwarrant.rail.equipment.locomotive;


// import package info.trackwarrant.rail.equipment.locomotive;;
import org.springframework.stereotype.Service;



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
