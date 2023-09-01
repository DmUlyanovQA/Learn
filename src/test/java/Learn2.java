public class Learn2 {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.speed = 240;
        Car lada = new Car();
        bmw.masculine = 20;
        lada.speed = 90;
        lada.masculine = 300;
        Car.speed = 60;
        System.out.println(bmw.speed + "км/ч " + bmw.masculine + "км");
        System.out.println(lada.speed + "км/ч " + lada.masculine + "км");
    }
}
