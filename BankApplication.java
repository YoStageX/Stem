<<<<<<< HEAD
import java.util.*;

class Bank {
    private String Name;
    private int accNumber;
    private double Balance;
    private int employeeID;

    public Bank(String Name, int accNumber, double Balance, int employeeID) {
            this.Name = Name;
            this.accNumber = accNumber;
            this.Balance = Balance;
            this.employeeID = employeeID;
    }    

    void checkEmployeeDetails() {
            System.out.println("Details of Employee with Employee ID : " + employeeID);
            System.out.println("-------------------------------------------------------");
            System.out.println("Employee's Name :\t\t" + Name);
            System.out.println("Employee's Account Number :\t" + accNumber);
            System.out.println("Employee's Balance :\t\t" + Balance);
        }

    void withdrawMoney(double moneyDeduction) {
            double Balance1 = Balance - moneyDeduction;
            System.out.println("Amount to be deducted : " + moneyDeduction);
            System.out.println("Amount before deduction : " + Balance);
            System.out.println("Amount after deduction : " + Balance1);
            Balance = Balance1;
        }

    void depositMoney(double moneyIncrease) {
            double Balance1 = Balance + moneyIncrease;
            System.out.println("Amount to be deposit : " + moneyIncrease);
            System.out.println("Amount before depositing : " + Balance);
            System.out.println("Amount after depositing : " + Balance1);
            Balance = Balance1;
        }
}

class Employee extends Bank {

    public Employee(String Name, int accNumber, double Balance, int employeeID) {
        super(Name, accNumber, Balance, employeeID);
    }
}

public class BankApplication {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        Bank CEO = new Employee("Haris Riza",95486,990000000,107);
        Bank Manager1 = new Employee("Avinash Hari",45812,1000000000,234);
        Bank Employee1 = new Employee("Muhammad Wafa",45869,1000000,101);
        Bank Employee2 = new Employee("Areesha Asad",78452,100000,201);
        Bank Employee3 = new Employee("Natasha Zayan",36425,100000,301);

        System.out.print("Hi User!\nPlease Enter your Employee ID: ");
        int EEI = sc.nextInt();
        int OTPW;

        if(EEI == 107) {
            System.out.println("1. View All Employee Bank Details.");
            System.out.println("2. View Personal Bank Details.");
            System.out.println("3. Withdraw Money.");
            System.out.println("4. Deposit Money.");
            System.out.print("Enter Sl. No. of desired function: ");
            OTPW = sc.nextInt(); 

            switch(OTPW) {
                case 1:
                CEO.checkEmployeeDetails();
                System.out.println("");
                Manager1.checkEmployeeDetails();
                System.out.println("");
                Employee1.checkEmployeeDetails();
                System.out.println("");
                Employee2.checkEmployeeDetails();
                System.out.println("");
                Employee3.checkEmployeeDetails();
                sc.close();
                return;

                case 2:
                CEO.checkEmployeeDetails();
                sc.close();
                return;

                case 3:
                System.out.println("Enter amount to be deducted: ");
                double moneyDeduction = sc.nextDouble();
                CEO.withdrawMoney(moneyDeduction);
                sc.close();
                return;

                case 4:
                System.out.println("Enter amount to be deposited: ");
                double moneyIncrease = sc.nextDouble();
                CEO.depositMoney(moneyIncrease);
                sc.close();
                return;
            }
        }
        else if(EEI == 234) {
            System.out.println("1. View All Employee Bank Details.");
            System.out.println("2. View Personal Bank Details.");
            System.out.println("3. Withdraw Money.");
            System.out.println("4. Deposit Money.");
            System.out.print("Enter Sl. No. of desired function: ");
            OTPW = sc.nextInt(); 

            switch(OTPW) {
                case 1:
                Manager1.checkEmployeeDetails();
                System.out.println("");
                Employee1.checkEmployeeDetails();
                System.out.println("");
                Employee2.checkEmployeeDetails();
                System.out.println("");
                Employee3.checkEmployeeDetails();
                sc.close();
                return;

                case 2:
                Manager1.checkEmployeeDetails();
                sc.close();
                return;

                case 3:
                System.out.println("Enter amount to be deducted: ");
                double moneyDeduction = sc.nextDouble();
                Manager1.withdrawMoney(moneyDeduction);
                sc.close();
                return;

                case 4:
                System.out.println("Enter amount to be deposited: ");
                double moneyIncrease = sc.nextDouble();
                Manager1.depositMoney(moneyIncrease);
                sc.close();
                return;
            }
        }

