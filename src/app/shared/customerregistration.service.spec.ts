import { TestBed } from '@angular/core/testing';

import { CustomerregistrationService } from './customerregistration.service';

describe('CustomerregistrationService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CustomerregistrationService = TestBed.get(CustomerregistrationService);
    expect(service).toBeTruthy();
  });
});
