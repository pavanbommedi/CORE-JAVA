package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Salmon",true);
        Animal animal = bird;
        Flight flight = bird;
        Trackable track = bird;

        // animal.Fly();
        // flight.Fly();
        // flight.takeOff();
        // flight.land();  //Bird is run time object getClass prints Bird
        // track.track();

        System.out.println("-".repeat(20));
        isFlight(flight);
        isFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();

        double kms_travelled = 100;
        double miles_travelled = kms_travelled * flight.KM_To_MILES;
        System.out.println(miles_travelled);

        ArrayList<Flight> fliers = new ArrayList<>();
        fliers.add(bird);

        List<Flight> betterFliers = new ArrayList<>();
        betterFliers.add(bird);
        triggerFliers(fliers);
        FlyFliers(fliers);
        landFliers(fliers);


        

    }

    public static void isFlight(Flight flight){
        flight.Fly();
        flight.takeOff();
        if(flight instanceof Trackable trackable) trackable.track();
        flight.land();
    }

    public static void triggerFliers(ArrayList<Flight> fliers){
        for(var flier : fliers){
            flier.takeOff();
        }
    }

     public static void FlyFliers(ArrayList<Flight> fliers){
        for(var flier : fliers){
            flier.Fly();
        }
    }
     public static void landFliers(ArrayList<Flight> fliers){
        for(var flier : fliers){
            flier.land();
        }
    }

}
