package accessControl2;

import accessControl1.Animal;

public class Pisica extends Animal {

    public void proba() {

        //Observam ca DEFAULT isi pierde vizibilitatea cand iese din pachetul initial (AccessCOntrol1)
        metodaProtected();
        metodaPublica();
    }
}
