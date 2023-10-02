package ra.run;

import ra.service.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagerment {

    static List<Student> students = new ArrayList<>();


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exist = true;
        do {
            System.out.println("********** StudentManagerment************ ");
            System.out.println("1. Thêm mới học sinh\n" +
                    "2. Sửa học sinh\n" +
                    "3.Xóa học sinh\n" +
                    "4.Tìm kiếm học sinh theo studentId\n" +
                    "5.Sắp xếp theo tên học sinh từ a-z\n" +
                    "6.In ra danh sách học sinh\n" +
                    "7.Sắp xếp điểm tăng dần\n" +
                    "8. Sắp xếp điểm giảm dần\n" +
                    "9.Thoát\n");
            System.out.println("Nhập lựa chọn của bạn(1-9)");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent(sc);
                    break;
                case 3:
                    deleteStudent(sc);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    showStudent();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ, mời bạn nhập lại");

            }

        } while (exist);

    }

    public static void addStudent() {
        Student newStudent = new Student();
        newStudent.input();
        students.add(newStudent);
    }

    public static void showStudent() {
        for (Student student : students
        ) {
            student.display();
        }
    }

    // Hàm tìm kiếm
    public static int searchStudent(int studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == studentId) {
                return i;
            }
        }
        return -1;
    }

    public static void updateStudent(Scanner sc) {
        System.out.println("Nhập vào studentId muốn update");
        int studentId = Integer.parseInt(sc.nextLine());
        int indexUpdate = searchStudent(studentId);
        if (indexUpdate >= 0) {
            Student studentUpdate = new Student();
            studentUpdate.input();
            students.set(indexUpdate, studentUpdate);
        } else {
            System.out.println("Student bạn muốn update không có");
        }

    }

    public static void deleteStudent(Scanner sc) {
        System.out.println("Nhập vào studentId muốn xóa");
        int studentId = Integer.parseInt(sc.nextLine());
        int indexDelete = searchStudent(studentId);
        if (indexDelete >= 0) {
            students.remove(indexDelete);
            System.out.println("student đã được xóa");
        } else {
            System.out.println("Student bạn muốn xóa không có");
        }

    }
}
