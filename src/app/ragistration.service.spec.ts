import { TestBed } from '@angular/core/testing';

import { RagistrationService } from './ragistration.service';

describe('RagistrationService', () => {
  let service: RagistrationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RagistrationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
