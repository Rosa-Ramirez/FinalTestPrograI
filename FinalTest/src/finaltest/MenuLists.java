
package finaltest;

import java.util.Scanner;

public class MenuLists {
    private int option;
    
    public MenuLists(){
        option = 1;
    }
    Scanner sc = new Scanner(System.in);
    DepartmentsLists list = new DepartmentsLists();
    
    public void menuList(){
        while (option !=0){
            System.out.println("--------Menu Lista--------");
            System.out.println("1 --> Registrar Departamento");
            System.out.println("2 --> Ver Departamentos");
            System.out.println("3 --> Buscar Departamento");
            System.out.println("4 --> Vaciar Lista");
            System.out.println("0 --> SALIR");
            option = sc.nextInt();

            switch(option){
                case 1: list.registerDepartmentsList(); break;
                case 2: list.showDepartmentsList(); break;
                case 3: list.searchDepartment(); break;
                case 4: list.deleteList();
                default: System.out.println("Opcion no valida"); break;
            }
        }
    }
}
