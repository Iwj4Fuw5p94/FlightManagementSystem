import { Component } from '@angular/core';
import { user } from 'src/app/model/user.model';
import { UserserviceService } from 'src/app/userservice.service';

@Component({
  selector: 'app-viewall',
  templateUrl: './viewall.component.html',
  styleUrls: ['./viewall.component.css']
})
export class ViewallComponent {

  users: any;
  userId!:number;
  
  constructor(private userservice:UserserviceService){
  }
  onsubmit(){
    let token=localStorage.getItem("authToken")
    return this.userservice.viewall(token).subscribe(
      response=>{
        this.users=response;
        console.log(Response);
        alert("you can view the data");
      }
    )
  }
  viewUserById(){
    return this.userservice.viewuserbyid(this.userId).subscribe
    (
      response=>{
        this.users=response;
        console.log(response);
        alert("u can see ur data");

      }
    )
  }
}
