
public class StepTracker {
    int dayOfYear[] = new int[360];
    Converter converter =new Converter();

    /* MonthData[] monthToData;

     public StepTracker() {
         monthToData = new MonthData[12];
         for (int i = 0; i < monthToData.length; i++) {
             monthToData[i] = new MonthData();
         }
     }

     class MonthData {
         int[] days = new int[30];
         // Заполните класс самостоятельно
     }*/
    void addStep(int month, int day, int step) {
        int numberDay = (month - 1) * 30 + day;
        if (step > 0) {
            dayOfYear[numberDay] = step;
        } else {
            System.out.println("Количество шагов не может быть отрицательным.");
        }
    }

    void stepPrint(int month) {
        int firstDay = (month - 1) * 30;
        for (int i = 0; i < 31; i++) {
            System.out.println((i + 1) + " день: " + dayOfYear[firstDay]);
            firstDay = firstDay + 1;
        }
    }

    void stepByMonth(int month) {
        int firstDay = (month - 1) * 30;
        int steps = 0;
        for (int i = 0; i < 31; i++) {
            steps = steps + dayOfYear[firstDay];
            firstDay = firstDay + 1;
        }
        System.out.println("Всего шагов за месяц: " + steps);
        midlSteps(steps);
        converter.distanceKM(steps);
        converter.cCalories(steps);
    }

    void maxOfMonth(int month) {
        int firstDay = (month - 1) * 30;
        int lastDay = month * 30;
        int maxStep = 0;
        for (int i = firstDay; i <= lastDay; i++) {
            if (dayOfYear[i] > maxStep) {
                maxStep = dayOfYear[i];
            }
        }
        System.out.println("Больше всего шагов за месяц: " + maxStep);
    }

    void midlSteps(int steps){
        int midl=steps/30;
        System.out.println("Среднее число шагов:" + midl);

    }
   void bestSeries(int norma, int month){
       int firstDay = (month - 1) * 30;
       int lastDay = month * 30;
       int maxSeries = 0;
       for (int i = firstDay; i <= lastDay; i++){
           if (dayOfYear[i]>norma){
               if (i-(i-1)==1){
               maxSeries=maxSeries+1;}
           }
           }
       System.out.println("Максимальная серия:"+maxSeries+"дней");
   }
  }

