package patz.spring.petclinic.services;

import patz.spring.petclinic.model.Pet;

import java.util.Set;

public interface Petservice {
    Pet findbyId(Long id);
    Pet save(Pet pet);
    Set<Pet> findall();
}
