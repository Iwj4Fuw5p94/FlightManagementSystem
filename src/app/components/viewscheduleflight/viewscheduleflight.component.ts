import { Component } from '@angular/core';
import { Schedule } from 'src/app/model/shedule.model';
import { ScheduleflightService } from 'src/app/scheduleflight.service';

@Component({
  selector: 'app-viewscheduleflight',
  templateUrl: './viewscheduleflight.component.html',
  styleUrls: ['./viewscheduleflight.component.css']
})
export class ViewscheduleflightComponent {

  schedule!:any;
  flightNumber:any;
  constructor(private scheduleflightservice:ScheduleflightService) { }

  viewscheduleflight(){
    this.scheduleflightservice.viewscheduleflight().subscribe((data)=>{
      // this.schedule=data;
      this.schedule=data;
      alert("you can view the data ");
      console.log(data);
    })
  }
  viewscheduleflightbyflightnumber(){
    this.scheduleflightservice.viewscheduleflightbyflightnumber(this.flightNumber).subscribe((data)=>{
      // this.schedule=data;
      this.schedule=data;
      alert("you can view the data ");
      console.log(data);
    })
  }



}
