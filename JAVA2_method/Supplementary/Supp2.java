// static이라는 메소드에 대한 키워드
// 좀 어려움

// static - class method
// no static - instance method


public class Supp2{
    public static void a(String delimiter){
        System.out.println(delimiter);
        System.out.println("a");
        System.out.println("a");
    }
    public static void b(String delimiter){
        System.out.println(delimiter);
        System.out.println("b");
        System.out.println("b");
    }
    public static void main(String[] args){
        a("-");
        b("*");
    }
    
        
    }
}