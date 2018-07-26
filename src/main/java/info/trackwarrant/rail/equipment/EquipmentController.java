package info.trackwarrant.rail.equipment;



import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import info.trackwarrant.rail.equipment.rollingstock.RollingStock;
import info.trackwarrant.rail.equipment.rollingstock.RollingStockService;
import info.trackwarrant.rail.equipment.locomotive.Locomotive;
import info.trackwarrant.rail.equipment.locomotive.LocomotiveService;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;


@RestController
@RequestMapping("/equipment")
@AllArgsConstructor( access = PACKAGE )
@FieldDefaults( level = PRIVATE, makeFinal = true )
class EquipmentController
{
    @NonNull
    RollingStockService rollingStockService;
    @NonNull
    LocomotiveService   locomotiveService;

    @GetMapping( "/rollingstock" )
    public RollingStock rollingStock()
    {
        return rollingStockService.rollingStock();
    }


    @PostMapping("/rollingstock")
    public String postRollingStock(@RequestBody final String car )
    {
        // return persons.hello( person );
        return "post rail card";
    }


    @GetMapping( "/locomotive" )
    public Locomotive locomotive()
    {
        return locomotiveService.locomotive();
    }


    @PostMapping("/locomotive")
    public String postLocomotive(@RequestBody final String car )
    {
        // return persons.hello( person );
        return "post locomotive card";
    }




    // @GetMapping( "/exception" )
    // public void exception() throws DemoException
    // {
    //     throw new DemoException();
    // }


}
