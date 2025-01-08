import { Component } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  loginformgroup!: FormGroup;
  
    email: string = 'ap@gmail.com';
    password: string = '123';
  
    constructor(private formbuilder: FormBuilder, private route: Router) {
    }
  
    ngOnInit() {
      this.createloginform();
    }
    createloginform() {
      this.loginformgroup = this.formbuilder.group({
        email: ['', Validators.required],
        password: ['', Validators.required]
      })
    }
    onsubmit() {
      if (this.loginformgroup.invalid) {
        alert("some fild are mising");
      }
      else{
        const enteremail=this.loginformgroup.value.email;
        const enterpassword=this.loginformgroup.value.password;
        if(enteremail==this.email && enterpassword==this.password){
        alert("you are ready to login");
        console.log(this.loginformgroup.value);
        this.route.navigate(['/dashboard']);
      }
      else{
        alert("invalid email and password")
      }
    }
  }

}
