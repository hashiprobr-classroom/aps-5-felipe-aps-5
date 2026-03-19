package br.edu.insper.desagil.pi.freela;

public abstract class Momento {

    public int ajusta(int min, int max, int val){
        if (val<min){
            return min;
        } else if (val>max) {
            return max;
        } else{return val;}
    }

    public abstract int minutos();
}
