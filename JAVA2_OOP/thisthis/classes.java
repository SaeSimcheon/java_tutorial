// class 등장

// 1억개의 변수와 메소드가 있어 정리의 필요성
// 관련 있는 변수와 메소드들 정리
// 클래스에 속해있는 변수와 메소드를 멤버라고 부름


//어떤 프로그램 만들때 소스코드와 이름이 똑같은 class를 하나 만들면 자바는 소스파일과 똑같은 이름의 class를 찾아서  main method를 동작하도록함
//따라서 자바를 배움과 동시에 무조건 클래스를 하고 있는 것

// public 접근 제어자

// public은 한 번만 등장한다?

// 컴파일 했을때 각각의 클래스가 파일로서 존재하게 됨
// class 파일은 별도의 파일로 쪼갤 수 있음
// 해당 클래스와 똑같은 이름의 파일 생성



public class classes{
    public static void main(String[] args ){
        
        print p1 = new print(); // 인스턴스 생성
        p1.delimiter = "****"; // 인스턴스에 사용할 변수와 메소드는 static 을 제거해줘야함.
        p1.A();
        p1.A();
        p1.B();
        p1.B();
        
        
        print p2 = new print(); // 인스턴스 생성
        p2.delimiter = "****"; // 인스턴스에 사용할 변수와 메소드는 static 을 제거해줘야함.
        p2.A();
        p2.A();
        p2.B();
        p2.B();
        
        // 절약적이다
        // 만약 delimiter를 반복적으로 변경한다면 class만 이용하는 것 불편함.
        p1.A();
        p2.A();
        p1.A();
        p2.A();
        
        
        
    }
    
}