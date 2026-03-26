public class Superman extends hero implements azul{

    public Superman() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected void aGolpe() {
        System.out.println("Superman concentra su fuerza kryptoniana en un solo impacto que hace temblar el suelo.");
    }

    @Override
    protected void bStrategy() {
        System.out.println("El Último Hijo de Krypton usa su visión de rayos X para detectar debilidades estructurales.");
    }

    @Override
    protected void cSpeed() {
        System.out.println("Superman despega rompiendo la barrera del sonido, dejando un estallido sónico tras de sí.");
    }

    @Override
    public void power() {

    }
}
