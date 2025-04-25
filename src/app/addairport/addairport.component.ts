import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { airport } from '../model/airport.model';
import { AirportService } from '../airport.service';
import { RouterTestingHarness } from '@angular/router/testing';
import { TokenService } from '../token.service';

@Component({
  selector: 'app-addairport',
  templateUrl: './addairport.component.html',
  styleUrls: ['./addairport.component.css']
})
export class AddairportComponent {
  formgroup!:FormGroup;
  Airport:airport=new airport();
  response!:any;
  constructor(private formBuilder: FormBuilder,private airportService:AirportService,private tokenservice:TokenService) { }


  createform(){
    this.formgroup=this.formBuilder.group(
      {
        'airportName': 'bhopal',
        'airportCode': '1b',
        'airportLocation':'bhopal',
        'airportno': 1,
      }
    )
  }
  f() {
    return this.formgroup?.controls;
  }
  ngOnInit(): void {
    this.createform();
  }
  onSubmit(){
    if(this.formgroup.valid){
      this.Airport.airportCode=this.formgroup.value.airportCode;
      this.Airport.airportLocation=this.formgroup.value.airportLocation;
      this.Airport.airportName=this.formgroup.value.airportName;
      this.Airport.airportno=this.formgroup.value.airportno;
      const tokenstr = this.tokenservice.gettoken();
      this.airportService.addairport(this.Airport,tokenstr).subscribe
      (data=>{
        this.response=data;
        console.log(data);
        alert("data added successfully")
    },
    error => {
      alert("something went wrong")
    }
  )
    }
  }
}
