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

        electricCompany.addCustomer(electricCompany.getNewCustomer());
        electricCompany.addBill(electricCompany.createCustomerBill());
        electricCompany.printBill(billList);

    }

}
