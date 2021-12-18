package ListsExt;

public class StringListExt extends ListExt<String>{
    public StringListExt alphabeticalSorting(){
        StringListExt alph = (StringListExt) this.clone();
        alph.sort(String::compareTo);
        return alph;
    }
}
