import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HabilidadServicioListComponent } from './habilidad-servicio-list.component';

describe('HabilidadServicioListComponent', () => {
  let component: HabilidadServicioListComponent;
  let fixture: ComponentFixture<HabilidadServicioListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [HabilidadServicioListComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HabilidadServicioListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
