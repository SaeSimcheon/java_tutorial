// 활용 

class Accounting{
    public static double valueOfSupply;
    public static double varRate = 0.1;
    public static double getVAT(){
        return valueOfSupply * varRate ; 
    }
    public static double getTotal(){
        return valueOfSupply + getVAT();
    }
}

public class app{
    public static void main(String[] args){
        Accounting.valueOfSupply = 10000.0;
        System.out.println("Value of supply:" + Accounting.valueOfSupply);
        System.out.println("VAT:" + Accounting.getVAT());
        System.out.println("Total:" + Accounting.getTotal());
    }
}