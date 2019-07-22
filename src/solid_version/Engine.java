package solid_version;

// Interface yapma sebebimiz birden fazla motor çeşitinin ortak özelliklerini toplamak.
// Daha sonra o motor çeşitlerini interface ' ten kalıtmak.

public interface Engine {

    void turnOn();
    void turnOff();

}
