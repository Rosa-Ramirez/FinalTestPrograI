
package finaltest;

public class FinalTest {

    public static void main(String[] args) {
        String a = "", c = "";
        int b = 0;
        DepartmentsArrays arrays = new DepartmentsArrays(a, b, c);
        DepartmentsLists lists = new DepartmentsLists();
        while (b == 0){
        arrays.registerDepartments();
        arrays.showDepartments();
        lists.registerDepartmentsList();
        lists.showDepartmentsList();
        }
    }
    
}
