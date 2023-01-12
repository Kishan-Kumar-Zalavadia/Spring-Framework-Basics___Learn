package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

    public String qualification;

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


    public void assist(){
        System.out.println("Doctor is Assisting");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Set bean name method is called");
    }
}
