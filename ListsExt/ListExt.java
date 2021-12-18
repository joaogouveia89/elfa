package ListsExt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
* Map function usage:
* List<Integer> mapped = fooList.stream().map( f -> f.x).collect(Collectors.toList());
* Filter function usage:
* List<Foo> filtered = fooList.stream().filter( f -> f.x > 3).collect(Collectors.toList());
* Println non verbose:
* names.stream().forEach(System.out::println);
*/
public class ListExt<T> extends ArrayList<T>{
    protected List<T> reverse(){
        return this.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    }
    protected List<T> removeDuplicates(){
        return this.stream()
            .distinct()
            .collect(Collectors.toList());
    }
}
