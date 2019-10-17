
import java.util.*;

public class RandomNumberRange {
    public static void main(String[] args) {
        Random r = new Random();
        int low = 10;
        int high = 20;
        int result = r.nextInt(high-low) + low;
        System.out.println(result);
    }
}

