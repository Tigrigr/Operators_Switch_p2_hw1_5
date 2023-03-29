public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte clientOS = 1;
        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке.");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке.");
                break;
        }
    }
    public static void task2 () {
        System.out.println();
        System.out.println("Задача 2");
        byte clientOS = 0;
        short clientDeviceYear = 2015;
        short correctClientDeviceYear = 2002;
        if(correctClientDeviceYear>clientDeviceYear){
            if(clientOS == 0){
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }else {
            if(clientOS == 0){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }
    }
    public static void task3 () {
        System.out.println();
        System.out.println("Задача 3");
        short year = 1204;
        int multipleOfFour = year % 4;
        int multipleOfOnehundred = year % 100;
        if (multipleOfOnehundred == 0 || multipleOfFour != 0 ){
            System.out.println("Год  не високосный");
        }else {
            System.out.println("Год  високосный");
        }
    }
    public static void task4 () {
        System.out.println();
        System.out.println("Задача 4");
        short deliveryDistance = 150;
        byte daysDelivery;
        if (deliveryDistance<20){
            daysDelivery = 1;
            System.out.println("Потребуется дней: " + daysDelivery);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            daysDelivery = 2;
            System.out.println("Потребуется дней: " + daysDelivery);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            daysDelivery = 3;
            System.out.println("Потребуется дней: " + daysDelivery);
        }else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5 () {
        System.out.println();
        System.out.println("Задача 5");
        byte monthNumber = 25;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима, одевайся теплее!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна, нужны резиновые сапоги.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето, пошли купаться!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень, кушай витаминчики.");
                break;
            default:
                System.out.println("Это по какому календарю?");
        }
    }
}