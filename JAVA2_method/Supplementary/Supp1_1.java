// access level modifier
// 접근 제어자 public protected default, private

//public

// 메소드가 많아지면 서로 연관된 메소드 그루핑을 위하여 class

// 프라이빗이라서 에러
// 프라이빗은 같은 클래스 안에서만 사용할 수 있음.
// 퍼블릭으로 바꾸주면 됨
// protected와 default는 뭘까?

// 내부적으로 사용하는 것들은 private 사용자가 몰라도 되거나, 몰랐으면 하는 것
// public 사용자가 사용할 수 있는 것

// 좀더 정교한 사용과 


// 외부에서 접근하는 경계를 만듦

class Greeting{
    private static void hi(){
        System.out.println("hi");
    }
}
}

public class Supp1{
    // public protected default(생략 가능) private
    
    public static void main(String[] args){
        Greeting.hi();
    }
}

