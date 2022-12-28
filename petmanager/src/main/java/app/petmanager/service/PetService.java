package app.petmanager.service;

import app.petmanager.exception.UserNotFoundException;
import app.petmanager.repo.PetRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.petmanager.model.Pet;

import java.util.List;

@Service
@Transactional
public class PetService {
    private final PetRepo petRepo;

    @Autowired
    public PetService(PetRepo petRepo) {
        this.petRepo = petRepo;
    }

    public Pet addPet(Pet pet){
        return petRepo.save(pet);
    }

    public List<Pet> findAllPets(){
        return petRepo.findAll();
    }

    public Pet updatePet(Pet pet){
        return petRepo.save(pet);
    }

    public Pet findPetById(Long id){
        return petRepo.findPetById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + "was not found"));
    }
    public void deletePet(Long id){
        petRepo.deletePetById(id);
    }
}
