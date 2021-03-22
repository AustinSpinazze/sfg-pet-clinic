package austinspinazze.springframework.sfgpetclinic.services.map;

import austinspinazze.springframework.sfgpetclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<Type, ID> implements CrudService<Type, ID> {
    protected Map<ID, Type> map = new HashMap<>();

    @Override
    public Set<Type> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public Type findById(ID id) {
        return map.get(id);
    }

    @Override
    public Type save(ID id, Type object) {
        map.put(id,object);
        return object;
    }

    @Override
    public void delete(Type object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);

    }
}
