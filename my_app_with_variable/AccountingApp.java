// 변수를 새로 배워서 도입해야겠다고 생각한 단계


public class AccountingApp{
    
    public static void main(String[] args){
        double valueOfSupply= 10000;
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
// 변수를 적용함으로써 일일이 valueOfSupply의 값을 모든 행에 결쳐서 바꿀 필요가 없어져 시간을 아낄 수 있게 되었고,
// 잘못 바꿨을때 발생할 수 있는 오류를 범할 확률이 낮아졌다.