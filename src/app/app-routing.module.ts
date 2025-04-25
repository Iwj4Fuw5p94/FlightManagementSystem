import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RagistrationComponent } from './ragistration/ragistration.component';
import { LoginComponent } from './login/login.component';
import { FlightComponent } from './flight/flight.component';
import { ViewflightComponent } from './viewflight/viewflight.component';
import { ViewflightbyidComponent } from './viewflightbyid/viewflightbyid.component';
import { AddflightComponent } from './addflight/addflight.component';
import { AddairportComponent } from './addairport/addairport.component';
import { ViewairportComponent } from './components/viewairport/viewairport.component';
import { UpdateflightComponent } from './components/updateflight/updateflight.component';
import { AdduserComponent } from './components/user/adduser/adduser.component';
import { DeleteuserComponent } from './components/user/deleteuser/deleteuser.component';
import { ViewallComponent } from './components/user/viewall/viewall.component';
import { AddbookingComponent } from './components/booking/addbooking/addbooking.component';
import { ScheduleflightComponent } from './components/scheduleflight/scheduleflight.component';
import { ViewscheduleflightComponent } from './components/viewscheduleflight/viewscheduleflight.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
const routes: Routes = [
  {path:'ragister',component:RagistrationComponent},
  {path:'login',component:LoginComponent},
  {path:'flight',component:FlightComponent},
  {path:'',component:DashboardComponent},
  {path:'viewflight',component:ViewflightComponent},
  {path:'viewflightbyid',component:ViewflightbyidComponent},
  {path:'addflight',component:FlightComponent},
  {path:'addairport',component:AddairportComponent},
  {path:'viewairport',component:ViewairportComponent},
  {path:'updateflight',component:UpdateflightComponent},
  {path:'adduser',component:AdduserComponent},
  {path:'deleteuser',component:DeleteuserComponent},
  {path:'viewalluser',component:ViewallComponent},
  {path:'addbooking',component:AddbookingComponent},
  {path:'scheduleflight',component:ScheduleflightComponent},
  {path:'viewcheduleflight',component:ViewscheduleflightComponent},
  {path:'dashboard',component:DashboardComponent}
  
  // {path:'',redirectTo:'login',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
