
package za.ac.tut.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;


@Entity
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long studNum;
    private String name;
    private String surname;
    private String faculty;
    private char gender;
    private String password;

    public Student() {
    }

    public Student(Long studNum, String name, String surname, String faculty, char gender, String password) {
        this.studNum = studNum;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.gender = gender;
        this.password = password;
    }
   

    public Long getStudNum() {
        return studNum;
    }

    public void setStudNum(Long studNum) {
        this.studNum = studNum;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    
  

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studNum != null ? studNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.studNum == null && other.studNum != null) || (this.studNum != null && !this.studNum.equals(other.studNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.Student[ id=" + studNum + " ]";
    }
    
}
