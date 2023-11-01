package BT2.service;

import BT2.entities.Student;
import BT2.utils.Ultis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class StudentService {

        Map<Integer, Student> map = new HashMap<>();
        Ultis ultis = new Ultis();
    public void addStudent(Scanner scanner){
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập điểm");
        double score = ultis.inputDouble(scanner);
        Student student = new Student(name, score);
        map.put(student.getId(), student);
        System.out.println("Thêm học sinh thành công");
    }

    public void removeStudent(Scanner scanner) {
        System.out.println("nhập id học sinh cần xóa");
        int id = ultis.inputInt(scanner);
        Iterator<Map.Entry<Integer, Student>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Student> entry = iterator.next();
            if (entry.getKey().equals(id)) {
                iterator.remove();
                System.out.println("Đã xóa học sinh: " + id);
            } else {
                System.out.println("key không tồn tại hoặc đã bị xóa");
            }
        }
    }

    public void printInfo(){
        for (Map.Entry<Integer, Student> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public void searchStudent(Scanner scanner){
        System.out.println("nhập id học sinh cần tìm");
        int id = ultis.inputInt(scanner);
        System.out.println(map.get(id));
    }

    public void calAllScoreStudent(){
        double allScore = 0;
        Iterator<Map.Entry<Integer, Student>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Student> entry = iterator.next();
            allScore += entry.getValue().getScore();
        }
        double gpaAllStudent = allScore / map.size();
        System.out.println("Điểm trung bình của tất cả học sinh: " + gpaAllStudent);
    }


}
