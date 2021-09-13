// access level modifier
// 접근 제어자 public protected default, private

//public

public class Supp1{
    // public protected default(생략 가능) private
    
    private static void hi(){
        System.out.println("hi");
    }
    public static void main(String[] args){
        hi();
    }
}

