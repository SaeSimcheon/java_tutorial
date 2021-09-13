// method를 할줄 알면 object라는 것을 공부할 준비가 됨
// 객체지향
// 사용하게될 많은 라이브러리 들이 객체 지향으로 되어 있음

// class는 서로 연관된 변수와 method를 grouping한 것 그리고 이름을 붙인 것
// 정리정된의 상자

// 뼈대와 같은 역할 ~ 메소드와 클래스

// 우리 프로젝트에 뭐가 불만족스럽길래



// method라는 굉장히 중요한 주제를 우리 주제에 도입
// 충분히 시간을 들여서 공부할 것
// 컨셉만 이해할 것
// method는 서로 연관된 코드를 그룹핑해서 이름을 붙인 정리정돈의 상자다


// 회계와 상관 없는 method와 변수가 있다면?
// 생산성을 낮추는 방해요소가 될 수 있음
// accounting이라는 class 만들 것


class Accounting{
    public double valueOfSupply ; 
    public double vatRate ; 
    public double expenseRate ; 
    public double getVAT(){
        return valueOfSupply * vatRate;
    }
    public double getTotal(){
        return valueOfSupply + getVAT();
    }
    public double getExpense(){
        return valueOfSupply * expenseRate;
    }
    public double getIncome(){
        return valueOfSupply - getExpense() ; 
    }
    public double getDiviend1(){
        return getIncome() *0.5;
    }
    public double getDiviend2(){
        return getIncome() *0.3;
    }
    public double getDiviend3(){
        return getIncome() *0.2;
    }
    public void print(){
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal()); // 이 기능으로 계산기와의 기능에서 승리
        System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("dividend1 : " + getDiviend1());
        System.out.println("dividend2 : " + getDiviend2());
        System.out.println("dividend3 : " + getDiviend3());
        
    }
}


public class AccountingApp{
    //java에서는 field라고 함 전역변수를
    public static void main(String[] args){
        //double 
        Accounting a1 = new Accounting();
        a1.valueOfSupply= Double.parseDouble(args[0]); // String to Double 
        a1.vatRate = 0.1 ; 
        a1.expenseRate = 0.3;
        a1.print();
        
        // 이들을 인스턴스라고 부름
        
        Accounting a2 = new Accounting();
        a2.valueOfSupply= Double.parseDouble(args[1]); // String to Double 
        a2.vatRate = 0.05 ; 
        a2.expenseRate = 0.2;
        a2.print();
        
        // 이들을 인스턴스라고 부름
        
        
        // 소속관계를 명확히함으로써 다른 것들과 섞여도 헷갈리지 않는다.
        }
    //public static double getVAT(double v, double vr){
    //    return v * vr;
    //}
    
}



// 인스턴스
