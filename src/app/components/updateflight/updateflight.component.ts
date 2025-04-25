import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { flightService } from 'src/app/flight.service';
import { flight } from 'src/app/model/flight.model';
import { TokenService } from 'src/app/token.service';

@Component({
  selector: 'app-updateflight',
  templateUrl: './updateflight.component.html',
  styleUrls: ['./updateflight.component.css']
})
export class UpdateflightComponent {
 token!:any;
  flight!: flight;
  addflightform!: FormGroup;
  constructor(private flightservice: flightService,private formBuilder:FormBuilder,private tokenservice:TokenService,private router:Router,private http:HttpClient) { }

  createform(){
    this.addflightform = this.formBuilder.group({
      flightNumber: 0,
      flightModel: '',
      carrierName: '',
      seatCapacity: 0
    });
  }
  f(){
    return this.addflightform?.controls;
  }
  ngOnInit(): void {
    this.createform();
  }

  onsubmit(){
    if(this.addflightform?.valid){
      this.flight=this.addflightform.value;
    }
    const tokenstr = this.tokenservice.gettoken();
    if (!tokenstr) {
      alert('User is not authenticated. Please log in.');
      console.log(tokenstr);
      return;
    }
    this.flightservice.updateflight(this.flight, tokenstr).subscribe(data=>{
      console.log(data);
      alert("flight successfully updated");
    })
    if(this.addflightform?.invalid){
      console.log("Form is invalid")
      alert("please enter some value")
    }
    }
    
  }
