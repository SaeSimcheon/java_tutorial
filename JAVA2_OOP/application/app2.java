// 활용 

class Accounting{
    public double valueOfSupply;
    public double varRate = 0.1;
    public double getVAT(){
        return valueOfSupply * varRate ; 
    }
    public double getTotal(){
        return valueOfSupply + getVAT();
    }
}

public class app2{
    public static void main(String[] args){
        
        // 10000.0 세팅 상태후에 여러가지 행위들을 끝낸 다음에 
        
        // class의 상태가 계속해서 바뀌어야하는 상황이 있다면?
        // 단 하나의 클래스를 여러상태가 클래스를 돌려서 사용하고 있기 때문에 오류를 범할 확률이 높음
        
        // 독립된 인스턴스 제어
        
        
        // 독립된 내부적인 상태로 존재
        
        // varRate 어떤 인스턴스간에 동일하기 때문에 class의 소속으로 내버려두는 것이 더 좋을 수 있다.
        // 인스턴스를 만들때마다 메모리를 사용하지 않아도 되기 때문에 절약적이다.
        
        // 
        Accounting a1 = new Accounting();
        a1.valueOfSupply = 10000.0;
        
        Accounting a2 = new Accounting();
        a2.valueOfSupply = 20000.0;
        
        
        System.out.println("Value of supply:" + a1.valueOfSupply);
        System.out.println("Value of supply:" + a2.valueOfSupply);
        System.out.println("VAT:" + a1.getVAT());
        System.out.println("VAT:" + a2.getVAT());
        System.out.println("Total:" + a1.getTotal());
        System.out.println("Total:" + a2.getTotal());
        
    }
}