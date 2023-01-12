package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
public class Doctor implements Staff{

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

}
