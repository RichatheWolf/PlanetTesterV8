/**
 * @purpose: Tester to create two PlanetV8 objects
 *
 * @author Richa Limaye
 * @version 12/20/23
 */
public class PlanetTester {
        public void main(String[] args) {

            String name1 = "Jupiter";
            int diam1 = 142984;

            String name2 = "Mars";
            int diam2 = 6794;

            String name3 = "Venus";
            int diam3 = 5674;
            double radius = 0.0;

            PlanetV8 spaceA = new PlanetV8(name1);
            radius = spaceA.calcRadius(diam1);
            System.out.println("Planet: " + name1 + "\t Radius: " + radius);

            PlanetV8 spaceB = new PlanetV8(name2, diam2);
            radius = spaceB.calcRadius();
            System.out.println("Planet: " + name2 + "\t\t Radius: " + radius);

            // create a third PlanetV8 object
            PlanetV8 spaceC = new PlanetV8(name3, diam3);
            radius = spaceC.calcRadius();
            System.out.println("Planet: " + name2 + "\t\t Radius: " + radius);
        }
    public class PlanetV8 {
        private String n;
        private double d;


        //one parameter constructor, all private instance variables initialized
        public PlanetV8(String name) {
            n = name;
            d = 0.0;
        }

        //two parameter constructor
        public PlanetV8(String name, double diam) {
            n = name;
            d = diam;
        }

        public String getName() {
            return n;
        }

        public double getDiam() {
            return d;
        }


        public void setName(String name) {
            n = name;
        }

        public void setDiam(double diam) {
            d = diam;
        }

        public double calcRadius() {
            double radius = 0.0;
            radius = d / 2.0;
            return radius;
        }

        //overloaded method
        public double calcRadius(int d) {
            double radius = 0.0;
            radius = d / 2.0;
            return radius;
        }
    }
}
