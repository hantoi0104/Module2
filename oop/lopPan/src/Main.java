public class Main {
    public static void main(String[] args) {

        Pan Pan1 = new Pan();
        Pan1.setSpeed(3) ;
        Pan1.setRadius(10);
        Pan1.setColor("Yellow");
        Pan1.setOn(true);
        Pan Pan2 = new Pan();
        Pan2.setSpeed(2) ;
        Pan2.setRadius(5);
        Pan2.setColor("blue");
        Pan2.setOn(false);
        System.out.println(Pan1.toString("1"));
        System.out.println(Pan2.toString("2"));


    }
}