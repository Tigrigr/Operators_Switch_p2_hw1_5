public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
}