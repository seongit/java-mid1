package lang.wrapper.test;

import java.util.Random;

public class LotteGenerator {

    private final Random random = new Random();

    private int[] numbers = new int[6];
    private int count = 0;

    public int[] generate(){
        while (count < 6) {
            int number = random.nextInt(45) + 1;
            if(isUnique(number)){
                numbers[count] = number;
                count++;
            }
        }

        return numbers;
    }

    private boolean isUnique(int number) {
        for(int i=0; i < count; i++){
            if (numbers[i] == number) {
                return false;
            }
        }
        return true;
    }

}
