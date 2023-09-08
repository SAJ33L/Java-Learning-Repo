package inheritance;

public class Garage {

    public static void main(String[] args) {
        Coupe myCar = new Coupe();
        myCar.setColor("red");
        String color = myCar.getColor();
        System.out.println(color);
    }
}
