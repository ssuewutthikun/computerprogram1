//section-1	ข้อสอบปฏิบัติภาคทฤษฎี (กลางภาค) 10 คะแนน
import java.util.Scanner; 
public class ThirdClass {
    public int x;
    public int y; 
    public char mode;
    public static void main(String[] args) {
        System.out.println("Hi ThirdClass");
        //1.ให้นักศึกษาเรียกใช้งาน method input_x และ input_y และ
        //input_mode จากนั้นให้แสดงผลลัพธ์ที่รับมาทางหน้าจอ (10)
    
    }
    public void input_x(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input_x:");
        x=scanner.nextInt();
    }
    public void input_y(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input_y:");
        y=scanner.nextInt();
    }
    public void input_mode(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input_mode:");
        mode=scanner.nextInt();
    }
    //สร้าง method ที่รับค่า X int  ชื่อ input_x  
    //สร้าง method ที่รับค่า Y int  ชื่อ input_y
    //สร้าง method ที่รับค่า mode char ชื่อ input_mode
}

