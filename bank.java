import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        do {

            double balance = 0;
            double amount;

            System.out.println("Type Number");
            System.out.println("1. Menabung");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Exit");
            num = scan.nextInt();

            if (num == 1) {
                System.out.println("Klik enter untuk Menabung : ");
                amount = scan.nextDouble();

                // Add the amount to the balance
                balance += amount;
                System.out.println("Jumlah Tabungan");
                System.out.println(balance);


            } else if (num == 2) {

                System.out.println("Klik enter untuk Tarik Tunai: ");
                amount = scan.nextDouble();

                // Remove the amount from the balance
                balance -= amount;
                System.out.println("Jumlah tarik tunai");
                System.out.println(balance);

            } else if (num == 3) {


                System.out.println("Total Uang :");
                System.out.println(balance);

            }



        } while (num != 4);

        System.out.println("Terima Kasih");

    }
}