class UseVariable {
    public static void main(String[] args){
        int num1;
        num1 = 10;
        int num2 = 20;
        int num3 = num1+ num2;
        System.out.println(num1+"+"+num2+"="+num3);

        //char ch1 = '헐';
        //char ch2 = '확';
        //System.out.println(ch1+" "+ch2);

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(num1<num2);
        System.out.println(num1>num2);

        System.out.println();
        //chapter 3
        final int MAX_SIZE = 100;//상수 이름은 대문자가 관례
        final int CONST_ASSIGNED;
        CONST_ASSIGNED = 200;
        System.out.println("final num1 :"+MAX_SIZE);
        System.out.println("final num2 :"+CONST_ASSIGNED);

        int num_oct = 0123;
        int num_hex = 0x123;
        System.out.println("oct 0123 = dec "+num_oct);
        System.out.println("hex 0123 = dec "+num_hex);

        System.out.println("show long literal "+3147483647L + 3147483648L);

        int num_underbar = 12_34;
        System.out.println("num can use under_bar anywhere" +num_underbar);


    }
}
