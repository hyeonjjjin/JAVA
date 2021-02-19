//chapter 10-1
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


public class ClassVarAccess {
    public static void main(String[] args){
        AccessWay way = new AccessWay();//여기서 num==1
        way.num++;//여기서 ==2
        System.out.println("num: "+way.num);
        AccessWay.num++;//여기서 ==3
        System.out.println("num: "+AccessWay.num);

        InstCnt.instNum -=15;
        System.out.println("인스턴스 선언 없이 값 접근만 했다면?! 계산된다?? : "+InstCnt.instNum);//초기화 되고 계산된다~

    }
}
