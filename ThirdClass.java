//section-1	ข้อสอบปฏิบัติภาคทฤษฎี (กลางภาค) 10 คะแนน 
import java.util.Scanner; 
public class ThirdClass {
    public int x;
    public int y; 
    public char mode;
    public static void main(String[] args) {
        System.out.println("Hi ThirdClass");
        ThirdClass obj = new ThirdClass();
        obj.input_x();
        obj.input_y();
        obj.input_mode();
        obj.select_mode(obj.mode);
        /***
         * 3.เอา code จาก gitHub ไฟล์ ThirdClass.java มารัน
         * 4.ให้นักศึกษา เขียนการทำงานภายใน select_mode แบบ SWICH CASE
         * กำหนดให้ ถ้า mode เป็น 
         * A ให้แสดงข้อความ ว่า ADD
         * S ให้แสดงข้อความ ว่า SUB
         * M ให้แสดงข้อความ ว่า MUL
         * D ให้แสดงข้อความ ว่า DIV   
        **/
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
        mode = scanner.next().charAt(0);
    }
    public void select_mode(char m){
        //master code
        switch (mode) {
            case 'A':
                System.out.println("ADD ");
                break;
            case 'S':
                System.out.println("SUB ");
                break;
            case 'M':
                System.out.println("MUL ");
                break;
            case 'D':
               System.out.println("DIV ");
                break;
            default :
                System.out.println("Invalid mode selected");  // ถ้าใส่ข้อความไม่ถูก
        }
    }

}