        else if(EEI == 101) {
            System.out.println("1. View Personal Bank Details.");
            System.out.println("2. Withdraw Money.");
            System.out.println("3. Deposit Money.");
            System.out.print("Enter Sl. No. of desired function: ");
            OTPW = sc.nextInt(); 

            switch(OTPW) {
                case 1:
                Employee1.checkEmployeeDetails();
                sc.close();
                return;

                case 2:
                System.out.println("Enter amount to be deducted: ");
                double moneyDeduction = sc.nextDouble();
                Employee1.withdrawMoney(moneyDeduction);
                sc.close();
                return;

                case 3:
                System.out.println("Enter amount to be deposited: ");
                double moneyIncrease = sc.nextDouble();
                Employee1.depositMoney(moneyIncrease);
                sc.close();
                return;
            }
        }
        
        else if(EEI == 201) {
            System.out.println("1. View Personal Bank Details.");
            System.out.println("2. Withdraw Money.");
            System.out.println("3. Deposit Money.");
            System.out.print("Enter Sl. No. of desired function: ");
            OTPW = sc.nextInt(); 

            switch(OTPW) {
                case 1:
                Employee2.checkEmployeeDetails();
                sc.close();
                return;

                case 2:
                System.out.println("Enter amount to be deducted: ");
                double moneyDeduction = sc.nextDouble();
                Employee2.withdrawMoney(moneyDeduction);
                sc.close();
                return;

                case 3:
                System.out.println("Enter amount to be deposited: ");
                double moneyIncrease = sc.nextDouble();
                Employee2.depositMoney(moneyIncrease);
                sc.close();
                return;
            }
        }

        else if(EEI == 201) {
            System.out.println("1. View Personal Bank Details.");
            System.out.println("2. Withdraw Money.");
            System.out.println("3. Deposit Money.");
            System.out.print("Enter Sl. No. of desired function: ");
            OTPW = sc.nextInt(); 

            switch(OTPW) {
                case 1:
                Employee3.checkEmployeeDetails();
                sc.close();
                return;

                case 2:
                System.out.println("Enter amount to be deducted: ");
                double moneyDeduction = sc.nextDouble();
                Employee3.withdrawMoney(moneyDeduction);
                sc.close();
                return;

                case 3:
                System.out.println("Enter amount to be deposited: ");
                double moneyIncrease = sc.nextDouble();
                Employee3.depositMoney(moneyIncrease);
                sc.close();
                return;
            }
        }

        else{
            System.out.println("Invalid Input! Please Redo!");
        }
        sc.close();
    }
=======
import java.util.*;

class Bank {
    private String Name;
    private int accNumber;
    private double Balance;
    private int employeeID;

    public Bank(String Name, int accNumber, double Balance, int employeeID) {
            this.Name = Name;
            this.accNumber = accNumber;
            this.Balance = Balance;
            this.employeeID = employeeID;
    }    

    void checkEmployeeDetails() {
            System.out.println("Details of Employee with Employee ID : " + employeeID);
            System.out.println("-------------------------------------------------------");
            System.out.println("Employee's Name :\t\t" + Name);
            System.out.println("Employee's Account Number :\t" + accNumber);
            System.out.println("Employee's Balance :\t\t" + Balance);
        }

    void withdrawMoney(double moneyDeduction) {
            double Balance1 = Balance - moneyDeduction;
            System.out.println("Amount to be deducted : " + moneyDeduction);
            System.out.println("Amount before deduction : " + Balance);
            System.out.println("Amount after deduction : " + Balance1);
            Balance = Balance1;
        }

    void depositMoney(double moneyIncrease) {
            double Balance1 = Balance + moneyIncrease;
            System.out.println("Amount to be deposit : " + moneyIncrease);
            System.out.println("Amount before depositing : " + Balance);
            System.out.println("Amount after depositing : " + Balance1);
            Balance = Balance1;
        }
}

class Employee extends Bank {

    public Employee(String Name, int accNumber, double Balance, int employeeID) {
        super(Name, accNumber, Balance, employeeID);
    }
}

public class BankApplication {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        Bank CEO = new Employee("Haris Riza",95486,990000000,107);
        Bank Manager1 = new Employee("Avinash Hari",45812,1000000000,234);
        Bank Employee1 = new Employee("Muhammad Wafa",45869,1000000,101);
        Bank Employee2 = new Employee("Areesha Asad",78452,100000,201);
        Bank Employee3 = new Employee("Natasha Zayan",36425,100000,301);

        System.out.print("Hi User!\nPlease Enter your Employee ID: ");
        int EEI = sc.nextInt();
        int OTPW;

