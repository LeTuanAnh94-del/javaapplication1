package student;
import java.util.Scanner;   
public class student {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập họ của bạn: ");
        String firstname = input.nextLine();
        System.out.println("Nhập tên của bạn: ");
        String lastname = input.nextLine();
        System.out.println("Nhập tuổi của bạn: ");
        int age = input.nextInt();
        students sv = new students(firstname,lastname,age);
        sv.sayHello();
        System.out.println("Nhập điểm C: ");
        float c = input.nextFloat();
        System.out.print("Nhập điểm php: ");
        float php = input.nextFloat();
        Result rs = new Result(c,php);
        rs.Score();
    }

}
class students{
    String lastname;
    String firstname;
    int age;
    students(String lastname , String firstname , int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    public void sayHello(){
        System.out.println("Chào em: "+ this.lastname +" "+this.firstname);
    }
}
    class Result{
        float c,php;
        Result (Float c , Float php){
            this.c =  c;
            this.php = php;
        }
        public void Score(){
        float avg = (this.c + this.php);
        System.out.println("Đtb :" +avg/2);
        System.out.println("Xếp loại: ");
         if (avg>=8){
        System.out.println("Tốt");
    }
    else if (avg>=6){
        System.out.println("Khá");
    }
    else if (avg >=5){
         System.out.println("Trung bình");
    }
    else{
         System.out.println("Tốt?");
    }
    }
    }