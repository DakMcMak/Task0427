import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int lang = 0, auxiliary = Integer.parseInt(number);
        for (int k = 0; k < number.length(); k++) {
            number.charAt(k);
            lang++;
        }
        if(auxiliary % 2 == 0 && lang == 1){
            System.out.println("четное однозначное число");
        }
        if(auxiliary % 2 == 1 && lang == 1){
            System.out.println("нечетное однозначное число");
        }
        if(auxiliary % 2 == 0 && lang == 2){
            System.out.println("четное двузначное число");
        }
        if(auxiliary % 2 == 1 && lang == 2){
            System.out.println("нечетное двузначное число");
        }
        if(auxiliary % 2 == 0 && lang == 3){
            System.out.println("четное трехзначное  число");
        }
        if(auxiliary % 2 == 1 && lang == 3){
            System.out.println("нечетное трехзначное  число");
        }
    }
}
