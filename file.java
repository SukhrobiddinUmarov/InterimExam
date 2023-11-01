import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class file {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите элементы массива через: ', ': ");
        String inputData = input.nextLine();
        String[] array = inputData.split(", ");
        Random random = new Random();
        int randomNumber = random.nextInt(4);
        String[] newArray = Arrays.copyOf(array, randomNumber);
        
        System.out.println("Элементы массива: ");
        System.out.println(Arrays.toString(newArray));    
        input.close();
    }
}