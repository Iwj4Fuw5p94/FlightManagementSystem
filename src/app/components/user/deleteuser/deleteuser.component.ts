import { Component } from '@angular/core';
import { user } from 'src/app/model/user.model';
import { UserserviceService } from 'src/app/userservice.service';

@Component({
  selector: 'app-deleteuser',
  templateUrl: './deleteuser.component.html',
  styleUrls: ['./deleteuser.component.css']
})
export class DeleteuserComponent {
 userId:number=0;
  constructor(private userservice:UserserviceService) { }
  deleteuser(){  
    const token=localStorage.getItem('authToken');
    this.userservice.deleteuser(this.userId,token).subscribe
    (
      response=>{
        console.log(response);
        alert("deleted successfully")
      },
      err=>{
        alert("user not found")
        console.log(err);
      } 
    )
}
}
