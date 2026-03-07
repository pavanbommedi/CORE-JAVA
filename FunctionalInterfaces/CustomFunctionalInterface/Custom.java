public class Custom {
    public static void main(String[] args) {
        int result = calculator((a,b)->a+b, 1, 2);
        System.out.println(result);
        
    }

    public static <T> T calculator(Operations<T> function,T value1 ,T value2){
        T result = function.operate(value1, value2);
        System.out.println("Result of operation: "+result);
        return result;
    }

}
