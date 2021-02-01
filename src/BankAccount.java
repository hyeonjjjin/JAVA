//chapter 7-1. class 7-2. string 7-3 name_rule

//class name: Camel Case 모델
//첫 문자는 대문자로. 여러 단어가 사용된다면 새로운 단어의 시작은 대문자.
public class BankAccount {
    //메소드 및 변수: 변형된 Camel Case 모델
    //첫 번째 단어의 첫 문자만 소문자로 함.
    String accNumber; //계좌번호 _구분할 수 있는 고유의 값이 있는게 좋아
    String ssNumber; //주민번호
    int balance = 0;

    //모든 문자를 대문자로, 여러 단어가 사용된다면 단어 사이 언더바.
    final int COLOR_RAINBOW=7;

    //초기화를 위한 메소드 필요해. 이걸 생성자라고 함. 딱 한번만 써야돼.이건 자바가 자동으로 불러줘 내 편의를 위해
    public BankAccount(String acc, String ss, int bal){//생성자다!
        accNumber=acc;
        ssNumber=ss;
        balance=bal;
    }
    //생성자를 안만들면 자바 컴파일러가 껍데기만 만들어둠. empty~! 디폴트생성자.
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }
    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }
    public int checkMyBalance() {
        System.out.println("잔액 : "+balance);
        return balance;
    }
}
