import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddairportComponent } from './addairport.component';

describe('AddairportComponent', () => {
  let component: AddairportComponent;
  let fixture: ComponentFixture<AddairportComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddairportComponent]
    });
    fixture = TestBed.createComponent(AddairportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
