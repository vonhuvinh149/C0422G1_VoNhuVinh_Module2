package ss1_module2.baitap;

import java.util.Scanner;

public class docso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so can dich:");
        int number = sc.nextInt();
        int number1 = number / 100;
        int number2 = (number % 100) / 10;
        int number3 = (number % 100) % 10;
        if (number >= 0) {
            switch (number) {
                case 0:
                    System.out.println("zero ");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("for");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eigth");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
            if (number > 20 && number < 100) {
                switch (number2) {
                    case 2:
                        System.out.print("tewnty ");
                        break;
                    case 3:
                        System.out.print("thirdty ");
                        break;
                    case 4:
                        System.out.print("fourty ");
                        break;
                    case 5:
                        System.out.print("fivety ");
                        break;
                    case 6:
                        System.out.print("sixty ");
                        break;
                    case 7:
                        System.out.print("seventy ");
                        break;
                    case 8:
                        System.out.print("eighty ");
                        break;
                    case 9:
                        System.out.print("nine ");
                        break;
                }
                switch (number3) {
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                }

            }
            if (number > 100) {
                switch (number1) {
                    case 1:
                        System.out.print("one hundred ");
                        break;
                    case 2:
                        System.out.print("two hundred ");
                        break;
                    case 3:
                        System.out.print("three hundred ");
                        break;
                    case 4:
                        System.out.print("four hundred ");
                        break;
                    case 5:
                        System.out.print("five hundred ");
                        break;
                    case 6:
                        System.out.print("six hundred ");
                        break;
                    case 7:
                        System.out.print("seven hundred ");
                        break;
                    case 8:
                        System.out.print("eigth hundred ");
                        break;
                    case 9:
                        System.out.print("nine hundred ");
                        break;
                }
                if ((number % 100) > 10 && (number % 100) < 20) {
                    switch (number3) {
                        case 1:
                            System.out.println("eleven");
                            break;
                        case 2:
                            System.out.println("twele");
                            break;
                        case 3:
                            System.out.println("thirdteen");
                            break;
                        case 4:
                            System.out.println("fourteen");
                            break;
                        case 5:
                            System.out.println("fifteen");
                            break;
                        case 6:
                            System.out.println("sixteen");
                            break;
                        case 7:
                            System.out.println("seventeen");
                            break;
                        case 8:
                            System.out.println("eighteen");
                            break;
                        case 9:
                            System.out.println("nineteen");
                            break;
                    }
                } else {
                    switch (number2) {
                        case 2:
                            System.out.print("tewnty ");
                            break;
                        case 3:
                            System.out.print("thirdty ");
                            break;
                        case 4:
                            System.out.print("fourty ");
                            break;
                        case 5:
                            System.out.print("fivety ");
                            break;
                        case 6:
                            System.out.print("sixty ");
                            break;
                        case 7:
                            System.out.print("seventy ");
                            break;
                        case 8:
                            System.out.print("eighty ");
                            break;
                        case 9:
                            System.out.print("nine ");
                            break;
                    }
                    switch (number3) {
                        case 1:
                            System.out.println("one");
                            break;
                        case 2:
                            System.out.println("two");
                            break;
                        case 3:
                            System.out.println("three");
                            break;
                        case 4:
                            System.out.println("four");
                            break;
                        case 5:
                            System.out.println("five");
                            break;
                        case 6:
                            System.out.println("six");
                            break;
                        case 7:
                            System.out.println("seven");
                            break;
                        case 8:
                            System.out.println("eight");
                            break;
                        case 9:
                            System.out.println("nine");
                            break;
                    }
                }
            }

            if (number > 10 && number < 20) {
                switch (number3) {
                    case 1:
                        System.out.println("eleven");
                        break;
                    case 2:
                        System.out.println("twele");
                        break;
                    case 3:
                        System.out.println("thirdteen");
                        break;
                    case 4:
                        System.out.println("fourteen");
                        break;
                    case 5:
                        System.out.println("fifteen");
                        break;
                    case 6:
                        System.out.println("sixteen");
                        break;
                    case 7:
                        System.out.println("seventeen");
                        break;
                    case 8:
                        System.out.println("eighteen");
                        break;
                    case 9:
                        System.out.println("nineteen");
                        break;
                }
            }
        }
    }
}













