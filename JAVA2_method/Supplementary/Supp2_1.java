// Supp2를 class를 통하여 정리할 것임

// method는 static이면 클래스 소속이고,
// no static이면 인스턴스 소속이다.


class print{
    public String delimiter ; 
    public void a(){
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }
    public void b(){
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
    }
    public static void c(String delimiter){
        System.out.println(delimiter);
        System.out.println("b");
        System.out.println("b");
    }
}


public class Supp2_1{
    
    public static void main(String[] args){
        //print.a("-");
        //print.b("-"); // 이 작업이 1억개라면
        // 그리고 또 1억개 라면?
        //print.a("*"); // 같은 구분자 공유하고 있음 
        // 저 -라는 것 그리고 여기 있는 *를 중복해서 넣어야할 것
        
        
        // instance 
        print t1 = new print(); //print라는 데이터 타입인 print라는 class의 분신
        t1.delimiter = "-";
        t1.a(); // t1의 소속으로서 실행됨 반면, print.a 이런 경우에는 class의 소속임 -> static 있어야함.
        // t1소속인 경우 static이 없어야함
        t1.b();
        //print.b("*");
        
        
        // instance 
        print t2 = new print(); //print라는 데이터 타입인 print라는 class의 분신
        t2.delimiter = "-";
        t2.a();
        t2.b();
        
        // print.a("*"); 이것은 이제 static이 없어서 실행이 안 됨
        print.c("*");
        
    }   
}