

public class Question5 {
    public static void main(String[] args) {
        int number=1234985567,evenCount = 0,oddCount = 0;
        while (number > 0)
        {
            if (number % 2 == 0){
                evenCount++;
            }
            else {
                oddCount++;
            }
            number /= 10;
        }
        System.out.println("the number of even numbers is " + evenCount);
        System.out.println("the number of odd numbers is " + oddCount);
    }

}
