package io.tibetteixeira.creational.factorymethod.depois.model;

public class Paypal extends Pagamento {
    @Override
    public void pagar() {
        System.out.println("Pago com Paypal");
    }
}
