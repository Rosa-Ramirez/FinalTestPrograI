
package finaltest;

import java.util.Scanner;

public class DepartmentsArrays {
    private String departmentName;
    private int numberMunicipalities;
    private String header;
    private DepartmentsArrays[] departments;
    private int countDepartment;
    
    public DepartmentsArrays(String departmentName, int numberMunicipalities, String header){
        this.departmentName = departmentName;
        this.numberMunicipalities = numberMunicipalities;
        this.header = header;
        departments = new DepartmentsArrays[22];
        countDepartment = 0;
    }
    
    Scanner sc = new Scanner (System.in);
    
    public void registerDepartments(){
        System.out.println("-------------Registrar Departamento-------------");
        
        System.out.println("--> Ingrese el nombre: ");
        departmentName = sc.nextLine();
        
        System.out.println("--> Ingrese la cantidad de Municipios");
        numberMunicipalities = sc.nextInt();
        
        System.out.println("--> Ingrese la cabecera: ");
        header = sc.nextLine();
        
        departments[countDepartment] = new DepartmentsArrays(departmentName, numberMunicipalities, header);
        countDepartment++;
        System.out.println("-------------Departamento Registrado Correctamente-------------");
    }
}
