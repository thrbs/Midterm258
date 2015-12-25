import java.util.Scanner;

public class Midterm3_58 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, odd = 0, even = 0, temp;
        do{
            System.out.print("Enter a number(1-999): ");
            number = input.nextInt();
        }while(number < 1 || number > 999);
        
        temp = number;
        while(temp > 0){
            if((temp % 10) % 2 == 0)
                even++;
            else
                odd++;
            temp /= 10;
        }
        
        if(even > 0 && odd > 0)
            System.out.println(number + " mix even and odd number");
        else if(even > 0)
            System.out.println(number + " all even number");
        else
            System.out.println(number + " all odd number");
    }
}
