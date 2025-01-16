import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RagistrationComponent } from './ragistration/ragistration.component';
import { LoginComponent } from './login/login.component';
import { FlightComponent } from './flight/flight.component';
const routes: Routes = [
  {path:'ragister',component:RagistrationComponent},
  {path:'login',component:LoginComponent},
  {path:'flight',component:FlightComponent},
  {path:'**',component:LoginComponent}
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
