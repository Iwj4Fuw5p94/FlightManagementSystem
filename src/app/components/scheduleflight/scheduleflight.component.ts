import { Component } from '@angular/core';
import { Schedule } from 'src/app/model/shedule.model';
import { ScheduleflightService } from 'src/app/scheduleflight.service';

@Component({
  selector: 'app-scheduleflight',
  templateUrl: './scheduleflight.component.html',
  styleUrls: ['./scheduleflight.component.css']
})
export class ScheduleflightComponent {
  schedule: Schedule = new Schedule;
  constructor(private scheduleservice:ScheduleflightService){
  }
  // ngOnInit(){
  //   this.onsubmit();
  // }
  onsubmit(){
    return this.scheduleservice.addsheduleflight(this.schedule).subscribe(
      (data)=>{
        console.log(data);
        alert("successfully submitted")
      }
    )
  }

}
