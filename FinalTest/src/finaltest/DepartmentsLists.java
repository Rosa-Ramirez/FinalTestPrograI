
package finaltest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentsLists {
    protected List<DepartmentsArrays> departments;
    private String departmentName;
    private int numberMunicipalities;
    private String header;
    
    public DepartmentsLists(){
        departments = new ArrayList<>();
        departmentName = "";
        numberMunicipalities = 0;
        header = "";
    }
    
    Scanner sc = new Scanner(System.in);
    
    public void registerDepartmentsList(){
        System.out.println("-------------Registrar Departamento-------------");
        
        System.out.println("--> Ingrese el nombre: ");
        departmentName = sc.nextLine();
        
        System.out.println("--> Ingrese la cantidad de Municipios");
        numberMunicipalities = sc.nextInt();
        
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
}
