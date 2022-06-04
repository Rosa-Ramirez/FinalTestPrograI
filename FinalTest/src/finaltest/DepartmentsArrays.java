
package finaltest;

import java.util.Scanner;

public class DepartmentsArrays {
    protected String departmentName;
    protected int numberMunicipalities;
    protected String header;
    protected DepartmentsArrays[] departments;
    protected int countDepartment;
    
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
        sc.nextLine();
        
        System.out.println("--> Ingrese la cabecera: ");
        header = sc.nextLine();
        
        departments[countDepartment] = new DepartmentsArrays(departmentName, numberMunicipalities, header);
        countDepartment++;
        System.out.println("-------------Departamento Registrado Correctamente-------------");
        sc.nextLine();
    }
    
    public void showDepartments(){
        DepartmentsArrays department;
        System.out.println("-------------Departamentos de Guatemala-------------");
        System.out.println("( Nombre de Departamento | Cantidad de Municipios | Cabecera )");
        
        for (int i = 0; i < countDepartment; i++){
            department = departments[i];
            System.out.println(department.departmentName + "\t" +
                    department.numberMunicipalities + "\t" + department.header);
        }
        sc.nextLine();
    }
}
