public class Car extends WheelableTransport implements Serviceable, Wheelable, Engineable {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку машины");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}
