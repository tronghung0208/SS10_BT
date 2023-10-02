package ra.service;

import java.util.Scanner;

public class Student implements StudentService {
    int studentId;
    String studentName;

    String address;
    String phoneNumber;
    boolean sex;
    double mark;

    public Student(int studentId, String studentName, String address, String phoneNumber, boolean sex, double mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.mark = mark;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào studentID: ");
        this.studentId = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào student Name: ");
        this.studentName = sc.nextLine();
        System.out.println("Nhập vào address: ");
        this.address = sc.nextLine();
        System.out.println("Nhập vào phone number");
        this.phoneNumber = sc.nextLine();
        System.out.println("Nhập vào giới tính(true:Nam, false:Nữ): ");
        this.sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập vào điểm (0-10): ");
        this.mark = Double.parseDouble(sc.nextLine());

    }

    @Override
    public void display() {
        System.out.printf("Mã học sinh: %d Tên học sinh: %s Địa chỉ: %s\n", studentId, studentName, address);
        System.out.printf("Số điện thoại: %s Giới tính: %s Điểm: %.2f\n", phoneNumber, sex ? "Nam" : "Nữ", mark);

    }
}
