import { Subcategoria } from './subcategoria.model';
import {TestBed} from '@angular/core/testing';

describe('Subcategoria', () => {
  let subcategoria: Subcategoria;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    subcategoria = TestBed.inject(Subcategoria);
  })

  it('should create an instance', () => {
    expect(Subcategoria).toBeTruthy();
  });
});
