package lanaDrahrepus.repository;

import java.util.List;

public interface Repository<E> {
    List<E> findAll();

    boolean remove(Integer id);

    E findById(Integer id);

    void save(E e);
}
