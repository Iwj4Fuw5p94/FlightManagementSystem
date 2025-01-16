import { Component } from '@angular/core';
import { flightService } from '../flight.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { flight } from '../model/flight.model';
import { TokenService } from '../token.service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-flight',
  templateUrl: './flight.component.html',
  styleUrls: ['./flight.component.css']
})
export class FlightComponent {
  token!:any;
  flight: flight=new flight();
  // anther approach to declare flight object
  // flight: flight = {
  //   flightNumber: 0,
  //   flightModel: '',
  //   carrierName: '',
  //   seatCapacity: 0
  // };
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

  // both is right choose either oone oof them 
  
  // onsubmit(flightData: any) {
  //   const token = localStorage.getItem('authToken');
  //   const apiUrl = 'http://localhost:8080/api/addFlight';
  
  //   if (!token) {
  //     alert('User is not authenticated. Please log in.');
  //     this.router.navigate(['/login']);
  //     return;
  //   }
  
  //   const headers = {
  //     Authorization: `Bearer ${token}`
  //   };
  
  //   this.http.post(apiUrl, flightData, { headers }).subscribe(
  //     (response) => {
  //       console.log('Flight added successfully:', response);
  //       alert('Flight added successfully!');
  //     },
  //   );
  // }
  
  onsubmit(){
    // debugger;
    if(this.addflightform?.valid){
      this.flight.flightNumber=this.addflightform.value.flightNumber;
      this.flight.flightModel=this.addflightform.value.flightModel;
      this.flight.carrierName=this.addflightform.value.carrierName;
      this.flight.seatCapacity=this.addflightform.value.seatCapacity;
    }
    const tokenstr = this.tokenservice.gettoken();
    if (!tokenstr) {
      alert('User is not authenticated. Please log in.');
      console.log(tokenstr);
      return;
    }
    this.flightservice.addflight(this.flight, tokenstr).subscribe(data=>{
      console.log(data);
      alert("data successfully inserted");
    })
    if(this.addflightform?.invalid){
      console.log("Form is invalid")
      alert("please enter some value")
    }
    }
  }

// import { Component, OnInit } from '@angular/core';
// import { FormBuilder, FormGroup, Validators } from '@angular/forms';
// import { flight } from '../model/flight.model';
// import { flightService } from '../flight.service';
// import { TokenService } from '../token.service';

// @Component({
//   selector: 'app-flight',
//   templateUrl: './flight.component.html',
//   styleUrls: ['./flight.component.css'],
// })
// export class FlightComponent implements OnInit {
//   flight: flight = new flight();
//   addFlightForm!: FormGroup;

//   constructor(
//     private flightService: flightService,
//     private formBuilder: FormBuilder,
//     private tokenService: TokenService
//   ) {}

//   createForm() {
//     this.addFlightForm = this.formBuilder.group({
//       flightNumber: [0, Validators.required],
//       flightModel: ['', Validators.required],
//       carrierName: ['', Validators.required],
//       seatCapacity: [0, Validators.required],
//     });
//   }

//   ngOnInit(): void {
//     this.createForm();
//   }

//   onSubmit() {
//     if (this.addFlightForm.valid) {
//       this.flight = { ...this.addFlightForm.value };
  
//       const token = this.tokenService.getToken(); // Correct method name
//       if (!token) {
//         alert('User is not authenticated. Please log in.');
//         console.log(token)
//         return;
//       }
  
//       this.flightService.addflight(this.flight, token).subscribe(
//         (response) => {
//           console.log('Flight added successfully:', response);
//           alert('Flight added successfully!');
//           this.addFlightForm.reset();
//         },
//         (error) => {
//           console.error('Error adding flight:', error);
//           alert('Error adding flight. Please try again.');
//         }
//       );
//     } else {
//       alert('Please fill in all required fields.');
//     }
//   }
  
// }
