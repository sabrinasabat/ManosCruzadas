import {Component, OnInit} from '@angular/core';
import {Categoria} from '../../models/categoria.model';
import {CategoriaService} from '../../services/categoria.service';

@Component({
  selector: 'app-categoria-list',
  standalone: false,
  templateUrl: './categoria-list.component.html',
  styleUrl: './categoria-list.component.css'
})
export class CategoriaListComponent implements OnInit{

  categorias: Categoria[] = []; // Array para almacenar las categorías

  constructor(private categoriaService: CategoriaService) {
    // Inyecto el servicio CategoriaService para poder hacer las peticiones HTTP
  }

  ngOnInit() {
    this.categoriaService.getAll().subscribe(data => {
      this.categorias = data;
    });
  }
}
