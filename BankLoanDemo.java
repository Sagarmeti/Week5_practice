import java.util.Scanner;
class BankLoan{
  Scanner s=new Scanner(System.in);
  double loanAm;
  double interestRate;
  int timePeriod;

  
  BankLoan(double loanAm,double interestRate){
    this.loanAm=loanAm;
    this.interestRate=interestRate;
  }

  void paymentPeriod(){
    System.out.println("Enter amount how much you are going to pay Monthly");
    int emi=s.nextInt();
    int count=0;
    double interest=loanAm*interestRate/100;
    loanAmount=loanAm+interest;
    while(loanAm>0){
      loanAm=loanAm-emi;
      count=count+1;
    }
    timePeriod=count;
    System.out.println("The time period required for your loan amount is "+timePeriod+" Months.");
  }
}
    class BankLoanDemo{
        public static void main(String args[]){
          Scanner s=new Scanner(System.in);
          System.out.println("enter the Loan Amount");
          double loanAm=s.nextInt();
          System.out.println("enter the Interest Rate");
          double interestRate=s.nextDouble();
          BankLoan obj=new BankLoan(loanAm,interestRate);
          obj.paymentPeriod();
        }
    }