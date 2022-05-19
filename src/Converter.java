public class Converter {
    void distanceKM(int steps){
        int step=75; //см
        int distance=steps*step/100000;
        System.out.println("Вы прошли: "+ distance+ "киллометров");
    }
    void cCalories(int steps){
        int step=50;
        int cCal=steps*step/1000;
        System.out.println("Вы потратили: "+ cCal+ "килоколорий");
    }
}
