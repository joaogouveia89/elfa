package IntExt;

public class IntExt {
    private int n;

    public IntExt(int inpt){
        this.n = inpt;
    }

    public int reverse(){
        int aux = n, reverted = 0;
        while(aux > 0){
            reverted = reverted * 10 + aux % 10;
            aux /= 10;
        }
        return reverted;
    }
}
