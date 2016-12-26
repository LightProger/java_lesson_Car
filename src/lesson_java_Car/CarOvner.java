package lesson_java_Car;

public  class CarOvner {

    public static void main(String[] args) {
        String s = "Ваша дистанция равна: ";
        Car myCar = new Car();
        JamesBondCar bondCar = new JamesBondCar();
        System.out.println(s + myCar.drive(100) + " км.");
        System.out.println("Дистанция автомобиля Джеймса Бонда равна: " + bondCar.drive(100) + " км.");


    }

}
