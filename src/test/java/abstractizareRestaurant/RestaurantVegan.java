package abstractizareRestaurant;

public class RestaurantVegan extends restaurant implements Vegan{


    public RestaurantVegan(String nume, String adresa, String program) {
        super(nume, adresa, program);
    }

    @Override
    public void ingredienteVegane() {
        System.out.println("Toate ingredientele sunt vegane");
    }

    @Override
    public void chelnerVegan() {

    }

    @Override
    public void bucatarVegan() {

    }
}
