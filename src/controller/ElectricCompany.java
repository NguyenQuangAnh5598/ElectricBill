package controller;

import model.Bill;
import model.Customers;

import java.util.ArrayList;


public class ElectricCompany {
    ArrayList<Customers> customersList;
    ArrayList<Bill> billList;

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


    public String checkInfor(ArrayList<Bill> billList, String name, String phoneNum) {
        String check = null;
        try {
            for (int i = 0; i < billList.size(); i++) {
                if (name.equals(billList.get(i).getCustomName()) && phoneNum.equals(billList.get(i).getPhoneNumber())) {
                    check = billList.get(i).toString();
                }
            }
        } catch (RuntimeException e) {
            check = "Không có tên khách hàng trong danh sách";
        }
        return check;
    }


}
