//chapter 10-1
class AccessWay{
    static int num =0;

    AccessWay(){incrCnt();}
    void incrCnt(){
        num++;
    }
}

public class ClassVarAccess {
    public static void main(String[] args){
        AccessWay way = new AccessWay();//여기서 num==1
        way.num++;//여기서 ==2
        System.out.println("num: "+way.num);
        AccessWay.num++;//여기서 ==3
        System.out.println("num: "+AccessWay.num);
    }
}
