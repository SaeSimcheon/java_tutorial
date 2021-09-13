// 제어문의 적용
// 조건문과 반복문
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
        double dividend1 ; // 미리 선언 가능
        double dividend2 ;
        double dividend3 ;
        
        if (income > 10000.0){ 
            dividend1 = income*0.5 ;
            dividend2 = income*0.3 ;
            dividend3 = income*0.2 ;
        }
        else{
            dividend1 = income*1 ;
            dividend2 = income*0 ;
            dividend3 = income*0 ;
            
        }
    
        
        
        
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