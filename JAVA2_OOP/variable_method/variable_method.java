// 클래스를 사용하기 전에 클래스가 없으면 불편한점을 알아보자
// 구분자를 바꿔주고 싶음. 수정하거나 method를 새로 만든다?
// 각각의 method의 파라미터를 수정한다.

// printA print B 연관성이 굉장히 깊게 연관되어 있음
// 1억개의 또 다른 method들이 있다면
// 

// 반복해서 사용한다 -> method 
// class 
public class variable_method{
    public static void printA(String delimiter){
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public static void printB(String delimiter){
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
    public static void main(String[] args){
        //.. 반복되는 작업 -> 메소드 사용
        String delimiter = "----";
        printA(delimiter);
        printA(delimiter);
        printA(delimiter);
        printB(delimiter);
        printB(delimiter);
        printB(delimiter);
        String delimiter = "####"; // 이것도 싫다면
        printA(delimiter);
        printA(delimiter);
        printA(delimiter);
        printB(delimiter);
        printB(delimiter);
        printB(delimiter);
        //.. 만약 이것들이 1억개이고
        // 구분자가 자주 바뀐다면?
    }
}