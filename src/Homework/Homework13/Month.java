package Homework.Homework13;

public class Month {
    static void getDayfromMonth(int a){

        switch (a){
            case 1:
                System.out.println("Количество дней в январе 2015 года - 31");
                break;
            case 2:
                System.out.println("Количество дней в феврале 2015 года - 28");
                break;
            case 3:
                System.out.println("Количество дней в марте 2015 года - 31");
                break;
            case 4:
                System.out.println("Количество дней в апреле 2015 года - 30");
                break;
            case 5:
                System.out.println("Количество дней в мае 2015 года - 31");
                break;
            case 6:
                System.out.println("Количество дней в июне 2015 года - 30");
                break;
            case 7:
                System.out.println("Количество дней в июле 2015 года - 31");
                break;
            case 8:
                System.out.println("Количество дней в августе 2015 года - 31");
                break;
            case 9:
                System.out.println("Количество дней в сентябре 2015 года - 30");
                break;
            case 10:
                System.out.println("Количество дней в октябре 2015 года - 31");
                break;
            case 11:
                System.out.println("Количество дней в ноябре 2015 года - 30");
                break;
            case 12:
                System.out.println("Количество дней в декабре 2015 года - 31");
                break;
            default:
                System.out.println("Месяц неверна!");
        }

    }

    static class MonthTest{
        public static void main(String[] args) {
            int b = 2;
            getDayfromMonth(b);

        }
    }


}
