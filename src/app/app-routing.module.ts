import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddPetComponent } from './add-pet/add-pet.component';
import { PetTableComponent } from './pet-table/pet-table.component';

const routes: Routes = [
  { path: '', component: PetTableComponent },
  { path: 'add-pet', component: AddPetComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
