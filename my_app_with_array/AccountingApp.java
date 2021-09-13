// 배열 적용

public class AccountingApp{
    public static void main(String[] args){
        double valueOfSupply= Double.parseDouble(args[0]); // String to Double 
        double vatRate = 0.1 ; 
        double expenseRate = 0.3;
        
        double vat = valueOfSupply*vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply*expenseRate;
        double income = valueOfSupply - expense;
        
        
        
         // 도중에 rate가 바뀌거나, 하는 문제점이 있을 수 있음 
        // 세개의 변수가 같은 성격이 같다고 판단하려면 시간이 걸림
        
        double[] dividendRates = new double[3] ;  // 더블형 데이터로 이루어진 배열이다 ~ double[] dividendRates 더블형 3개를 담을 수 있는 수납상자 new double[3] ;
        dividendRates[0] = 0.5 ; 
        dividendRates[1] = 0.3 ; 
        dividendRates[2] = 0.2 ; 
        // 배열을 도입함으로써 서로 연관된 값임을 분명히
        // 정리정돈의 중요성
        // 서로 연관된 데이터를 관리하는 수단
        // 사실 args 앞의 String[] 이건 배열임
        
        double dividend1 =income*dividendRates[0]; // 미리 선언 가능
        double dividend2 =income*dividendRates[1];
        double dividend3 =income*dividendRates[2];
        
    
        
        
        
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