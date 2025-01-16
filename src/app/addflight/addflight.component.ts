import { Component } from '@angular/core';
import { NgModel } from '@angular/forms';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-addflight',
  templateUrl: './addflight.component.html',
  styleUrls: ['./addflight.component.css']
})
export class AddflightComponent {
  flight = {
    flightNumber: '',
    departure: '',
    arrival: ''
  };

  constructor() {}

  onSubmit() {
    // Handle form sub
    // mission logic here
    console.log('Flight added:', this.flight);
    // You can add more logic to save the flight details to a server or a database
  }

}
