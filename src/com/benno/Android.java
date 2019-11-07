package com.benno;

public class Android extends Handphone{
    private String keyStore;

    public Android(String manufacture, String operatingSystem, String model, int harga) {
        super(manufacture, operatingSystem, model, harga);
    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
}
