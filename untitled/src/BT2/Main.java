package BT2;

import BT2.entities.Student;
import BT2.menu.Menu;
import BT2.service.StudentService;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        Menu menu = new Menu();
        menu.menuDisplay(scanner, studentService);
    }
}
