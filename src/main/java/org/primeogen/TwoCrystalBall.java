package org.primeogen;

public class TwoCrystalBall {
    public static void main(String[] args) {
        int[] floors = {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1};
        System.out.println(whatFloor(floors));
    }

    public static int whatFloor(int[] breaks){
        int jumpAmount = (int) Math.sqrt(breaks.length);
        int i = jumpAmount;
        for(;i < breaks.length; i+= jumpAmount){
            if(breaks[i] == 1){
                break;
            }
        }

        for( int j = i -jumpAmount; j < breaks.length; j++){
            if(breaks[j] == 1){
                return j;
            }
        }

        return 0;
    }
}
