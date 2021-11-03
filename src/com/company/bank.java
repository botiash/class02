package com.company;

public class bank {
    public int id, schet, credit;
    public String FIO, adress;

    public bank(int id, int schet, int credit, String FIO, String adress) {
        this.id = id;
        this.schet = schet;
        this.credit = credit;
        this.FIO = FIO;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSchet() {
        return schet;
    }

    public void setSchet(int schet) {
        this.schet = schet;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "bank{" +
                "id=" + id +
                ", schet=" + schet +
                ", credit=" + credit +
                ", FIO='" + FIO + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}





