public class Employee {

    private int EMPLOYE_ID;
    private String EMPLOYEFIRSTNAME;
    private String EMPLOYELASTNAME;
    private int salary;


    public Employee() {
    }

    public Employee(int EMPLOYE_ID, String EMPLOYEFIRSTNAME, String EMPLOYELASTNAME, int salary) {
        this.EMPLOYE_ID = EMPLOYE_ID;
        this.EMPLOYEFIRSTNAME = EMPLOYEFIRSTNAME;
        this.EMPLOYELASTNAME = EMPLOYELASTNAME;
        this.salary = salary;
    }

    public int getEMPLOYE_ID() {
        return EMPLOYE_ID;
    }

    public void setEMPLOYE_ID(int EMPLOYE_ID) {
        this.EMPLOYE_ID = EMPLOYE_ID;
    }

    public String getEMPLOYEFIRSTNAME() {
        return EMPLOYEFIRSTNAME;
    }

    public void setEMPLOYEFIRSTNAME(String EMPLOYEFIRSTNAME) {
        this.EMPLOYEFIRSTNAME = EMPLOYEFIRSTNAME;
    }

    public String getEMPLOYELASTNAME() {
        return EMPLOYELASTNAME;
    }

    public void setEMPLOYELASTNAME(String EMPLOYELASTNAME) {
        this.EMPLOYELASTNAME = EMPLOYELASTNAME;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EMPLOYE_ID=" + EMPLOYE_ID +
                ", EMPLOYEFIRSTNAME='" + EMPLOYEFIRSTNAME + '\'' +
                ", EMPLOYELASTNAME='" + EMPLOYELASTNAME + '\'' +
                ", salary=" + salary +
                '}';
    }
}
