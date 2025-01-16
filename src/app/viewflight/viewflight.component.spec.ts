import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewflightComponent } from './viewflight.component';

describe('ViewflightComponent', () => {
  let component: ViewflightComponent;
  let fixture: ComponentFixture<ViewflightComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ViewflightComponent]
    });
    fixture = TestBed.createComponent(ViewflightComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
