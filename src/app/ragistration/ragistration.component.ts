import { Component } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Form } from '@angular/forms';
import { RagistrationService } from '../ragistration.service';
import { UserInfo } from '../model/UserInfo.model';


@Component({
  selector: 'app-ragistration',
  templateUrl: './ragistration.component.html',
  styleUrls: ['./ragistration.component.css']
})
export class RagistrationComponent {
  ragistrationform!: FormGroup;
    loginform!: FormGroup;
    UserInfo!: UserInfo;;
    activateform:string='';
    constructor(private  formBuilder: FormBuilder, private router:Router,private ragistrationservice:RagistrationService) {
      this.UserInfo=new UserInfo();
    }
    ngOnInit() {
      this.createRagistrationFrom();
      
    }
    createRagistrationFrom(){
       this.ragistrationform = this.formBuilder.group({
        name: ['',Validators.required],
        email : ['',Validators.required ],
        password:['',Validators.required],
        role:['',Validators.required]
       })
    }
    get f() {
       return this.ragistrationform?.controls; }
    onsubmit(){
      // event.preventDefault();
      if(this.ragistrationform?.value){
        this.UserInfo.name=this.f["name"].value;
        this.UserInfo.email=this.f['email'].value;
        this.UserInfo.password=this.f['password'].value;
        this.UserInfo.role='User';
      }
      this.ragistrationservice.register(this.UserInfo).subscribe(data=>{
        console.log(data);
        alert("data successfully inserted");
      })

      if(this.ragistrationform?.invalid){
         console.log("Form is invalid")
         alert("please enter some value")
      }
      // else{
      // console.log("Registrations Details",this.ragistrationform.value);
      // alert("data successfully inserted");
      // }
    }
    navigate(){
      this.router.navigate(['/login']);
    }
    loginnavigate(){
      if(this.ragistrationform.valid){
        alert("you are now go the login page")
        this.router.navigate(['/login'])
      }
    }

}
