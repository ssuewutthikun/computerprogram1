import java.util.Scanner; 
public class SecondClass {
    public int x;
    public int y; 
    private  int score;
    public static void main(String[] args) {
        String rsp;
        SecondClass obj = new SecondClass();
        obj.input_x();
        obj.input_y();
        obj.score_calcurate(obj.x,obj.y);
        rsp =obj.condition(obj.score);
        obj.display(rsp);
    }
    public void input_x(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input_x:");
        x=scanner.nextInt();
    }
    public void input_y(){
        int y = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("input_y:");
        this.y=scanner.nextInt(); //this.y = การเรียกใช้ แอตทิบิ้ว y
        this.y = this.y+y; // y เฉยๆ ตัวแปร y ที่มีค่าเป็น 2
    }
    private void score_calcurate(int c,int d){
        score =c + d;
    }
    private String condition(int cd){
        String result;
        if(cd >= 10){
            result = "Result over more than 10";
        }else{
            result = "Result less than 10";
        }
        return result;
    }
    public void display(String msg){
        System.out.println(msg);
    }
}
