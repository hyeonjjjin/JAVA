//chapter 7-1. class 7-2. string
public class BankAccount {
    String accNumber; //계좌번호 _구분할 수 있는 고유의 값이 있는게 좋아
    String ssNumber; //주민번호
    int balance = 0;

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
