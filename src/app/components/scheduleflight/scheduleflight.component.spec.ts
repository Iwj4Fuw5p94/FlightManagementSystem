import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ScheduleflightComponent } from './scheduleflight.component';

describe('ScheduleflightComponent', () => {
  let component: ScheduleflightComponent;
  let fixture: ComponentFixture<ScheduleflightComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ScheduleflightComponent]
    });
    fixture = TestBed.createComponent(ScheduleflightComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
