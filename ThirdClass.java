//section-1	ข้อสอบปฏิบัติภาคทฤษฎี (กลางภาค) 10 คะแนน
        /***
         * 5.ให้นักศึกษา เขียนการทำงานภายใน select_mode 
         * ให้รับค่า mode , x ,y
         * แบบ SWICH CASE
         * กำหนดให้ ถ้า mode เป็น 
         * A ให้แสดงข้อความ ว่า ADD และแสดงค่า x y
         * S ให้แสดงข้อความ ว่า SUB และแสดงค่า x y
         * M ให้แสดงข้อความ ว่า MUL และแสดงค่า x y
         * D ให้แสดงข้อความ ว่า DIV และแสดงค่า x y   
        **/
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
        obj.select_mode(obj.mode,obj.x,obj.y);
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
    public void select_mode(char m,int inp_x,int inp_y){
        //master code
        switch (mode) {
            case 'A':
                System.out.println("ADD "+inp_x+" "+inp_y);
                break;
            case 'S':
                System.out.println("SUB "+inp_x+" "+inp_y);
                break;
            case 'M':
                System.out.println("MUL "+inp_x+" "+inp_y);
                break;
            case 'D':
               System.out.println("DIV "+inp_x+" "+inp_y);
                break;
            default :
                System.out.println("Invalid mode selected");  // ถ้าใส่ข้อความไม่ถูก
        }
    }

}
