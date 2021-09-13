// app 하나 만들어보기
// 최소한으로 배워서 최대한으로 활용하는 사례 알고 있는 것만으로도 충분히 많은 것 할 수 있음
// 불편함을 해소해주는 지식을 배울 것
// 물건을 판매하는 사업
// 인건비 유통비 ... 이익을 또 공업자에게 공평하게 나누어주는 작업.. 계산이 필요함
// 내가 만약 판매자
// 소비자는 국세청에 부과가치세를 10%로 지불
// 많은 사람들이 소비자 
// 판매자에게 물건값을 지불할때 판매자에서 같이 지불하고
// 소비자 대신에 국세청에 납부
// 부가세 VAT
// 판매자가 자신이 얼마를 벌었는지 알아야하고
// 발생한 비용 발생 그 만큼 제외하면 이익
// 동업자에게 배당 5: 3: 2
// 나의 현실을 어떻게 자바를 통해서 해결할 수 있을까?

// 애플리케이션의 가장 본질적인 기능을 최소한의 기능
// 시간에 따라 해결한다.

// 시간의 순서에 따라 해결한다라는 가장 단순한 방법으로

public class AccountingApp{
    public static void main(String[] args){
        
        System.out.println("Value of supply : " + 10000.0);
        System.out.println("VAT : " + (10000.0*0.1));
        System.out.println("Total : " + (10000.0*0.1 + 10000.0)); // 이 기능으로 계산기와의 기능에서 승리
        System.out.println("Expense : " + (10000.0*.3));
        System.out.println("Income : " + (10000.0 - 10000.0*.3));
        System.out.println("Dividend : " + (10000.0 - 10000.0*.3)*0.5 );
        System.out.println("Dividend : " + (10000.0 - 10000.0*.3)*0.3 );
        System.out.println("Dividend : " + (10000.0 - 10000.0*.3)*0.2 );
        
    }
}


// 계산기보다 훨씬 더 편한 단계 -> 10000을 일괄적으로 바꿔주면 