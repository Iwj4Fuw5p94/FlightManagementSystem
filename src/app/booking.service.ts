import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { booking } from './model/booking.model';

@Injectable({
  providedIn: 'root'
})
export class BookingService {
  baseUrl="http://localhost:8080/api/"

  constructor(private http:HttpClient) { }

  addbooking(booking:booking){
    let tokenstr ="Bearer "+localStorage.getItem("authToken");
    let headers=new HttpHeaders().set("Authorization",tokenstr)
    return this.http.post(this.baseUrl+"addBooking",booking,{headers,responseType:'text' as 'json'});
  }


}
