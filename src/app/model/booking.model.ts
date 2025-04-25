import { flight } from "./flight.model";
import { passanger } from "./passanger.model";
import { Schedule } from "./shedule.model";
import { user } from "./user.model";

export class booking {
    bookingId: number=0;
    userId: user | undefined;
    bookingDate!: Date; // Use string for dates in TypeScript
    passangerList: number[] | undefined;
    ticketCost: number=0;
    flight!: number | null;  // Allow null values
    noOfPassangers: number=0;
    schedule!: number | null;
}