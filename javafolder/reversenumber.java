public class reversenumber {
    public static void main(String[] args) {
        int num = 12345; //input
        int reversed = 0;

        while (num != 0) {  //loop
            int digit = num % 10; 
            reversed = reversed * 10 + digit; 
            num /= 10; 
        }

        System.out.println("Reversed Number: " + reversed);  //print statment
        
    }

}
