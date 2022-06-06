
package finaltest;
import java.util.Scanner;

public class DepartmentsArrays {
    protected String departmentName;
    protected int numberMunicipalities;
    protected String header;
    protected DepartmentsArrays[] departments;
    protected int countDepartment;
    protected String search;
    protected int index;
    
    public DepartmentsArrays(String departmentName, int numberMunicipalities, String header){
        this.departmentName = departmentName;
        this.numberMunicipalities = numberMunicipalities;
        this.header = header;
        departments = new DepartmentsArrays[22];
        countDepartment = 0;
        search = "";
        index = 0;
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
    
    public void searchPair(){
        System.out.println("-------------Departamentos de Guatemala-------------");
        System.out.println("( Posición | Nombre de Departamento | Cantidad de Municipios | Cabecera )");
        int countFound = 0;
        
        for(int i = 0; i < countDepartment; i++){
            if((i%2 == 0) && (departments[i].numberMunicipalities > 4)){
                countFound++;
                System.out.println(i + "\t" + departments[i].departmentName + "\t" +
                    departments[i].numberMunicipalities + "\t" + departments[i].header);
            }
            sc.nextLine();
        }
        if (countFound == 0) {System.out.println("**Sin resultados**");}
        sc.nextLine();
    }
    
    public void searchDepartmentArray(){
        System.out.println("-------------Buscador-------------");
        System.out.println("Ingrese el nombre del departamento para buscar");
        search = sc.nextLine();
    
        for (int i=0; i<countDepartment; i++) {
            if(departments[i].departmentName.equals(search)) {
                System.out.println("El departamento " + search + " SÍ está en la lista. "
                    + "Se encuentra en la posicion " + i);
            }
        }
        sc.nextLine();
    }
    
    public void searchLetter(){
        System.out.println("-------------Buscador-------------");
        System.out.println("Ingrese la letra para buscar");
        char searchChar = sc.nextLine().toLowerCase().charAt(0);
        int countFound=0;
        if (countDepartment < 1) { System.out.println("No existen registros."); sc.nextLine(); return;}
                
        System.out.println("( Nombre de Departamento | Cantidad de Municipios | Cabecera )");
        for (int i=0; i<countDepartment; i++) {
            
            if(departments[i].departmentName.toLowerCase().charAt(0) == searchChar) {
                countFound++;
                System.out.println(departments[i].departmentName + "\t" +
                    departments[i].numberMunicipalities + "\t" + departments[i].header);
            }
            sc.nextLine();
        }
        
        if (countFound == 0) {System.out.println("**No se encontraron resultados**");}
        sc.nextLine();    
    }  
}
