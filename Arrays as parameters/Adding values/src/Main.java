import java.util.*;
// the method addValueByIndex takes an array of longs and add value to the long element by its int index:
public class Main {    
    
    public static void addValueByIndex(long[] array, int index, long value) {
        array[index] += value;    
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        int index = scanner.nextInt();
        long value = scanner.nextLong();
        addValueByIndex(array, index, value);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
