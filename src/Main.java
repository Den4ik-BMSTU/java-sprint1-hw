import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  
        System.out.println("Моя первая программа - счётчик шагов");
        Scanner scanner = new Scanner(System.in);
        int stepByDay = 10000;
        System.out.println("Для здоровья вы должны проходить минимум "+stepByDay+" шагов в день");

        StepTracker stepTracker = new StepTracker();

        // обаботка разных случаев
        while (true) {
            printMenu();
            int command = scanner.nextInt();
             if (command==1){//Ввести количество шагов за определённый день
                stepTracker.printMonth();
                int monthNumber=scanner.nextInt();
                System.out.println("Укажите день месяца(1-30): ");
                int dayNumber=scanner.nextInt();
                System.out.println("Укажите количество шагов: ");
                int stepNumber=scanner.nextInt();
                stepTracker.addStep(monthNumber, dayNumber, stepNumber);
            }
            else if (command==2){//Напечатать статистику за определённый месяц
                stepTracker.printMonth();
                int chooseMonth=scanner.nextInt();//Поправил, за пределы не выходит
                stepTracker.stepPrint(chooseMonth);
                stepTracker.maxOfMonth(chooseMonth);
                stepTracker.stepByMonth(chooseMonth);
                stepTracker.bestSeries(stepByDay,chooseMonth);


            }
            else if (command==3){//Изменить цель по количеству шагов в день
                System.out.println("Введите рекомендуемое для вас количество шагов в день:");
                int youStepByDay = scanner.nextInt();
                if (youStepByDay>0) {
                    stepByDay = youStepByDay;
                    System.out.println("Теперь ваша норма " + stepByDay + " шагов в день");
                } else {
                    System.out.println("Количество шагов не может быть отрицательным.");
                }

            }
            else if (command==0){
                System.out.println("Программа завершена");
                break;
            }
            else {
                System.out.println("Введено не корректное значение.");

            }

        }

    }

    private static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения");
    }
}