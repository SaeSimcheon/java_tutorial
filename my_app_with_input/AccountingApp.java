// 데이터가 바뀌었다고 코드와 로직을 바꾸는 행동은 좋지 못함
// 입력값을 주면 그에 따라서 서로 다른 출력값을 나타낼 수 있음

public class AccountingApp{
    
    public static void main(String[] args){
        double valueOfSupply= Double.parseDouble(args[0]); // String to Double 
        double vatRate = 0.1 ; 
        double expenseRate = 0.3;
        
        double vat = valueOfSupply*vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply*expenseRate;
        double income = valueOfSupply - expense;
        
        double dividend1 = income*0.5 ;
        double dividend2 = income*0.3 ;
        double dividend3 = income*0.2 ;
        
        
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total); // 이 기능으로 계산기와의 기능에서 승리
        System.out.println("Expense : " + expenseRate);
        System.out.println("Income : " + income);
        System.out.println("Dividend 1: " + dividend1 );
        System.out.println("Dividend 2: " + dividend2 );
        System.out.println("Dividend 3: " + dividend3 );
            
    }
}
// 변수에 이어 입력을 받아 일일이 코드를 수정할 필요가 없어졌다.

// 다른 컴퓨터에서 실행시키고 싶은데?
// 자바 런타임 환경이 있어야함

// launch4j 이런 것을 이용하면 