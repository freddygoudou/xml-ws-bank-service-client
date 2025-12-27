import proxy.BankAccountService;
import proxy.BankWS;

public class ClientWS {
    public static void main(String[] args) {
        BankAccountService proxyWs = new BankWS().getBankAccountServicePort();
        System.out.println("Test Conversion WS -----------");
        System.out.println(proxyWs.conversionEuroToDh(900));
        System.out.println("Test Get account WS -----------");
        System.out.println(proxyWs.getAccount(320 ));
        System.out.println("Test List of accounts WS -----------");
        proxyWs.listAccounts().forEach(account -> {
            System.out.println("Account [ code : "+account.getCode()+", amount : "+account.getBalance()+", Date de creation : "+account.getCreatedAt()+" ]");
        });

    }
}
