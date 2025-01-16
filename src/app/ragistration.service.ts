import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UserInfo } from './model/UserInfo.model';
@Injectable({
  providedIn: 'root'
})
export class RagistrationService {
  baseUrl:string="http://localhost:8080/api/auth/register";
  basesUrl:string="http://localhost:8080/api/auth/authenticate";

  constructor(private http:HttpClient) {}
  register(userInfo:UserInfo){
    return this.http.post(`${this.baseUrl}`,userInfo);
  }
  generatetoken(userInfo:UserInfo){
      return this.http.post(`${this.basesUrl}`,userInfo,{responseType:'text' as 'json'});
    }
}
