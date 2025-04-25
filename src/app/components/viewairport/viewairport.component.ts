import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { airport } from 'fms/app/model/airport.model';
import { AirportService } from 'src/app/airport.service';
import { TokenService } from 'src/app/token.service';

@Component({
  selector: 'app-viewairport',
  templateUrl: './viewairport.component.html',
  styleUrls: ['./viewairport.component.css']
})
export class ViewairportComponent {
  Airport!: airport[];
  formgroup!:FormGroup;
  airpo:any;
  // a:airport=new airport();

// airport: any;
  constructor(private airportservice:AirportService,private router:Router,private tokenService:TokenService,private formbuilder:FormBuilder) { }
  viewairport(){
    return this.airportservice.viewairport(localStorage.getItem("authToken")).subscribe
    (data=>
    {
      this.Airport=data
      console.log(this.Airport);
      alert("you can see the airports")
    }
  )
  }
  createform(){
    this.formgroup=this.formbuilder.group({
      airportCode: ['']
    })
  }
  ngOnInit(): void {
    this.createform();
  }
  
  viewairportbyairportcode(){
    // if(this.formgroup.value.valid){
    const airportCode=this.formgroup.value.airportCode;
    const token=localStorage.getItem("authToken");
    this.airportservice.viewairportbyairportcode(airportCode,token).subscribe
    (data=>

    {
      this.airpo=data
      console.log(data);
      alert("u can view the data")
    }
    )
  // }
  // else{
  //   alert("there is some error")
  // }
}
}
