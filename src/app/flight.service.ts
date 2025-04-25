import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { flight } from './model/flight.model';
import { Observable } from 'rxjs/internal/Observable';
import { retry } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class flightService {
  baseUrl:string="http://localhost:8080/api/";
  basesUrl:string="http://localhost:8080/api/auth/"
  constructor(private http:HttpClient) { 
  }

  addflight(flight:flight,token:string){
    let tokenStr = 'Bearer '+ token;
    console.log(tokenStr)
    const headers = new HttpHeaders().set('Authorization', tokenStr);
    return this.http.post(`${this.baseUrl}addFlight`,flight,{headers,responseType: 'text' as 'json'});
  }

  viewflight(token:any){
    let tokenStr = 'Bearer '+ token;
    console.log(tokenStr)
    const headers = new HttpHeaders().set('Authorization', tokenStr);
    return this.http.get<flight[]>(`${this.baseUrl}viewFlights`,{headers});
  }

  viewflightById(token:any,flightNumber:number):Observable<flight>{
    let tokenStr = 'Bearer '+ token;
    console.log(tokenStr)
    const headers = new HttpHeaders().set('Authorization', tokenStr);
    return this.http.get<flight>(`${this.baseUrl}viewFlight/${flightNumber}`,{headers});
  }
  deleteflightbyid(token:any,flightNumber:number){
    let tokenstr='Bearer '+token;
    console.log(tokenstr);
    const headers=new HttpHeaders().set('Authorization',tokenstr);
    return this.http.delete(`${this.baseUrl}deleteFlight/${flightNumber}`,{headers,responseType:'text' as 'json'});
   
  }

  updateflight(flight:flight,token:any){
    let tokenstr='Bearer '+token;
    console.log(tokenstr);
    const headers=new HttpHeaders().set('Authorization',tokenstr);

    return this.http.put(this.baseUrl+"modifyFlight",flight,{headers,responseType:'text' as 'json'})
  }
  // addflight(flightData: any, tokenstr: string): Observable<any> {
  //   const token = localStorage.getItem('authToken'); // Retrieve token from localStorage
  //   const headers = new HttpHeaders().set(
  //     'Authorization',
  //     `Bearer ${token}` // Attach the token
  //   );
  //   return this.http.post(`${this.baseUrl}/addFlight`, flightData,{headers,responseType: 'text' as 'json'});
  // }
}
