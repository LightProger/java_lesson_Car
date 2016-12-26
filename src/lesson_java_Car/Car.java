package lesson_java_Car;

/**
 * Created by Александр on 27.12.2016.
 */
public class Car {

    int distance;
    public static void start(){

    }

    public static void stop(){

    }
    public int drive(int howlong){
        distance = howlong * 60;
        return distance;

    }
}
