// 만약 내가 B를 출력하고 싶다면?
// 입력값에 따라 다르게 동작하도록 만드는 것이 효율적이지 않을까?

// main은 약속
// main ~ method
// 이것이 있어야 우리가 실행하고 싶은 프로그램 실행 가능
// main이라는 메소드를 자바가 실행할때 입력해주어야 하는 것들
// method를 사용하는 쪽에서 흘려주는 정보 -> 매개변수
// parameters 
// 함수 안으로 주입한 ''구체적인 값''은 인자라고 함. argument라고 부름
// method에서 굉장히 중요한 주제


public class wihtinput{
    public static void printTwoTimes(String text,String indicator){
        System.out.println(indicator);
        System.out.println(text);
        System.out.println(text);
    }
    
    
    public static void main(String[] args ){
        
        // 코드가 1억줄이고 1억번 반복되고 있다고 생각해보자
        // 작업했던 내용에 문제가 있다면? -> 같은 취지의 코드 1억개를 다 바꿔주어야함
        // 완전히 똑같다고 고치면서 또 확신할 수 있나? -> 거의 불가능함
        // 또 추가하려면 1억줄의 코드를 추가해야함
        // 함수는 이를 손쉽게 해줌 = method
        // 1억
        
        printTwoTimes(args[0],args[1]);
        // 1억
        printTwoTimes(args[0],args[1]);
        // 1억
        printTwoTimes(args[0],args[1]);
        
        
        // 1억줄의 코드를 그룹핑해서 -> 이름을 붙임 
        // 코드의 의미를 파악하는 것이 훨씬 더 편해진다
        // 1억줄이 한줄로 바뀜 -> 획기적으로 줄어듦 
        // 수정할때 method 한 번만 수정하면 됨
    }
}