package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //------------------------------------------------------------------
        Doctor doctor = context.getBean(Doctor.class);
        Nurse nurse1 = context.getBean(Nurse.class);
        Nurse nurse2 =(Nurse) context.getBean("nurse");
        doctor.assist();
        nurse2.assist();

        //------------------------------------------------------------------
        Staff staff = context.getBean(Doctor.class);
        staff.assist();

        //---------------------------------------------
        Doctor doctor2 = context.getBean(Doctor.class);
        staff.assist();
        System.out.println(doctor2.getQualification());
    }
}
