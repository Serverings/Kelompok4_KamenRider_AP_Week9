package tugas.week9;

import java.util.ArrayList;
import java.util.List;

public class MedalRepository<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll() {
        return items;
    }
}