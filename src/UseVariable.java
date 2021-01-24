class UseVariable {
    public static void main(String[] args) {
        //변수 선언
        int num1;
        num1 = 10;
        int num2 = 20;
        int num3 = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + num3);

        //char ch1 = '헐';
        //char ch2 = '확';
        //System.out.println(ch1+" "+ch2);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(num1 < num2);
        System.out.println(num1 > num2);
        System.out.println();


        //chapter 3
        final int MAX_SIZE = 100;//상수 이름은 대문자가 관례
        final int CONST_ASSIGNED;
        CONST_ASSIGNED = 200;
        System.out.println("final num1 :" + MAX_SIZE);
        System.out.println("final num2 :" + CONST_ASSIGNED);

        int num_oct = 0123;
        int num_hex = 0x123;
        System.out.println("oct 0123 = dec " + num_oct);
        System.out.println("hex 0123 = dec " + num_hex);

        System.out.println("show long literal " + 3147483647L + 3147483648L);
        System.out.println("show float literal" + 3.0004999f + 2.0004999f);
        System.out.println("show double literal" + 3.0004999D + 2.0004999D);
        //3.4e3 = 3400 / 3.4e-3 = 0.0034
        int num_under_bar = 12_34;
        System.out.println("num can use under_bar anywhere " + num_under_bar);

        //escape sequence
        System.out.println("ABB" + '\r' + 'C');

        //형변환-자동 (자료형이 큰 쪽에, 자료형 크기에 관계없이 정수보다 실수에 맞추어 변환.)
        int num_int = 50;
        long num_long = 3147483647L;
        System.out.println(num_int + num_long);//num_int가 long형으로 자동 형변환
        //형변환-명시적
        double pi = 3.1415;
        int wholeNumber=(int)pi;
        System.out.println(wholeNumber);


        //chapter 4
        num1=7;num2=3;//int
        System.out.println("int_num num1/num2 = "+(num1/num2));
        System.out.println("real_num num1/num2 = "+(7.0/3.0));

        //복합대입연산자
        short num =10;
        num=(short)(num+77L);//권장 형태
        num+=77L;//권장하지 않음. JAVA가 알아서 형변환 해줘서 컴파일오류 안남

        //bit shift 연산자 >>: 음(1),양수(0) 구분. >>>: 부호관계없이 빈공간은 0으로
        System.out.println("-5(011) >> 1 :"+(-5>>1));
        System.out.println("-5(011) >>> 1 :"+ (-5>>>1));//64bit 기준임


    }
}
