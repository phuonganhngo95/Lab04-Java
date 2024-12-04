// Bài thực hành 1+2+3+4+5
import java.util.Scanner;

public class Customer {
    int id, age;
    String name, address;
    double salary;

    public Customer() {}

    public Customer(int id, String name, String address, int age, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    void input(int id, String name, String address, int age, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhap địa chỉ: ");
        address = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = sc.nextInt();
        System.out.println("Nhập lương: ");
        salary = sc.nextDouble();
    }

    void viewData() {
        System.out.println("ID: " + id);
        System.out.println("TÊN: " + name);
        System.out.println("ĐỊA CHỈ: " + address);
        System.out.println("TUỔI: " + age);
        System.out.println("LƯƠNG: " + salary);
        System.out.println("LƯƠNG THÊM THƯỞNG: " + calSalary(15000));
    }

    double calSalary(double bonus) {
        return salary + bonus;
    }

    public static void main(String[] args) {
        Customer a = new Customer();
        a.input();
        a.viewData();
    }
}

class MainClass {
    void inputCustomerData(Customer nv) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        nv.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Tên: ");
        nv.name = sc.nextLine();
        System.out.println("Địa chỉ: ");
        nv.address = sc.nextLine();
        System.out.println("Tuổi: ");
        nv.age = sc.nextInt();
        System.out.println("Lương: ");
        nv.salary = sc.nextDouble();
    }

    public static void main(String[] args) {
        Customer cust_1 = new Customer();
        Customer cust_2 = new Customer();

        MainClass main = new MainClass();
        System.out.println("Nhập dữ liệu nhân viên 1:");
        main.inputCustomerData(cust_1);
        System.out.println("Nhập dữ liệu nhân viên 2: ");
        main.inputCustomerData(cust_2);

        cust_1.viewData();
        cust_2.viewData();

        System.out.printf("Tiền thưởng nhân viên 1: %.0f", cust_1.calSalary(15));
        System.out.printf("\nTiền thưởng nhân viên 2: %.0f", cust_2.calSalary(690000));
    }
}

class CustomerManager {
    Customer globalCus = new Customer();
    void inputCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Tên: ");
        String name = sc.nextLine();
        System.out.println("Tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Lương: ");
        double salary = sc.nextDouble();

        globalCus.input(id, name, address, age, salary);
    }

    public static void main(String[] args) {
        Customer nhanvien = new Customer();
        nhanvien.input();
        nhanvien.viewData();

        CustomerManager manager = new CustomerManager();
        manager.inputCustomer();

        Customer testCon = new Customer(3, "Shin Đông Hiếp", "Gầm cầu", 19, 3500000);
        testCon.viewData();
    }
}