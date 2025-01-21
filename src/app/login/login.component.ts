import { Component } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserInfo } from '../model/UserInfo.model';
import { RagistrationService } from '../ragistration.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
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
          password:['',Validators.required],
         })
      }
      get f() {
         return this.ragistrationform?.controls; }
      // onsubmit(){
      //   // event.preventDefault();
      //   if(this.ragistrationform?.value){
      //     this.UserInfo.name=this.f['name'].value;
      //     this.UserInfo.password=this.f['password'].value;
      //   }
      //   this.ragistrationservice.generatetoken(this.UserInfo).subscribe(
      //    (response: any) => {
      //     localStorage.setItem('authToken', response.token);
      //      console.log(response);
      //     alert('data successfully inserted:');
      //   });
      //   if(this.ragistrationform?.invalid){
      //      console.log("Form is invalid")
      //      alert("please enter some value")
      //   }
      //  }
      onsubmit() {
        if (this.ragistrationform.valid) {
          this.UserInfo.name = this.f['name'].value;
          this.UserInfo.password = this.f['password'].value;
      
          this.ragistrationservice.generatetoken(this.UserInfo).subscribe(
            (response: any) => {
              console.log('Full response from token API:', response);
      
              // Save the token directly since it's a plain string
              if (response) {
                localStorage.setItem('authToken', response);
                alert('Login successful! Navigating to the flight page...');
                this.router.navigate(['/viewflightbyid']);
              } else {
                alert('Token not received from server.');
              }
            },
            (error) => {
              console.error('Error generating token:', error);
              alert('Login failed. Please check your credentials.');
            }
          );
        } else {
          alert('Please fill in all required fields.');
        }
      }     
}
