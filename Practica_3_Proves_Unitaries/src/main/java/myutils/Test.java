package myutils;

import static myutils.MyUtils.*;

public class Test {

    public static void main(String[] args) {
        System.out.println(inverteix("Hola"));//aloH
        System.out.println(inverteix(null));//null
        
        System.out.println(edat(2, 9, 2004));//18
        System.out.println(edat(2, 9, 50));//-1
        System.out.println(edat(2, 9, 2050));//-2
        
        System.out.println(factorial(4));//24
        System.out.println(factorial(0));//1
        System.out.println(factorial(-10));//-1
    }
    
}
