
package finaltest;
import java.util.Scanner;
public class MainMenu {
    private int option;
    
    public MainMenu(){
        option = 0;
    }
    Scanner sc = new Scanner (System.in);
    DepartmentsArrays Arrays;
    DepartmentsLists Lists;
    
    public void menu(){
        System.out.println("-------------Menu Principal-------------");
        System.out.println("1 --> Listas");
        System.out.println("2 --> Arrays");
        option = sc.nextInt();
        
        switch(option){
            
        }
    }
}
