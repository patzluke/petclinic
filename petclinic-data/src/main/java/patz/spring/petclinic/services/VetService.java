package patz.spring.petclinic.services;

import patz.spring.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findbyId(Long id);
    Vet save(Vet vet);
    Set<Vet> findall();
}
