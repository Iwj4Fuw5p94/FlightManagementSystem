import { Component } from '@angular/core';
import { flightService } from '../flight.service';
import { FormBuilder, FormGroup } from '@angular/forms';
import { flight } from '../model/flight.model';
@Component({
  selector: 'app-viewflightbyid',
  templateUrl: './viewflightbyid.component.html',
  styleUrls: ['./viewflightbyid.component.css']
})
export class ViewflightbyidComponent {
  formgroup!:FormGroup;
  // flight:flight[]=[];
  flight: flight | null = null;

  constructor(private flightService:flightService,private formbuilder:FormBuilder) {
   }
   createForm(){
    this.formgroup=this.formbuilder.group({
      flightNumber:['']
    });
  }
  ngOnInit(): void {
    this.createForm();
  }
  viewflightById():void{
    if(this.formgroup.valid){
    // const flightNumber=this.formgroup.value.flightNumber;
    const flightNumber=this.formgroup.value.flightNumber;
    const authToken=localStorage.getItem('authToken');
    this.flightService.viewflightById(authToken,flightNumber).subscribe(data=>{
      this.flight=data;
      console.log(data);
      alert("you can view the list of flight");
    }
    ,error=>{
      console.log('Flight Number:',flightNumber);
      console.log('Error:',error);
      alert('An error occurred while fetching the flight data.');
    }
  );
  }
}

  deleteflightbyid():void{
    if(this.formgroup.valid){
    const flightNumber=this.formgroup.value.flightNumber;
    const authToken=localStorage.getItem('authToken');
    this.flightService.deleteflightbyid(authToken,flightNumber).subscribe(data=>{
      console.log(data);
      alert("you can delete the flight");
    });

    }
//     if(this.formgroup.valid){
//     const flightNumber=this.formgroup.value.flightNumber;
//     const authToken=localStorage.getItem('authToken');
//     this.flightService.deleteflightbyid(authToken,flightNumber).subscribe(data=>{
//       console.log(data);
//       alert("you can delete the flight");
//     }
//     ,error=>{
//       console.log('Flight Number:',flightNumber);
//       console.log('Error:',error);
//       alert('An error occurred while fetching the flight data.');
//     }
//   );
//   }

}
}

