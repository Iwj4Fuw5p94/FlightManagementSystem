import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { airport } from './model/airport.model';
@Injectable({
  providedIn: 'root'
})
export class AirportService {

  constructor(private http:HttpClient) {
   }
   baseUrl:string="http://localhost:8080/api/airport/"

   addairport(airport:airport,token:any){
    let tokenstr= 'Bearer '+ token;
    console.log(tokenstr);
    const headers=new HttpHeaders().set('Authorization',tokenstr);
    return this.http.post(`${this.baseUrl}addairport`,airport,{headers,responseType: 'text' as 'json'});
   }
   viewairport(token:any):Observable<airport[]>{
    let tokenstr= 'Bearer '+ token;
    console.log(tokenstr);
    const headers=new HttpHeaders().set('Authorization',tokenstr);
    return this.http.get<airport[]>(this.baseUrl+"viewAirports",{headers,responseType:'json'}); // Changed to 'json'
   }

   viewairportbyairportcode(airportCode:string,token:any){
    let tokenstr= 'Bearer '+ token;
    console.log(tokenstr);
    const headers=new HttpHeaders().set('Authorization',tokenstr);
    return this.http.get(this.baseUrl+"viewAirport"+airportCode,{headers,responseType:'json'})
   }
}
