package austinspinazze.springframework.sfgpetclinic.services;

import austinspinazze.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
