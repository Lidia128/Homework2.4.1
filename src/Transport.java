import driver.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract  class Transport implements Improving {
    private String brend;
    private String model;
    private double volume;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mehanik<?>> mehaniks = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();
    public Transport(String brend, String model, double volume) {
        this.brend = brend;
        this.model = model;
        this.volume = volume; }
    public void startDrive() {
        System.out.println("Начать движение.");
    }
    public void stopDrive() {
        System.out.println("Закончить движение");
    }
    public void infoAuto() {
        System.out.println("Траснспортное средство " + getBrend() + " модель " + getModel() + " с объемом " +
                "двигателя " + getVolume()); }
    public void addDriver (Driver<?>...drivers){
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMehanik (Mehanik<?>...mehaniks){
        this.mehaniks.addAll(Arrays.asList(mehaniks));
    }
    public void addSponsor (Sponsor... sponsors){
        this.sponsors.addAll(Arrays.asList(sponsors)); }
    public List<Driver<?>> getDrivers() {
        return drivers; }
    public List<Mehanik<?>> getMehaniks() {
        return mehaniks; }
    public List<Sponsor> getSponsors() {
        return sponsors; }
    public String getBrend() {
        return brend;
    }
    public String getModel() {
        return model;
    }
    public abstract void printType ();
    public abstract boolean service ();
    public abstract void repair ();
    public double getVolume() {
        return volume;
    }
}

