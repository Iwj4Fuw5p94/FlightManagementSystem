import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { flight } from './model/flight.model';
import { Observable } from 'rxjs/internal/Observable';
@Injectable({
  providedIn: 'root'
})
export class flightService {
  baseUrl:string="http://localhost:8080/api/";
  basesUrl:string="http://localhost:8080/api/auth/"

  constructor(private http:HttpClient) { 

  }

  getGeneratedToken(requestBody: any) {
    return this.http.post(this.basesUrl + 'authenticate', requestBody, {
      responseType: 'text' as 'json',
    });
  }


  addflight(flight:flight,token:string){
    let tokenStr = 'Bearer '+ token;
    console.log(tokenStr)
    const headers = new HttpHeaders().set('Authorization', tokenStr);
    return this.http.post(`${this.baseUrl}addFlight`,flight,{headers,responseType: 'text' as 'json'});
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
