package io.tibetteixeira.creational.factorymethod.depois.model;

public class CartaoCredito extends Pagamento {
    @Override
    public void pagar() {
        System.out.println("Pago com Cartão de crédito");
    }
}
