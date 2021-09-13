// 이전시간에 상속을 알아봤지만, 확장만 했을뿐 아무런 조치 안 했음.

// 어떻게하면 자식은 새로운 기능을 추가할 수 있을까?

// 덮어쓰기는 가능할까?

// 부모클래스의 기능이 마음에 안들어서 바꾸고 싶다면?
// 똑같은 형태의 메소드를 추가하고 수정하면 되긴해
// 부모가 갖고 있는 기능을 덮어썼다~ 올라탔다는 의미에서 overriding

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
        System.out.println("Helo");
        return v1 + v2 ;
    }
}


public class facility{
    public static void main(String[] args){
        
        Cal c = new Cal();
        System.out.println(c.sum(2,1));
        
        
        Cal3 c3 = new Cal3();
        System.out.println(c3.sum(2,1));
        System.out.println(c3.minus(2,1));
    }
}