import { Component } from '@angular/core';
import { FormBuilder, FormGroup, NgForm } from '@angular/forms';
import { user } from 'src/app/model/user.model';
import { UserserviceService } from 'src/app/userservice.service';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
@Component({
  selector: 'app-adduser',
  templateUrl: './adduser.component.html',
  styleUrls: ['./adduser.component.css']
})
export class AdduserComponent {
  user:user={
    firstname:'',
    lastname:'',
    email:'',
    userId:0,
    userphone:'',
      address:'',
  };
  constructor(private userservice:UserserviceService,){
  }
  addUser(){
    // console.log(form);
    const token=localStorage.getItem('authToken');
    this.userservice.adduser(token,this.user).subscribe(
      response=>{
        console.log(response);
        alert("data successfully added");
      }
    )
}
updateuser(){
  const token=localStorage.getItem("authToken");
  this.userservice.updateuser(token,this.user).subscribe(
    response=>{
      console.log(response);
      alert("data successfully updated");
    }
  )
  // console.error("errrr")
  // alert("something wrong")
}
}
