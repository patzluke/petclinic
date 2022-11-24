package patz.spring.petclinic.services;

import patz.spring.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findbyId(Long id);
    Owner save(Owner owner);
    Set<Owner> findall();
}
