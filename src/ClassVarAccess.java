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

public class ClassVarAccess {
    public static void main(String[] args){
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

    }
}
