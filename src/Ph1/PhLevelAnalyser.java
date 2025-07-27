package Ph1;
import java.util.Scanner;

public class PhLevelAnalyser {
    public static void main(String[] args) {
        String statusOfAquarium = " ";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter phLevel");
        int phLevel = scanner.nextInt();

        PhLevelAnalyser phLevelAnalyser = new PhLevelAnalyser();
        String data = phLevelAnalyser.getPhValueOfWater(phLevel);

        System.out.println(data);
    }

    public String getPhValueOfWater(int phLevel) {
        String statusOfAquarium= " ";

        if(phLevel < 7){
            statusOfAquarium = "ph value is low, partial change the water";
        }
        else if(phLevel >= 7 && phLevel <= 8){
            statusOfAquarium = "ph value is fine";
        }
        else if(phLevel > 8){
            statusOfAquarium = "ph value is high, partial change the water";
        }
        return statusOfAquarium;
    }
}