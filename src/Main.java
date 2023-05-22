// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int output = addition(2, 3);
        long res= multiplication(23, 234);
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        //for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
        // Strings
        String my_name = "Hello there this is Florence codding";
       String fName= "Abbo";
       String lName = "Florence";
        System.out.println(fName.concat(lName)); //String concatinate method yto add two string

        String school = "WITU";
        System.out.println(school.toLowerCase());// convert uppercase to lowecase

        String finance = "witu";
        System.out.println(finance.toUpperCase());

        byte byte_type = 127;
        short short_type =32_762;
        int int_type =2_000_000_000;
        long long_type =3_000_000_000_000L;
        double double_type = 4.22; //  it is a double
        float float_type = 4.21f; // f differentiates btn a double and a float



        System.out.println(byte_type);
        System.out.println(short_type);
        System.out.println(int_type);
        System.out.println(long_type);
        System.out.println(double_type);
        System.out.println(float_type);
        System.out.println(output);
        System.out.println(res);
        System.out.println(my_name);
        System.out.println(my_name.length());
        }

        public static   int addition( int x, int y){
        int result = x + y;
        return result;
        }
        public  static long multiplication(long a, long b){
        long result1 = a * b;
        return result1;
        }

    }
