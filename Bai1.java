package javaapplication1;
import java.util.Scanner;
public class exam {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập lớp: ");
        String classs = scanner.nextLine();
        System.out.print("Nhập điểm môn C: ");
        Float C = scanner.nextFloat();
        System.out.print("Nhập điểm môn PHP: ");
        Float PHP = scanner.nextFloat();
        Float total= (C+PHP)/2;
        System.out.println("Điểm trung bình: " + total);
        if(total >= 8){
            System.out.println("Đạt xếp loại: Giỏi");
        }else if(total >= 6){
            System.out.println("Đạt xếp loại: Khá");
        }else if(total >= 5 ){
            System.out.println("Đạt xếp loại: Trung bình");
        }else{
            System.out.println("Đạt xếp loại: Không đạt");
        }
  }
}