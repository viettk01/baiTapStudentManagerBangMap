package BT2.menu;

import BT2.service.StudentService;
import BT2.utils.Ultis;

import java.util.Map;
import java.util.Scanner;

public class Menu {
    int select;
    Ultis ultis = new Ultis();
    public void menuDisplay(Scanner scanner, StudentService studentService){
        while (true) {
            System.out.println("========MENU========");
            System.out.println("1. Thêm học sinh");
            System.out.println("2. Xóa học sinh");
            System.out.println("3. In ra danh sách học sinh");
            System.out.println("4. Tìm thông tin sinh viên bằng id");
            System.out.println("5. Tính điểm trung bình của tất cả sinh viên trong danh sách");
            System.out.println("0. Xóa chương trình");
            select = ultis.inputInt(scanner);
            menuSelect(scanner, studentService);
        }

    }

    public void menuSelect(Scanner scanner, StudentService studentService){
        switch (select){
            case 1:
                studentService.addStudent(scanner);
                break;
            case 2:
               studentService.removeStudent(scanner);
                break;
            case 3:
               studentService.printInfo();
                break;
            case 4:
                studentService.searchStudent(scanner);
                break;
            case 5:
                studentService.calAllScoreStudent();
                break;
            default:
                break;
        }
    }
}
