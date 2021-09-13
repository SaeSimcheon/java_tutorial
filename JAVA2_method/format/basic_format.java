// 메소드가 필요한 순간을 
// 


public class basic_format{
    public static void printTwoTimesA(){
        System.out.println("-");
        System.out.println("A");
        System.out.println("A");
    }
    public static void main(String[] args ){
        
        // 코드가 1억줄이고 1억번 반복되고 있다고 생각해보자
        // 작업했던 내용에 문제가 있다면? -> 같은 취지의 코드 1억개를 다 바꿔주어야함
        // 완전히 똑같다고 고치면서 또 확신할 수 있나? -> 거의 불가능함
        // 또 추가하려면 1억줄의 코드를 추가해야함
        // 함수는 이를 손쉽게 해줌 = method
        // 1억
        printTwoTimesA();
        // 1억
        printTwoTimesA();
        // 1억
        printTwoTimesA();
        
        
        // 1억줄의 코드를 그룹핑해서 -> 이름을 붙임 
        // 코드의 의미를 파악하는 것이 훨씬 더 편해진다
        // 1억줄이 한줄로 바뀜 -> 획기적으로 줄어듦 
        // 수정할때 method 한 번만 수정하면 됨
    }
}