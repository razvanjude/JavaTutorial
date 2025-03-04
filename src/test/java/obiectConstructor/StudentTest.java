package obiectConstructor;

import org.testng.annotations.Test;

public class StudentTest {

    @Test
    public void MetodaTest () {

        //initializam Obiectul
        Student Razvan = new Student("Razvan", "Jude", 99, "Poli", 1);
        Razvan.prezentareaStudentului();

        System.out.println();

        Razvan.varsta =39; // daca varsta depaseste 35 intra ca studentul nu mai poate sa faca facultate
        Razvan.prezentareaStudentului();

        System.out.println();

        Student Anca = new Student("Anca", "Lazar", 2, "IT", 2);
        Anca.prezentareaStudentului();

        System.out.println();

        Student Alex = new Student("Alex", "Dorha", 29);
        Alex.prezentareaStudentului();
        Alex.varsta = 31;
        Alex.facultate = "IT";
        Alex.an =1;
        Alex.prezentareaStudentului();

    }
}
