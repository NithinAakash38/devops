public class firstjava {
    private int num1;
    private int num2;
    
    public firstjava(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int addition() {
        return num1 + num2;
    }
    
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        firstjava calculator = new firstjava(num1, num2);
        int result = calculator.addition();
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
