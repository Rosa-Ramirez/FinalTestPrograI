
package finaltest;
import java.util.Scanner;
public class MainMenu {
    protected int option;
    
    public MainMenu(){
        option = 0;
    }
    Scanner sc = new Scanner (System.in);
    MenuArrays menu = new MenuArrays();
    
    public void menu(){
        System.out.println("-------------Menu Principal-------------");
        System.out.println("1 --> Listas");
        System.out.println("2 --> Arrays");
        option = sc.nextInt();
        
        switch(option){
            case 1: menu.menuList(); break;
            case 2: menu.menuArray(); break;
        }
    }
}
