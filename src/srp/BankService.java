package srp;

public class BankService {

    public BankService() {

    }

    public long deposit(long amount, String accountNo){
        // deposit amount
        return 0;
    }

    public long withdraw(long amount, String accountNo){
        // withdraw amount
        return 0;
    }

    /* moved to PrinterService class
    public void printPassBook(){
        // update transaction info in passbook
    }
    */

    /* moved to LoanService class
    public void getLoanInterestInfo(String loanType){
        if(loanType.equals("homeLoad")){
            // do some job
        }
        if(loanType.equals("personalLoad")){
            // do some job
        }
        if(loanType.equals("car")){
            // do some job
        }
    }
    */

    /* moved to NotificationService class
    public void sendOTP(String medium){
        if(medium.equals("email")){
            // write email related logic
            // use JavaMailSenderAPI
        }
    }
    */

}
