package austinspinazze.springframework.sfgpetclinic.services.map;

import austinspinazze.springframework.sfgpetclinic.model.Owner;
import austinspinazze.springframework.sfgpetclinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner findByLastName(String lastName) {
        return map.get(lastName);
    }
}
