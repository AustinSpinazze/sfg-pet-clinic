package austinspinazze.springframework.sfgpetclinic.services.map;

import austinspinazze.springframework.sfgpetclinic.model.Vet;
import austinspinazze.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return null;
    }

    @Override
    public Vet findById(Long id) {
        return null;
    }

    @Override
    public Vet save(Vet object) {
        return null;
    }

    @Override
    public void delete(Vet object) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
