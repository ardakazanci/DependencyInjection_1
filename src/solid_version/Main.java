package solid_version;

public class Main {

    public static void main(String[] args) {

        Engine petrolEngine = new PetrolEngine();
        Car car = new Car(petrolEngine);
        car.start();
        car.stop();

        Engine lpgEngine = new LPGEngine();
        Car car_2 = new Car(lpgEngine);
        car_2.start();
        car_2.stop();


        // Ortak özellikler bir interface'te toplandı.
        // Car sınıfını bu interface'ten implement ettik.
        // Her türlü araba yakıt tipi için bağımlılık olmadan süreci geliştirdik.

    }

}
