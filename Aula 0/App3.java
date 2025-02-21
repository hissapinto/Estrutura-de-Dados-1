public class App3{
    public static void main(String[] args){
        System.out.println(maior(10,34,876));
    }
    public static int maior(int a, int b, int c){
        //if(a>b && a>c) return a;
        //else if(b>c) return b;
        //return c;
        return a>b && a>c ? a : b>c ? b : c;
    }
}
