// 하나의 클래스가 여러가지 얼굴을 갖게함

// 인스턴스의 데이터 타입은 class를 지정할 수도 있고, class가 구현하고 있는 인터페이스를 지정할 수도 있음
// 

interface Calculable{
    double PI = 3.14 ; 
    int sum(int v1, int v2);
}

interface printable{
    void print() ; 
}



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
        
        RealCal c = new RealCal();
        
        Calculable c1 = new RealCal();
        
        // print()는 없음 감춰지는 것
        // 마찬가지로 Printable로 지정하면 Calculable
        System.out.println(c.sum(2,1)); 
        c.print();
        System.out.println(c.PI); 
    }
}




// 기능이 너무 많으면 자유도가 높지만, 배워야하는 부담감이 엄청날 수 있음
// 필요한 기능만 딱
// RealCal

// 필요없는 기능을 감추는 역할 => RealCal이 Calculable로서 사용할 것이다.

// 이러면 최소한의 학습을 통해서 사용할 수 있음

// 나중에 다른 클래스 


// 같은 interface를 쓰는 다른 class에 대하여 돌려 끼우기 가능함


// 호환성을 보장할 수 있다

// 데이터 타입을 무엇으로 설정하느냐에 따라서 여러 얼굴을 갖게하는 것 => 다형성