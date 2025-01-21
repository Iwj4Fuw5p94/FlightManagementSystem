import { Component } from '@angular/core';
import { flight } from '../model/flight.model';
import { flightService } from '../flight.service';
import { Token } from '@angular/compiler';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-viewflight',
  templateUrl: './viewflight.component.html',
  styleUrls: ['./viewflight.component.css']
})
export class ViewflightComponent {
  flight:flight[]=[];  
  constructor(private flightService:flightService,private formbuilder:FormBuilder) { }

  // viewflight(){
  //   const authToken = localStorage.getItem('authToken');
  //   if (!authToken) {
  //     alert('Authentication token not found.');
  //     return;
  //   }
  //   return this.flightService.viewflight(authToken).subscribe(data=>{
  //     console.log(data);
  //     alert("data successfully inserted");
  //   }, error => {
  //     console.log('Error:', error);
  //     alert('An error occurred while fetching the flight data.');
  //   }
  //   );
  // }
  // ngOnInit(): void {
  //   this.viewflights();
  // }


  viewflights(){
    const authToken=localStorage.getItem('authToken');
    return this.flightService.viewflight(authToken).subscribe(data=>{
      this.flight=data;
      console.log(data);
      alert("you can view the list of flight");
    }
    ,error=>{
      console.log('Error:',error);
      alert('An error occurred while fetching the flight data.');
    }
  );
  }
  

  

}
