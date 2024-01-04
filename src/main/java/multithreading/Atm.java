//Question
    //Create an example of Atm and show the use of synchronized in java.
//Answer
package multithreading;

class MachineAtm {

    void chk(String s) {
        synchronized (this) {
            System.out.print(s + " Is Checking ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Balance");
        }
    }

    synchronized void withdraw(String s, int amount) {
        System.out.print(s + " Is withdrawing ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(amount);
    }
}

class Customer extends Thread {
    MachineAtm Atm;
    String name;

    int amt;

    void useAtm() {
        Atm.chk(name);
        Atm.withdraw(name, amt);
    }

    Customer(MachineAtm d, String name, int amt) {
        this.Atm = d;
        this.name = name;
        this.amt = amt;
    }

    @Override
    public void run() {
        useAtm();
    }
}

public class Atm {
    public static void main(String[] args) {
        MachineAtm ob = new MachineAtm();
        Customer cus1 = new Customer(ob, "Smith", 500);
        Customer cus2 = new Customer(ob, "john", 200);
        cus1.start();
        cus2.start();
    }
}
