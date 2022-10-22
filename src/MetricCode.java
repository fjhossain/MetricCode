import java.util.Scanner;

public class MetricCode {
    public static float converter(String sourceMetric, String targetMetric, float sourceNum) {
        float targetNum = 0;
        switch (sourceMetric) {
            case "kg":
                switch (targetMetric) {
                    case "lbs":
                        targetNum = sourceNum * (float) 2.2;
                        break;
                    default:
                        System.out.println("Your input is not handled, please try again");
                        return targetNum;

                }
            case "gram":
                switch (targetMetric) {
                    case "ounces":
                        targetNum = sourceNum * (float) .035;
                        break;
                    default:
                        System.out.println("Your input is not handled, please try again");
                        return targetNum;

                }
            case "km":
                switch (targetMetric) {
                    case "mile":
                        targetNum = sourceNum * (float) 1.2;
                        break;
                    default:
                        System.out.println("Your input is not handled, please try again");
                        return targetNum;
                }

            case "mm":
                switch (targetMetric) {
                    case "inches":
                        targetNum = sourceNum * (float) .039;
                        break;
                    default:
                        System.out.println("Your input is not handled, please try again");
                        return targetNum;
                }
        }
        System.out.printf("%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
        return targetNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        String[] strArray;
        float sourceNum;
        String sourceMetric;
        String targetMetric;
        while (true) {
            System.out.println("Welcome to converter!");
            System.out.println("please input your metric converter");
            str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("Thanks, Bye!!");
                scanner.close();
                break;
            }
            strArray = str.split(" ");
            if (strArray.length != 4) {
                System.out.println("nonvalid input");
                continue;
            } else {
                sourceNum = Float.parseFloat(strArray[0]);
                sourceMetric = strArray[1];
                targetMetric = strArray[3];
                converter(sourceMetric, targetMetric, sourceNum);

            }
        }
        scanner.close();
    }

}