package org.prog;

//TODO: 1. Add class Plane which has current passengers count,
// max passengers cound and flight ID as string "AA-1001"
// 2. Create new Plane, set passengers, max apssengers and flight id

public class Plane {

        public String currentPassengersCount;
        public String maxPassengersCount;
        public String flightID;


        public void flyTo() {
           System.out.println("Plane with flight ID " + flightID + " is flying with " + currentPassengersCount + " passengers of " + maxPassengersCount + " aboard.");
       }

      }
