
package za.ac.tut.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;


@Entity
public class HeadOfDepartment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long staffNum;
    private String name;
    private String surname;
    private String faculty;
    private String password;
    

    public HeadOfDepartment() {
    }

    public HeadOfDepartment(Long staffNum, String name, String surname, String faculty, String password) {
        this.staffNum = staffNum;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.password = password;
    }

    public Long getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(Long staffNum) {
        this.staffNum = staffNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
   
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffNum != null ? staffNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HeadOfDepartment)) {
            return false;
        }
        HeadOfDepartment other = (HeadOfDepartment) object;
        if ((this.staffNum == null && other.staffNum != null) || (this.staffNum != null && !this.staffNum.equals(other.staffNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.HeadOfDepartment[ id=" + staffNum + " ]";
    }
    
}
