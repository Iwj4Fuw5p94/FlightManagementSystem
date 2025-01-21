import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewflightbyidComponent } from './viewflightbyid.component';

describe('ViewflightbyidComponent', () => {
  let component: ViewflightbyidComponent;
  let fixture: ComponentFixture<ViewflightbyidComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ViewflightbyidComponent]
    });
    fixture = TestBed.createComponent(ViewflightbyidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
