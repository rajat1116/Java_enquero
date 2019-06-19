package Assignment;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigD {
    public static void main(String[] args){
        BigDecimal a,b,c;
        a=new BigDecimal("30.90");
        b=new BigDecimal("70.509");
        MathContext p = new MathContext(4);
        c=a.add(b,p);
        System.out.println(c);
    }
}
