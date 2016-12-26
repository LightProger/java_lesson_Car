package lesson_java_Car;

public  class CarOvner {

    public static void main(String[] args) {
        String s = "Ваша дистанция равна: ";
        Car myCar = new Car();
        System.out.println(s + myCar.drive(100) + " км.");


    }

}
