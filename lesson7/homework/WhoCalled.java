package lesson7.homework;

public class WhoCalled {
    public static void main(String[] args) {

        Phone ph1 = new Phone(9872174565l, "iPhone", 174);
        Phone ph2 = new Phone(9898174587l, "Samsung", 154);
        Phone ph3 = new Phone(9816174784l, "Huawei", 170);

        ph1.receiveCall("Violet");

    }
}
