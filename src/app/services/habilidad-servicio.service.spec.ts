import { TestBed } from '@angular/core/testing';

import { HabilidadServicioService } from './habilidad-servicio.service';

describe('HabilidadServicioService', () => {
  let service: HabilidadServicioService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HabilidadServicioService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
