
package finaltest;
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
}
