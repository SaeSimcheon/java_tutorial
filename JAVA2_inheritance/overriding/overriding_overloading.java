// overriding vs overloading

// 헷갈리고 비슷함




class Cal{
    public int sum(int v1, int v2){
        return v1 + v2 ;
    }
}


// 그냥 별거 없이 상속 후에 추가만 해줘도 되네
class Cal3 extends Cal{
    public int minus(int v1, int v2){
        return v1 - v2 ;
    }
    public int sum(int v1, int v2){
        System.out.println("Helo"); // 부모의 기능을 올라타서 덮어쓰기한 것 -> 재 정의한 것 오버라이딩
        return v1 + v2 ;
    }
}


//오버로드는 과적하다 너무 많이 탑재하다
// 오버로드 자체는 상속과 무관함
// 자바는 같은 이름의 메소드를 과적할 수 있음
// 형태만 다르면 가능
// 이름은 같은데 기능이 다르면 

// overloading

// 자식이 가질 수도 있고, 부모가 가질 수 있음
// 상속과 상관 없다는 관점으로 보기

public class overriding_overloading{
    public static void main(String[] args){
        
        Cal c = new Cal();
        System.out.println(c.sum(2,1));
        
        
        Cal3 c3 = new Cal3();
        System.out.println(c3.sum(2,1));
        System.out.println(c3.minus(2,1));
    }
}