public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        int iOs = 0;
        int android = 1;
        if (clientOS == iOs) {
            System.out.println("Установите версию приложения для iOs по ссылке");
        } else if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Операционная система не поддерживается");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2014;
        int clientOS = 0;
        int iOs = 0;
        int android = 1;
        int checkYear = 2015;
        if (clientDeviceYear >= checkYear && clientOS == iOs) {
            System.out.println("Установите версию приложения для iOs по ссылке");
        } else if (clientDeviceYear >= checkYear && clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < checkYear && clientOS == iOs) {
            System.out.println("Установите облегченную версию приложения для iOs по ссылке");
        } else if (clientDeviceYear < checkYear && clientOS == android) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Операцмонная система не поддерживается");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 1600;
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int day = 0;
        if (deliveryDistance < 20) {
            day = day + 1;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            day = day + 2;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            day = day + 3;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 10;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}


