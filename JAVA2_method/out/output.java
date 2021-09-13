// method의 output
// return은 method를 종료시키는 역할을 함
// 데이터 타입을 정해줘야함

// void라는 것은 return 값이 없다라는 의미
public class output{
    
    public static String a(){
        //.. return 을 통해서 값이 됨 return 값이 string이면 void 자리에  String이라고 적어줘야함
        return "a";
    }
    public static int one(){
        return 1;
    }
    public static void main(String[] args){
        System.out.println(a());
        System.out.println(one());
    }
}