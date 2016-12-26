package lesson_java_Car;

/**
 * Created by Александр on 27.12.2016.
 */
public class JamesBondCar extends Car{

    @Override
    public int drive(int howlong){
        distance = howlong * 180;
        return distance;

    }

}
