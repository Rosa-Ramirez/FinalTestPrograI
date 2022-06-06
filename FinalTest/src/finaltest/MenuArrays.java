
package finaltest;

public class MenuArrays extends MenuLists{
    String a, c;
    int b, option2;
    
    DepartmentsArrays array = new DepartmentsArrays(a, b, c);
    
    public void menuArray(){
        while (option != 0){
            System.out.println("--------Menu Array--------");
            System.out.println("1 --> Registrar Departamentos");
            System.out.println("2 --> Mostrar Departamentos");
            System.out.println("3 --> Buscar Departamentos");
            System.out.println("0 --> SALIR");
            option = sc.nextInt();

            switch(option){
                case 1: array.registerDepartments(); break;
                case 2: array.showDepartments(); break;
                case 3:
                    System.out.println("1 --> Buscar por nombre");
                    System.out.println("2 --> Buscar por letra");
                    System.out.println("3 --> Mostrar posiciones pares y más de 4 municipios");
                    System.out.println("0 --> SALIR");
                    option2 = sc.nextInt();
                    switch(option2){
                        case 1: array.searchDepartmentArray(); break;
                        case 2: array.searchLetter(); break;
                        case 3: 
                            array.searchPair(); break;
                    }
                    break;
                default: System.out.println("***Opcion no valida***"); break;
            }
        }
    }
}
