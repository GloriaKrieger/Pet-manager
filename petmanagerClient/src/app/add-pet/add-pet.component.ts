import { Component, OnInit } from '@angular/core';
import { PetService } from '../pet.service';
import { Pet } from '../pet';
import { NgForm } from '@angular/forms';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-add-pet',
  templateUrl: './add-pet.component.html',
  styleUrls: ['./add-pet.component.css'],
})
export class AddPetComponent implements OnInit {
  public SuccessAlert: boolean = false;
  public ErrorAlert: boolean = false;
  public pets: Pet[];

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

  public onAddPet(addForm: NgForm): void {
    this.petService.addPet(addForm.value).subscribe({
      next: (response) => (this.getPets(), (this.SuccessAlert = true)),
      error: (e) => (alert(e.message), (this.ErrorAlert = true)),
    });
  }
}
