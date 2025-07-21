package EO;

public class EvenOdd {
    public boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isPalindrome(int number){
        int ramainder, sum = 0, temp;

        temp = number;
        while(number > 0){
            ramainder = number %10; // getting ramainder
                sum = (sum * 10) + ramainder;
                number = number/10;
        }
        if(sum == temp){
            return true;
        }
        return false;
    }
}
