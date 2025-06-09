import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SubcategoriaListComponent } from './subcategoria-list.component';

describe('SubcategoriaListComponent', () => {
  let component: SubcategoriaListComponent;
  let fixture: ComponentFixture<SubcategoriaListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SubcategoriaListComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SubcategoriaListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
