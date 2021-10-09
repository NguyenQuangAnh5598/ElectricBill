package controller;

import model.Bill;
import model.Customers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ElectricCompany {
    ArrayList<Customers> customersList = new ArrayList<>();
    ArrayList<Bill> billList = new ArrayList<>();

    public ElectricCompany() {
    }

    public ElectricCompany(ArrayList<Customers> customersList, ArrayList<Bill> billList) {
        this.customersList = customersList;
        this.billList = billList;
    }

    public void addCustomer(Customers customer) {
        customersList.add(customer);
    }

    public void addBill(Bill bill) {
        billList.add(bill);
    }

    public ArrayList<Customers> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(ArrayList<Customers> customersList) {
        this.customersList = customersList;
    }

    public ArrayList<Bill> getBillList() {
        return billList;
    }

    public void setBillList(ArrayList<Bill> billList) {
        this.billList = billList;
    }

    public double checkPayMoneyByAddress(String address, ArrayList<Bill> billList) {
        double pay = 0;
        for (int i = 0; i < billList.size(); i++) {
            if (address.equals(billList.get(i).getAddress())) {
                pay = billList.get(i).getPayMoney();
            }
        }
        return pay;
    }


    public void printCustomersList(ArrayList<Customers> customersList) {
        for (int i = 0; i < customersList.size(); i++) {
            System.out.println(customersList.get(i).toString());
        }
    }


    public void printBill(ArrayList<Bill> billList) {
        System.out.println("Mời nhập tên khách hàng muốn in : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Nhập số điện thoại : ");
        Scanner scan = new Scanner(System.in);
        String phoneNum = scan.nextLine();
        try {
            for (int i = 0; i < billList.size(); i++) {
                if (name.equals(billList.get(i).getCustomName()) && phoneNum.equals(billList.get(i).getPhoneNumber())) {
                    System.out.println(billList.get(i).toString());
                }
            }
        } catch (RuntimeException e) {
            System.out.println("Không có tên khách hàng trong danh sách");
        }
    }

    public Customers getNewCustomer() {
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

    public Bill createCustomerBill() {
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


}
