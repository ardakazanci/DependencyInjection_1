// Car sınıfı Engine sınıfına bağımlıdır. Engine sınıfından nesne oluşturmak ile sorumludur.
// ilk halinde yapıcı metot içinde engine = new Engine() vardı.
// daha sonra yapıcı metot Engine sınıfından parametre alarak bağımlılığı kaldırdık.
// Fakat motor çeşiti değişebilir. LPG DİZEL olabilir.


public class Car {

    private Engine engine;

    public Car(Engine engine) {

        this.engine = engine;

    }

    public void start() {
        engine.turnOn();
    }

    public void stop() {
        engine.turnOf();
    }


}

