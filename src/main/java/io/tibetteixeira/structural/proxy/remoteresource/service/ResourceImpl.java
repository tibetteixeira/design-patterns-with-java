package io.tibetteixeira.structural.proxy.remoteresource.service;

public class ResourceImpl implements Resource {
    private String data;

    public ResourceImpl() throws InterruptedException {
        System.out.println("Loading resources from data structure");
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.print(".");
        }

        this.data = "This is all your data";
        System.out.println("Resource is ready!");
    }

    @Override
    public String getData() {
        return data;
    }
}
