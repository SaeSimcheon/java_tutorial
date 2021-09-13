// method라는 굉장히 중요한 주제를 우리 주제에 도입
// 충분히 시간을 들여서 공부할 것
// 컨셉만 이해할 것
// method는 서로 연관된 코드를 그룹핑해서 이름을 붙인 정리정돈의 상자다


public class AccountingApp{
    //java에서는 field라고 함 전역변수를
    public static double valueOfSupply ; 
    public static double vatRate ; 
    public static double expenseRate ; 
    public static void main(String[] args){
        //double 
        valueOfSupply= Double.parseDouble(args[0]); // String to Double 
        //double 
        vatRate = 0.1 ; 
        expenseRate = 0.3;
        
        print();
        }
            
    
    //public static double getVAT(double v, double vr){
    //    return v * vr;
    //}
    public static double getVAT(){
        return valueOfSupply * vatRate;
    }
    public static double getTotal(){
        return valueOfSupply + getVAT();
    }
    public static double getExpense(){
        return valueOfSupply * expenseRate;
    }
    public static double getIncome(){
        return valueOfSupply - getExpense() ; 
    }
    public static double getDiviend1(){
        return getIncome() *0.5;
    }
    public static double getDiviend2(){
        return getIncome() *0.3;
    }
    public static double getDiviend3(){
        return getIncome() *0.2;
    }
    public static void print(){
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




// 부가가치세 계산 코드는 비록 1줄짜리지만, 만약 1억줄 ... 엄청 복잡한 수식이라고 가정하면
// 그런 상황에서 해당 코드를 다른 곳에 숨겨 놓고, 사용하는 데에서는 아주 짧게 쓸 수 있다면 아주 좋지 않을까?



// method는 서로 연관된 코드를 이름을 붙인 정리정돈의 상자이다.
