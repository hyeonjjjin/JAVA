class UseVariable {
    public static void main(String[] args) {
        System.out.println("chapter 2");
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


        //chapter 3
        System.out.println("\nchapter 3");
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
        System.out.println("\nchapter 4");
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


        //chapter5
        System.out.println("\nchapter 5");
        if(5<7)
            System.out.println("5<7 is true");
        if(10<4)
            System.out.println("10<4 is true?!");
        else System.out.println("10<4 is false");

        //조건 연산자
        int t1orf0;
        t1orf0 = (10>8) ? 1:0;
        System.out.println("10>8 ? 1:0, result:"+t1orf0);

        //switch, break
        int n =7;
        switch(n){
            case 1:
            case 2:
            case 3:
                System.out.println("case 1, 2, 3");
                break;
            default:
                System.out.println("default");
        }
        //for, while, do-while
        //break, continue 는 반복문에 대해 동작
        int check=1;
        while(true){
            if(((check%6)==0)&&((check%14)==0))
                break;
            check++;
        }
        System.out.println("6과 14의 최소공배수: "+check);
        System.out.println();


        //chapter 6. method
        hiEveryone(23);
        int mul_result = mul(6,9);
        System.out.println("4!="+factorial(4));
        System.out.println("6!="+factorial(6));
        System.out.println();


        //chapter 7-1. class
        BankAccount ref1 = new BankAccount("12-56-89","999090-9990990",0);
        BankAccount ref2 = ref1;
        BankAccount ref3 = new BankAccount("12-76-89","990990-9090990",0);
        ref1.deposit(3000);
        ref2.deposit(2000);
        ref3.deposit(4000);
        ref1.withdraw(400);
        ref3.withdraw(600);
        if(ref1 != null)
            ref1.checkMyBalance();
        ref2.checkMyBalance();
        ref3.checkMyBalance();
        ref1=null;

        //chapter 7-2. string
        String str1 = "Happy";
        String str2 = "Birthday";
        System.out.println(str1+" "+str2);
        printString(str1);
        BankAccount yoon = new BankAccount("12-34-89","990990-9090990",1000);
        //yoon.initAccount("12-34-89","990990-9090990",1000);//반드시 한번 호출되어야 하는 함수
        //생성 후 자동으로 생성자가 호출되며 값 초기화시켜줘

    }


    //chapter 6-1. method
    public static void hiEveryone(int age) {
        System.out.println("졸린아침!");
        System.out.println("나는 "+age+"살이야");
    }
    public static int mul(int a, int b){
        return a*b;
    }

    //chapter 6-3. 재귀
    public static int factorial(int n){
        if(n==1) return 1;
        else return n*factorial(n-1);
    }

    //chapter 7-2. string
    public static void printString(String str){
        System.out.print(str);
    }


}
