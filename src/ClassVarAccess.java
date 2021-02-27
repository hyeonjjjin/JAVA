import java.time.LocalDate;

//chapter 10-1, 10-2
//PI 처럼 바뀔 일 없고 어디에서나 일정한 값을 갖는 변수의 경우 static으로 사용하면 좋다. 대신 final 형태로!!
class AccessWay{
    static int num =0;

    AccessWay(){incrCnt();}
    void incrCnt(){
        num++;
    }
}
class InstCnt{
    static int instNum = 100;

    InstCnt(){
        instNum++;
        System.out.println("인스턴스 생성: "+instNum);
    }
}

class NumberPrinter {
    private int myNum=0;
    static void showInt(int n){System.out.println(n);}
    static void showDouble(double n){System.out.println(n);}

    void setMyNumber(int n){myNum = n;}
    void showMyNumber(){showInt(myNum);}
}

class SimpleCalculator{
    static final double PI =3.1415;
    static double add(double n1,double n2) {return n1+n2;}
    static double min(double n1,double n2) {return n1-n2;}
    static double calCircleArea(double r){return PI*r*r;}
}
class Person{
    private int regiNum;
    private int passNum;

    public Person(int rnum, int pnum) {
        regiNum = rnum;
        passNum = pnum;
    }
    public Person(int rnum){
        this(rnum,0);
    }
    //이러면 초기화 함수를 두 개 만들 필요가 없어. pnum이 없는 경우엔 0을 주면서 초기화 함수로 넘어가니까

}
public class ClassVarAccess {
    //10-4
    static String date;//씨에서 전역변수 쓰듯이 비슷한거ㅣ임
    static {
        LocalDate nDate = LocalDate.now();
        date = nDate.toString();
    }

    //11-1
    void simpleMethod(int n){n=1;}
    void simpleMethod(int n1, double n2){n1=(int)n2;}//엥이게 오류가 안나는구만..
    //이름이랑 매개변수가 메소드 호출 시 확인되는 정보. 이름이 같아도 매개변수의 자료형이나 수가 다르면 다른걸로 인식함
    //반환형은 조건이 아니야 그거는 달라도 구분 안돼 부를 땐 모르잖아


    public static void main(String[] args){//public은 약속임. 외부에서 메인을 불러오기도 하고!
        //10-1
        AccessWay way = new AccessWay();//여기서 num==1
        way.num++;//여기서 ==2
        System.out.println("num: "+way.num);
        AccessWay.num++;//여기서 ==3
        System.out.println("num: "+AccessWay.num);

        InstCnt.instNum -=15;
        System.out.println("인스턴스 선언 없이 값 접근만 했다면?! 계산된다?? : "+InstCnt.instNum);//초기화 되고 계산된다~

        //10-2
        NumberPrinter.showInt(20);//인스턴스 생성해서 접근하는 것 보다 이게 더 알아보기 좋음
        NumberPrinter.showDouble(SimpleCalculator.calCircleArea(2.5));

        //10-4
        System.out.println("오늘 날짜: "+date);
    }
}
