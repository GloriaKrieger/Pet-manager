import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Pet } from '../pet';
import { PetService } from '../pet.service';

@Component({
  selector: 'app-pet-table',
  templateUrl: './pet-table.component.html',
  styleUrls: ['./pet-table.component.css'],
})
export class PetTableComponent implements OnInit {
  public pets: Pet[];
  public editPet: Pet = new Pet();

  constructor(private petService: PetService) {}

  ngOnInit() {
    this.getPets();
  }

  public getPets(): void {
    this.petService.getPets().subscribe({
      next: (response) => (this.pets = response),
      error: (e) => alert(e.message),
    });
  }

  public onUpdatePet(pet: Pet): void {
    this.petService.updatePet(pet).subscribe({
      next: (response) => this.getPets(),
      error: (e) => alert(e.message),
    });
  }

  public getPet(pet: Pet): void {
    this.editPet = pet;
  }

  public onDeletePet(petId: number): void {
    this.petService.deletePet(petId).subscribe({
      next: (response) => this.getPets(),
      error: (e) => alert(e.message),
    });
  }
}
