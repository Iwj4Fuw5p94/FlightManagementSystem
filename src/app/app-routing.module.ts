import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RagistrationComponent } from './ragistration/ragistration.component';
import { LoginComponent } from './login/login.component';
const routes: Routes = [
  {path:'ragistration',component:RagistrationComponent},
  {path:'login',component:LoginComponent}
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
