package app.petmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import app.petmanager.model.Pet;

import java.util.Optional;
@Repository
public interface PetRepo extends JpaRepository<Pet, Long> {
    void deletePetById(Long id);

    Optional <Pet> findPetById(Long id);
}
