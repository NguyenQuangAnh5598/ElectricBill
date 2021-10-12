package View;

import controller.ElectricCompany;
import model.Bill;
import model.Customers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ElectricCompany electricCompany = new ElectricCompany();

    public static void main(String[] args) {


        ArrayList<Customers> customersList = new ArrayList<>();
        ArrayList<Bill> billList = new ArrayList<>();

        electricCompany.setCustomersList(customersList);
        electricCompany.setBillList(billList);

        electricCompany.addCustomer(getNewCustomer());
        electricCompany.addBill(createCustomerBill());

        printBill(billList);

    }

    public static Customers getNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Mời nhập tên : ");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ : ");
        String address = scan.nextLine();
        System.out.println("Nhập số điện thoại :");
        String phoneNumber = scanner.nextLine();

        return new Customers(name, address, phoneNumber);
    }

    public static void printBill(ArrayList<Bill> billList) {
        System.out.println("Mời nhập tên khách hàng muốn in : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Nhập số điện thoại : ");
        Scanner scan = new Scanner(System.in);
        String phoneNum = scan.nextLine();
        System.out.println(electricCompany.checkInfor(billList, name, phoneNum));
    }

    public static Bill createCustomerBill() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập tên khách : ");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ : ");
        String address = scan.nextLine();
        System.out.println("Nhập số điện thoại :");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập số điện mới : ");
        int newNumber = scan.nextInt();
        System.out.println("Nhập số điện cũ : ");
        int oldNumber = scan.nextInt();

        return new Bill(name, address, phoneNumber, newNumber, oldNumber);
    }

    public static void checkPayMoney(ArrayList<Bill> billList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập địa chỉ khách hàng vào đây : ");
        String address = scanner.nextLine();
        System.out.println("Khách hàng phải trả " + electricCompany.checkPayMoneyByAddress(address,billList) + " VNĐ");
    }
}
