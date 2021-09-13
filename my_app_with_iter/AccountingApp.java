// 반복문을 도입
// 배열과 반복문은 선후행관계는 아니지만
// 서로 같이 쓸때 시너지

// 반복문을 통해서 개선하기

// 동업자가 한 만명정도 된다면

// 분배부분이 코드가 엄청 길어질 것임
// 코드를 수정하려면 엄청나게 힘들 것임
// 우리를 도와줄 수 있는 도구가 반복문

// 

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
        
        int i = 0 ;
        while(i < dividendRates.length){
            System.out.println("Dividend : " + income*dividendRates[i] ); // 몇 명이든지 딱 1줄로 표현 ~ 엄청난 효과
            i = i+1;
        }
        
            
    }
}