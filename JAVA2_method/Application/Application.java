public class Application{
    public static double valueOfSupply = 10000.0;
    public static double varRate = 0.1;
    
    public static double getVAT(){
        return valueOfSupply * varRate; // 전역 변수 처리 없이 사용하면 오류 -> 선언전까지는 지역변수임
    }
    public static double getTotal(){
        return valueOfSupply + getVAT(); // 전역 변수 처리 없이 사용하면 오류 -> 선언전까지는 지역변수임
    }
    public static void main(String[] args ){
        //엄청 복잡한 코드다
        // 
        double vat = getVAT(); // 이코드가 만약에 1억 줄짜리고 1년정도 후에 내가 이 코드를 읽는다면?
        // method를 이용해서 처리 방법에 이름을 붙일 수 있다면 취지를 쉽게 파악할 수 있을 것
        // double vat = getVAT();
        double total = getTotal();
        
        System.out.println("valueOfSupply : " + valueOfSupply);
        System.out.println("vat : " + vat);
        System.out.println("Total : " + total);
    }
}

// 재사용할 때 수정을 얼마나 해야하지?
// 다시 사용할 것인가?
// 가독성이 높아지는가?