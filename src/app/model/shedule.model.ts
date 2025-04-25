import { airport } from "./airport.model";

export class Schedule {
    schedduleId: number | undefined;
    // sourceAirport: airport = new airport;
    sourceAirport: string = '';
    destinationAirport: string = '';
    // sourceAirport!: airport;
    // destinationAirport!: airport;
    arrivalTime: Date | undefined;
    departureTime: Date | undefined;
// airport: any;
}