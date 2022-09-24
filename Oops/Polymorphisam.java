package Oops;

public class Polymorphisam{
    static int Addition(int a, int b){
        return a+b; 
    }
    static float Addition(int a, int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(Addition(20,10,40));
        System.out.println(Addition(10,20));
    }
}