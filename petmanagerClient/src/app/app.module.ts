import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddPetComponent } from './add-pet/add-pet.component';
import { RouterModule } from '@angular/router';
import { PetTableComponent } from './pet-table/pet-table.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [AppComponent, AddPetComponent, PetTableComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: '', component: AppComponent },
      { path: 'add-pet', component: AddPetComponent },
    ]),
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
