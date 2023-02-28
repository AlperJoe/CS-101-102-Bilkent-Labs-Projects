
public class projectApp {
    public static void main(String[] args){

        project p1 = new project("ArcTech Business Solution",11520,215,48);
        project p2 = new project("SunMarkets POS Implementation", 315, 320,22 );
        project p3 = new project("Health Tech Hospital", 0,0,0);

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
        System.out.println();
        System.out.println(p3);
        System.out.println();
        System.out.println();

        if(p1.compareProject(p2) == 1){
            if(p1.compareProject(p3) == 1){
                System.out.println("biggest one is first project");
            }
        }
        else if(p2.compareProject(p3) == 1){
            if(p2.compareProject(p1) == 1){
                System.out.println("biggest one is second project");
            }
        }
        else{
            System.out.println("biggest one is third project");
        }

        p1.setRatePerHour(23);
        p1.setRatePerHour(30);
        p1.setProjectType(p1.calculatedProjectCost());
        p1.deactivateProject();
        p2.activateProject(30, 23);

        System.out.println( p1 );
        System.out.println( p2 );
        System.out.println( p3 );

    }
}
