import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RemoveflightComponent } from './removeflight.component';

describe('RemoveflightComponent', () => {
  let component: RemoveflightComponent;
  let fixture: ComponentFixture<RemoveflightComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RemoveflightComponent]
    });
    fixture = TestBed.createComponent(RemoveflightComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
