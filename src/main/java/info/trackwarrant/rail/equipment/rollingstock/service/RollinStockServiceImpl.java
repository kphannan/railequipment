package info.trackwarrant.rail.equipment.rollingstock.service;



// import package info.trackwarrant.rail.equipment.locomotive;;
import org.springframework.stereotype.Service;

import info.trackwarrant.rail.equipment.rollingstock.RollingStock;
import info.trackwarrant.rail.equipment.rollingstock.RollingStockService;



@Service
final class RollingStockServiceImpl
implements RollingStockService
{
    @Override
    public RollingStock rollingStock()
    {
        final RollingStock rollingStock = new RollingStock();

        rollingStock.setScac( "NS" );
        rollingStock.setNumber( "654321" );

        return rollingStock;
    }


    // @Override
    // public String hello( final Person person )
    // {
    //     return "Hello " + person.getFirstname() + " " + person.getLastname() + "!";
    // }
}
