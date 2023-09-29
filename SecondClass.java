import java.util.Scanner; 
public class SecondClass {
    public int x;
    public int y; 
    private  int score;
    public static void main(String[] args) {
        SecondClass obj = new SecondClass();
        obj.input_x();
        obj.input_y();
        obj.score_calcurate(obj.x,obj.y);
        System.out.print("value_score:"+obj.score);
        //System.out.print("value_y:"+obj.y);

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
    private void condition(){
        System.out.println("condition");
    }
    public void display(){
        System.out.println("display");
    }
}
