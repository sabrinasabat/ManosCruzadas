import {Component, OnInit} from '@angular/core';
import {Subcategoria} from '../../models/subcategoria.model';
import {SubcategoriaService} from '../../services/subcategoria.service';

@Component({
  selector: 'app-subcategoria-list',
  standalone: false,
  templateUrl: './subcategoria-list.component.html',
  styleUrl: './subcategoria-list.component.css'
})
export class SubcategoriaListComponent implements OnInit{

  //Variable para almacenar los datos del backend
  subcategoria: Subcategoria[] = [];

  constructor(private subcategoriaService: SubcategoriaService) {
  }

  ngOnInit() { //Metodo que se ejecuta al iniciar el componente
    //Llamar al servicio para obtener las subcategorias
    this.subcategoriaService.getAll().subscribe(data => {
      this.subcategoria = data;
    })
  }
}
