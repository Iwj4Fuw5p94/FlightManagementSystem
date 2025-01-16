import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateairportComponent } from './updateairport.component';

describe('UpdateairportComponent', () => {
  let component: UpdateairportComponent;
  let fixture: ComponentFixture<UpdateairportComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UpdateairportComponent]
    });
    fixture = TestBed.createComponent(UpdateairportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
