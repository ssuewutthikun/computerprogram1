import java.util.Scanner; 
public class SecondClass {
    public int x;
    public int y; 
    private  int score;
    public static void main(String[] args) {
        SecondClass obj = new SecondClass();
        obj.input_x();
        obj.input_y();
        System.out.print("value_x:"+obj.x);
        System.out.print("value_y:"+obj.y);
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
    private void score_calcurate(){
        System.out.println("score_calcurate");
    }
    private void condition(){
        System.out.println("condition");
    }
    public void display(){
        System.out.println("display");
    }
}
