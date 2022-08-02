public class Main {
    public static void main(String[] args) {


        //Задача 1
        int clientOs = 0;
        if (clientOs == 1) {
            System.out.println("андройд");
        } else if (clientOs == 1) {
            System.out.println("ios");
        } else {
            System.out.println("ос не найдена");
        }

        //Задача 2
        int client = 0;
        int year = 2015;
        if (client == 0 && year > 2019) {
            System.out.println("установите андройд");
        } else if (client == 0 && year < 2019) {
            System.out.println("установите облегчённую версию андройд");
        } else if (client == 1 && year > 2019) {
            System.out.println("установите ios");
        } else if (client == 1 && client < 2019) {
            System.out.println("установите облегчённую версию ios");
        } else {
            System.out.println("устройство не поддерживается");
        }

        // Задача 3
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
            System.out.printf("год %s является високосный", year);
        }else {
            System.out.printf("год %s не является високосный", year);
        }
        System. out.println();
        // Задача 4
        int deliveryDistance = 95;
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            System. out.println("Доставка за 1 день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System. out.println("Доставка за 2 дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System. out.println("Доставка за 3 дня");
        } else {
            System. out.println("Доставки нет");
        }
        //Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
            break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
            break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
            default:
                System.out.println("Такого месяца нет");
        }



    }
}