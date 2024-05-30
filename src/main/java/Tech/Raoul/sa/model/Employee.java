package Tech.Raoul.sa.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tbl-employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public Employee(Integer id, String name, String gender, String department, Date dob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.dob = dob;
    }

    public Date getDob() {
        return dob;
    }

    @Column
    private String gender;

    public Integer getId() {
        return id;
    }

    @Column
    private String department;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name
                + ", gender=" + gender + ", departement=" + department + ", dob=" + dob +"]";
    }

    @Column
    private Date dob;

}
