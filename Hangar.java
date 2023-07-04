public class Hangar {
    public static void main(String[] args){

        Car clio = new Car("Clio",25000);

        Boat titanic = new Boat("Titanic", 1500);


        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());


    }
}