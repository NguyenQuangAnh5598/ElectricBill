package model;

public class Bill {
    private String customName;
    private String address;
    private String phoneNumber;
    private int newNumber;
    private int oldNumber;

    public Bill() {
    }

    public Bill(String customName, String address, String phoneNumber, int newNumber, int oldNumber) {
        this.customName = customName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.newNumber = newNumber;
        this.oldNumber = oldNumber;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }

    public int getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(int oldNumber) {
        this.oldNumber = oldNumber;
    }

    @Override
    public String toString() {
        return "Bill { " +
                " customName='" + customName + '\'' +
                " , address='" + address + '\'' +
                " , phoneNumber='" + phoneNumber + '\'' +
                " , newNumber=" + newNumber +
                " , oldNumber=" + oldNumber +
                " , payMoney = " + getPayMoney() +
                " }";
    }

    public double getPayMoney() {
        int payMoney = (newNumber - oldNumber) * 750;
        return payMoney;
    }
}
