//section-1	ข้อสอบปฏิบัติภาคทฤษฎี (กลางภาค) 10 คะแนน
        /***
         * 6.ให้นักศึกษา สร้าง method  
         * 6.1 สร้าง method ที่ชื่อ addMethod โดยมี access เป็น private  และเป็น method ที่ คืนค่า double เป็น 0.0
         * 6.2 สร้าง method ที่ชื่อ subMethod โดยมี access เป็น private  และเป็น method ที่ คืนค่า double เป็น 0.0
         * 6.3 สร้าง method ที่ชื่อ mulMethod โดยมี access เป็น public  และเป็น method ที่ คืนค่า double เป็น 0.0
         * 6.4 สร้าง method ที่ชื่อ divMethod โดยมี access เป็น public  และเป็น method ที่ คืนค่า double เป็น 0.0
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

    private double addMethod(){
        return 0.0;
    }
    private double subMethod(){
        return 0.0;
    }
    private double mulMethod(){
        return 0.0;
    }
    private double divMethod(){
        return 0.0;
    }
}
