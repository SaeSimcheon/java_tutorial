// 객체를 상속하는 방밥
// 많은 사람들이 쓰고 있거나, 내가 만든 클래스가 아니거나, 자바 내장 클래스면
// 수정할 수 없음
// 그런데 나는 저 클래스에 다른 기능을 추가 하고 싶어

// 복제 클래스를 만드는 방법도 어떤 대안이 될 수 있음
// 하지만, 해당 상태만으로 만족하기 어려운 경우가 있음.

// 기존의 class가 문제가 수정이 되었는데, 복제본을 만든 나는 
// 기존의 클래스에 어떤 수정 권한이 없어서 바뀌었다는 사실도 모를 수 있고, 일일이 수정해야한다는 문제가 있음
// class의 기능이 많아질수록 문제는 점점 복잡해짐.

// 코드가 길어지면 같은 코드인지 판단하는 것도 어려움


// 재사용성, 가독성, 확장성, 유지보수 편리

class Cal{
    public int sum(int v1, int v2){
        return v1 + v2 ;
    }
}



class Cal3 extends Cal{
    
}


public class start{
    public static void main(String[] args){
        
        Cal c = new Cal();
        System.out.println(c.sum(2,1));
        
        
        Cal3 c3 = new Cal3();
        System.out.println(c3.sum(2,1));
        
    }
}