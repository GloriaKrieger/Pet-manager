package app.petmanager;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import app.petmanager.model.Pet;
import app.petmanager.service.PetService;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {
    private final PetService petService;
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Pet>> getAllPets() {
        List<Pet> pets = petService.findAllPets();
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Pet> addPet(@Valid @RequestBody Pet pet){
        Pet newPet = petService.addPet(pet);
        return new ResponseEntity<>(newPet, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Pet> updatePet(@RequestBody Pet pet){
        Pet updatePet = petService.updatePet(pet);
        return new ResponseEntity<>(updatePet, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePet(@PathVariable("id") Long id) {
        petService.deletePet(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
