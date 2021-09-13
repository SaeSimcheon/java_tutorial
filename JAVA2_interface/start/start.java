// 자바 인터페이스 수업
// 클래스와 인스턴스

// 세상에는 많은 전자제품들이 있음

// 규격 없이 전류를 가정으로 보낸다면?
// 신경쓸 것이 정말 많다

// 산업계에서는 콘센트와 플러그를 규격을 만듦 -> 인터페이스 => 규제임


// 이것의 목적은 자유임

// 규칙을 준수하기만 한다면 자유임


// 프로그래밍에서 가능하지 않을까? -> 인터페이스



// 더하기 기능이 있는 class가 필요함 . 시간이 없어서 외주 보냄


interface Calculable{
    int sum(int v1, int v2);
}

//Calculable이라고 이름을 붙임 이 규칙에 대해서
//int sum(int v1 , int v2 ); // 규칙



// 인터페이스 사용
// 규칙 
// 규칙을 지키지 않은 것은 컴파일 조차 안 됨
// 원하지 않는 형태를 적어도 갖지 않는다는 것을 확신할 수 있음



class DummyCal implements Calculable{
    public int sum(int v1 , int v2){
        return 3 ;
    }
}


class RealCal{
    public double plus(double v1, double v2 ,double v3){
        return v1 + v2 + v3 ; 
    }
}



class DummyCal{
    public int sum(int v1 , int v2 ){
        return 3; 
    }
} // 우리가 원한 것

public class start{
    public static void main(String[] args){
        // 더하기 기능이 있는 클래스 만들어주세요 => 불분명한 커뮤니케이션 방식
        //DummyCal c = new Dummycal();
        RealCal c = new RealCal();
        system.out.prinln(c.sum(2,1)); // 여기에 안 맞음
        
    }
}


// 오해의 지옥에서 우리를 구해주는 것이 