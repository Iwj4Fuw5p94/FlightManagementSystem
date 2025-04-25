import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewscheduleflightComponent } from './viewscheduleflight.component';

describe('ViewscheduleflightComponent', () => {
  let component: ViewscheduleflightComponent;
  let fixture: ComponentFixture<ViewscheduleflightComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ViewscheduleflightComponent]
    });
    fixture = TestBed.createComponent(ViewscheduleflightComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
