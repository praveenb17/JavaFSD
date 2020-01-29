class CalculateByUsingMethodsParamsReturn{
    public static void main(String[] args) 
        {
            new CalculateByUsingMethodsParamsReturn().cal();   
        }

        void cal()
        {
            int firstNum, secondNum;
 
            java.util.Scanner scan = new java.util.Scanner(System.in);
            System.out.println("Enter two numbers");
            firstNum = scan.nextInt();
            secondNum = scan.nextInt();
            new CalculateByUsingMethodsParamsReturn().print(new CalculateByUsingMethodsParamsReturn().add(firstNum,secondNum));   
        }

        void print(int res)
        {
            System.out.println("Addition of no's is : " + res);

        }
     
        int add(int firstNum, int secondNum)
        {
            return firstNum + secondNum;
        }
}
