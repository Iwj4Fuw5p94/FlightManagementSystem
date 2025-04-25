import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Schedule } from './model/shedule.model';

@Injectable({
  providedIn: 'root'
})
export class ScheduleflightService {

  baseUrl="http://localhost:8080/api/scheduleflight/"
  constructor(private http:HttpClient) {

   }
   addsheduleflight(scheddule:Schedule){
    let tokenstr="Bearer"+localStorage.getItem("authtoken");
    let headers=new HttpHeaders().set("Authorization",tokenstr);
    return this.http.post(this.baseUrl+"add",scheddule);
   }

   viewscheduleflight(){
    let tokenstr="Bearer"+localStorage.getItem("authtoken");
    let headers=new HttpHeaders().set("Authorization",tokenstr);
    return this.http.get(this.baseUrl+"viewScheduleFlights");
   }

   viewscheduleflightbyflightnumber(flightnumber:any){
    let tokenstr="Bearer"+localStorage.getItem("authtoken");
    let headers=new HttpHeaders().set("Authorization",tokenstr);
    return this.http.get(this.baseUrl+"viewScheduleFlight",flightnumber);
   }
   
}
