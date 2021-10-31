package com.company;

class ParkingSystem {
    int big,medium,small;
    private static final int BIG=1;
    private static final int MEDIUM=2;
    private static final int SMALL=3;
    public ParkingSystem(int big,int medium,int small){
        this.big=big;
        this.medium=medium;
        this.small=small;
    }
    public boolean addCar(int CarType){
        switch (CarType){
            case BIG:
                big--;
                return big>=0;
            case MEDIUM:
                medium--;
                return medium>=0;
            case SMALL:
                small--;
                return small>=0;
        }
        return false;

    }
}
