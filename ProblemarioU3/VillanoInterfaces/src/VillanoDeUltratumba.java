public class VillanoDeUltratumba extends Villano implements SerDeUltratumba{

    public String legion;

    public VillanoDeUltratumba(int edad, String nombre, String legion) {
        super(edad, nombre);
        this.legion = legion;
    }

    public VillanoDeUltratumba(String legion) {
        this.legion = legion;
    }

    @Override
    public void asustar() {
        System.out.println("buuuuu!!!!");
    }

    @Override
    public void gritar() {
        System.out.println("uaaaayyyy");
    }
}
