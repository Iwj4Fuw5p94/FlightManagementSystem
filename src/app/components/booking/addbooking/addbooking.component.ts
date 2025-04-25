import { Component } from '@angular/core';
import { BookingService } from 'src/app/booking.service';
import { booking } from 'src/app/model/booking.model';
import { user } from 'src/app/model/user.model';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-addbooking',
  templateUrl: './addbooking.component.html',
  styleUrls: ['./addbooking.component.css']
})
export class AddbookingComponent {
  booking: booking = {
    bookingId: 5,
    bookingDate: new Date(),
    ticketCost: 600,
    flight: null,
    noOfPassangers: 10,
    userId: undefined,
    passangerList: undefined,
    schedule:null
  };
  constructor(private bookingservice:BookingService){}

  addbooking(){
    return this .bookingservice.addbooking(this.booking).subscribe(
      data=>{
        console.log(data);
        alert("booking successfully done");
      }
      // error=>{
      //   alert("something went wrong");
      // }
    )
  }

}
