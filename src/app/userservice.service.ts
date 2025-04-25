import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { user } from './model/user.model';
import { Token } from '@angular/compiler';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserserviceService {
  private baseUrl="http://localhost:8080/api/"

  constructor(private http:HttpClient){ 
  }

  adduser(token:any,User:user){
    const tokenstr='Bearer '+token;
    const headers=new HttpHeaders().set('Authorization',tokenstr);
    return this.http.post(this.baseUrl+"add",User,{headers,responseType:'text' as 'json'})
  }
  deleteuser(id:any,token:any){
    const tokenstr="Bearer "+token;
    let headers=new HttpHeaders().set("Authorization",tokenstr);
    return this.http.delete(this.baseUrl+"deleteById"+id,{headers,responseType :'text' as 'json'});

  }

  updateuser(token:any,User:user){
    const tokenstr="Bearer "+token;
    let header=new HttpHeaders().set("Authorization",tokenstr);
    return this.http.put(this.baseUrl+"update",User,{responseType:'text' as 'json'});
  }

  viewall(token:any):Observable<user[]>{
   let tokenstr="Bearer "+token;
   let headers=new HttpHeaders().set("Authorization",tokenstr);
   return this.http.get<user[]>(this.baseUrl+"viewall",{headers});

  }


  viewuserbyid(userId:any){
    let tokenstr="Bearer "+localStorage.getItem("authToken");
    let headers=new HttpHeaders().set("Authorization",tokenstr);
    return this.http.get(this.baseUrl+"viewuser"+userId,{headers});

  }
}
