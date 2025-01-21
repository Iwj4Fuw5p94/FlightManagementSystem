import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RagistrationComponent } from './ragistration/ragistration.component';
import { LoginComponent } from './login/login.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AddairportComponent } from './addairport/addairport.component';
import { FlightComponent } from './flight/flight.component';
import { ViewflightComponent } from './viewflight/viewflight.component';
import { ViewflightbyidComponent } from './viewflightbyid/viewflightbyid.component';
@NgModule({
  declarations: [
    AppComponent,
    RagistrationComponent,
    LoginComponent,
    AddairportComponent,
    FlightComponent,
    ViewflightComponent,
    ViewflightbyidComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
