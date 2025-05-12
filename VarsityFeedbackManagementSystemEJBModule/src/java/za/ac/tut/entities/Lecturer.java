
package za.ac.tut.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;


@Entity
public class Lecturer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long staffNum;
    private String name;
    private String surname;
    private String faculty;
    //Must edit to module as a list not one subject
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    private List<ModuleInfo> modules;
    private String password;

    public Lecturer() {
    }

    public Lecturer(Long staffNum, String name, String surname, String faculty, List<ModuleInfo> modules, String password) {
        this.staffNum = staffNum;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.modules = modules;
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

    

    public List<ModuleInfo> getModules() {
        return modules;
    }

    public void setModules(List<ModuleInfo> modules) {
        this.modules = modules;
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
        if (!(object instanceof Lecturer)) {
            return false;
        }
        Lecturer other = (Lecturer) object;
        if((this.staffNum == null && other.staffNum != null) || (this.staffNum != null && !this.staffNum.equals(other.staffNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.Lecturer[ id=" + staffNum + " ]";
    }
    
}
