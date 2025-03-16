package accessControl1;

public class Iepure extends Animal {

    public void proba() {

        //Observam ca "private" nu mai e vizibila, in rest celelate metode sunt vizibile daca se acplica mostenirea
        metodaDefault();
        metodaProtected();
        metodaPublica();
    }
}
