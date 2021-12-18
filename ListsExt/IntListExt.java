package ListsExt;

public class IntListExt extends ListExt<Integer>{

    public int sum(){
        return this.stream().mapToInt(Integer::intValue).sum();
    }
}