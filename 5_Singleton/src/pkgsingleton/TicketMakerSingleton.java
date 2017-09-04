package pkgsingleton;

public class TicketMakerSingleton {
    private int ticket = 1000;

    private static TicketMakerSingleton ticketMakerSingleton = new TicketMakerSingleton();
    private TicketMakerSingleton(){
        System.out.println("インスタンスを生成しました");
    }

    // synchronizedがついていないと、複数のスレッドに対して同じ値を返す危険性が有る
    public synchronized int getNextTicketNumber(){
        return ticket++;
    }
}
