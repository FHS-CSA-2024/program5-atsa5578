//import stuff here?
import java.util.*;
//Your code here
public class Program5 {
    public static void main(String[] args){
        //mileage
        int royaleMileage = 286;
        int koopaKingMileage = 412;
        int pipeFrameMileage = 361;
        int badwagonMileage = 161;
        //gallons
        int royaleGallons = 9;
        int koopaKingGallons = 40;
        int pipeFrameGallons = 18;
        int badwagonGallons = 11;
        //average milespergallon
        double averageRoyale;
        double averageKoopa;
        double averagePipeFrame;
        double averageBadWagon;
        averageRoyale = (double) royaleMileage/royaleGallons + 0.05;
        averageRoyale = averageRoyale * 10;
        averageRoyale = (int) averageRoyale;
        averageRoyale = averageRoyale / 10;
        averageKoopa = (double) koopaKingMileage/koopaKingGallons;
        averagePipeFrame = (double) pipeFrameMileage/pipeFrameGallons + 0.05;
        averagePipeFrame = averagePipeFrame *10;
        averagePipeFrame = (int) averagePipeFrame;
        averagePipeFrame = averagePipeFrame/10;
        averageBadWagon = (double) badwagonMileage/badwagonGallons + 0.05;
        averageBadWagon = averageBadWagon * 10;
        averageBadWagon = (int) averageBadWagon; 
        averageBadWagon = averageBadWagon / 10;
        
        
        //print
        System.out.println("Royale averaged " + averageRoyale + "miles per gallon.");
        System.out.println("Koopa King averaged " + averageKoopa + "miles per gallon.");
        System.out.println("Pipe Frame averaged " + averagePipeFrame + "miles per gallon.");
        System.out.println("Badwagon averaged " + averageBadWagon + "miles per gallon.");
        
        
    }
}
//Paste console output below:
/*
Royale averaged 31.8miles per gallon.
Koopa King averaged 10.3miles per gallon.
Pipe Frame averaged 20.1miles per gallon.
Badwagon averaged 14.6miles per gallon.

*/