        if(EEI == 107) {
            System.out.println("1. View All Employee Bank Details.");
            System.out.println("2. View Personal Bank Details.");
            System.out.println("3. Withdraw Money.");
            System.out.println("4. Deposit Money.");
            System.out.print("Enter Sl. No. of desired function: ");
            OTPW = sc.nextInt(); 

            switch(OTPW) {
                case 1:
                CEO.checkEmployeeDetails();
                System.out.println("");
                Manager1.checkEmployeeDetails();
                System.out.println("");
                Employee1.checkEmployeeDetails();
                System.out.println("");
                Employee2.checkEmployeeDetails();
                System.out.println("");
                Employee3.checkEmployeeDetails();
                sc.close();
                return;

                case 2:
                CEO.checkEmployeeDetails();
                sc.close();
                return;

                case 3:
                System.out.println("Enter amount to be deducted: ");
                double moneyDeduction = sc.nextDouble();
                CEO.withdrawMoney(moneyDeduction);
                sc.close();
                return;

                case 4:
                System.out.println("Enter amount to be deposited: ");
                double moneyIncrease = sc.nextDouble();
                CEO.depositMoney(moneyIncrease);
                sc.close();
                return;
            }
        }
        else if(EEI == 234) {
            System.out.println("1. View All Employee Bank Details.");
            System.out.println("2. View Personal Bank Details.");
            System.out.println("3. Withdraw Money.");
            System.out.println("4. Deposit Money.");
            System.out.print("Enter Sl. No. of desired function: ");
            OTPW = sc.nextInt(); 

            switch(OTPW) {
                case 1:
                Manager1.checkEmployeeDetails();
                System.out.println("");
                Employee1.checkEmployeeDetails();
                System.out.println("");
                Employee2.checkEmployeeDetails();
                System.out.println("");
                Employee3.checkEmployeeDetails();
                sc.close();
                return;

                case 2:
                Manager1.checkEmployeeDetails();
                sc.close();
                return;

                case 3:
                System.out.println("Enter amount to be deducted: ");
                double moneyDeduction = sc.nextDouble();
                Manager1.withdrawMoney(moneyDeduction);
                sc.close();
                return;

                case 4:
                System.out.println("Enter amount to be deposited: ");
                double moneyIncrease = sc.nextDouble();
                Manager1.depositMoney(moneyIncrease);
                sc.close();
                return;
            }
        }

        else if(EEI == 101) {
            System.out.println("1. View Personal Bank Details.");
            System.out.println("2. Withdraw Money.");
            System.out.println("3. Deposit Money.");
            System.out.print("Enter Sl. No. of desired function: ");
            OTPW = sc.nextInt(); 

            switch(OTPW) {
                case 1:
                Employee1.checkEmployeeDetails();
                sc.close();
                return;

                case 2:
                System.out.println("Enter amount to be deducted: ");
                double moneyDeduction = sc.nextDouble();
                Employee1.withdrawMoney(moneyDeduction);
                sc.close();
                return;

                case 3:
                System.out.println("Enter amount to be deposited: ");
                double moneyIncrease = sc.nextDouble();
                Employee1.depositMoney(moneyIncrease);
                sc.close();
                return;
            }
        }
        
        else if(EEI == 201) {
            System.out.println("1. View Personal Bank Details.");
            System.out.println("2. Withdraw Money.");
            System.out.println("3. Deposit Money.");
            System.out.print("Enter Sl. No. of desired function: ");
            OTPW = sc.nextInt(); 

            switch(OTPW) {
                case 1:
                Employee2.checkEmployeeDetails();
                sc.close();
                return;

                case 2:
                System.out.println("Enter amount to be deducted: ");
                double moneyDeduction = sc.nextDouble();
                Employee2.withdrawMoney(moneyDeduction);
                sc.close();
                return;

                case 3:
                System.out.println("Enter amount to be deposited: ");
                double moneyIncrease = sc.nextDouble();
                Employee2.depositMoney(moneyIncrease);
                sc.close();
                return;
            }
        }

        else if(EEI == 201) {
            System.out.println("1. View Personal Bank Details.");
            System.out.println("2. Withdraw Money.");
            System.out.println("3. Deposit Money.");
            System.out.print("Enter Sl. No. of desired function: ");
            OTPW = sc.nextInt(); 

            switch(OTPW) {
                case 1:
                Employee3.checkEmployeeDetails();
                sc.close();
                return;

                case 2:
                System.out.println("Enter amount to be deducted: ");
                double moneyDeduction = sc.nextDouble();
                Employee3.withdrawMoney(moneyDeduction);
                sc.close();
                return;

                case 3:
                System.out.println("Enter amount to be deposited: ");
                double moneyIncrease = sc.nextDouble();
                Employee3.depositMoney(moneyIncrease);
                sc.close();
                return;
            }
        }

        else{
            System.out.println("Invalid Input! Please Redo!");
        }
        sc.close();
    }
>>>>>>> b94e205f4ba43510fc7bed4b6d8f2f484d610281
}