
// 인터페이스의 기본 형식
// 하나의 클래스에는 하나의 인터페이스만 올 수 있나?

// 자바는 단 하나만의 클래스를 상속 받기 가능



// 인터페이스에 변수도 정의할 수 있음 / 단 method와 달리 직접 값이 들어와야함
interface Calculable{
    double PI = 3.14 ; 
    int sum(int v1, int v2);
}

interface printable{
    void print() ; 
}

// 인터페이스 정의할때는 내용 안 들어감

// 복수 개의 인터페이스 implements 가능

class RealCal implements Calculable,printable{
    public int sum(int v1, int v2){
        return v1 + v2;
    }
    public void print() { 
        System.out.println("This is RealCal!");
    }
}





public class format{
    public static void main(String[] args){
        // 더하기 기능이 있는 클래스 만들어주세요 => 불분명한 커뮤니케이션 방식
        //DummyCal c = new Dummycal();
        RealCal c = new RealCal();
        System.out.println(c.sum(2,1)); // 여기에 안 맞음
        c.print();
        System.out.println(c.PI); // 여기에 안 맞음
    }
}
