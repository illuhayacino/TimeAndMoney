import java.util.Scanner;

public class TimeMoneyS {
    static public void main (String[] arg){
        Scanner scan = new Scanner(System.in);

        System.out.println("Не знаете что сейчас делать? Введите время и количество денег и мы вам подскажем!");
        int time = scan.nextInt();
        int money = scan.nextInt();
        switch (time){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8: if (money < 50){
                         System.out.println("Спим, либо идем к соседу");
                     }
                    else{
                         System.out.println("Спим");
                     }
                break;
            case 9:
            case 10:
            case 11:
            case 12: if (time >=8 && time <= 12){
                      if (money < 10) {
                            System.out.println("Идем к соседу");
                      }
                     else {
                       if (money > 10 && money < 50){
                            System.out.println("Идем к соседу, либо в магазин");
                       }
                       else {
                            System.out.println("Идем в магазин");
                       }
                     }
                    }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:if (money < 50){
                         System.out.println("Идем к соседу");
                     }
                    else{
                         System.out.println("Идем в кафе");
                     }
                break;
            case 20:
            case 21:
            case 22:if (money > 50){
                        System.out.println("Идем в кафе");
                    }
                    else{
                        System.out.println("Смотрим телефизор");
                    }
                break;
            case 23:
            case 24:if (money > 50){
                        System.out.println("Идем в кафе");
                    }
                    else{
                        System.out.println("Спим");
                    }
                break;
            default:
                System.out.println("Неверное время");
        }
    }
}
