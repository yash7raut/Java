public class function_overloading{
    public static void main(String[] args) {
        fun(5,25);
        fun("Yash","Raut");
        System.out.println(sum(1,2,3,4,5,6));
    }
    static void fun(int a, int b){
        System.out.println(a+b);
    }
    static void fun(String a, String b){
        System.out.println(a + b);
    }
    static int sum(int a, int b, int ...v){
        int x = 0;
        for(int i:v){
            x += i;
        }
        return (x+a+b);

        
    }
}