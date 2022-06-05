
package finaltest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentsLists {
    //ArrayList
    protected List<DepartmentsArrays> departments;
    protected List<String> history;
    private String departmentName;
    private int numberMunicipalities;
    private String header;
    //protected int position;
    protected String search;
    public DepartmentsLists(){
        departments = new ArrayList<>();
        history = new ArrayList<>();
        departmentName = "";
        numberMunicipalities = 0;
        header = "";
        search = "";
       // position = departments.indexOf(search);
    }
    
    Scanner sc = new Scanner(System.in);
    
    public void registerDepartmentsList(){
        System.out.println("-------------Registrar Departamento-------------");
        
        System.out.println("--> Ingrese el nombre: ");
        departmentName = sc.nextLine();
        history.add(departmentName);
        sc.nextLine();
        
        System.out.println("--> Ingrese la cantidad de Municipios");
        numberMunicipalities = sc.nextInt();
        sc.nextLine();
        
        System.out.println("--> Ingrese la cabecera: ");
        header = sc.nextLine();
        
        departments.add(new DepartmentsArrays(departmentName, numberMunicipalities, header));
        
        System.out.println("-------------Departamento Registrado Correctamente-------------");
        sc.nextLine();
    }
    
    public void showDepartmentsList(){
        DepartmentsArrays department;
        System.out.println("-------------Departamentos de Guatemala-------------");
        
        System.out.println("( Nombre de Departamento | Cantidad de Municipios | Cabecera )");
        
        for (int i = 0; i < departments.size(); i++){
            department = departments.get(i);
            System.out.println(department.departmentName + "\t" +
                    department.numberMunicipalities + "\t" + department.header);
        }
        sc.nextLine();
    }
    
    public void searchDepartment(){
        System.out.println("-------------Buscador-------------");
        System.out.println("Ingrese el nombre del departamento para buscar: ");
        search = sc.nextLine();
        
        if (history.contains(search)){
            System.out.println("El departamento" + search + " Sí está en la lista. "
                    + "Se encuentra en la posición " + history.indexOf(search));
        }
        else{
            System.out.println("El Departamento" + search + " NO está en la lista.");
        }
       
    }
    
    public void deleteList(){
        departments.clear();
    }
}
