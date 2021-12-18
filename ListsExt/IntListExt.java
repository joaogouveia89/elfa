package ListsExt;

public class IntListExt extends ListExt<Integer>{

    public int sum(){
        this.reverse();
        return this.stream().mapToInt(Integer::intValue).sum();
    }
}