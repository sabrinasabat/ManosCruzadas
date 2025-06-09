import {Component, OnInit} from '@angular/core';
import { UsuarioService } from '../../services/usuario.service';
import { Usuario } from '../../models/usuario.model';

@Component({
  selector: 'app-usuario-list',
  standalone: false,
  templateUrl: './usuario-list.component.html',
  styleUrl: './usuario-list.component.css'
})
export class UsuarioListComponent implements OnInit{

  //Variable para almacenar los datos del backend
  usuarios: Usuario[] = [];
  constructor(private usuarioService: UsuarioService) {
  }

  ngOnInit() { //Metodo que se ejecuta al iniciar el componente
    //Llamar al servicio para obtener los usuarios
    this.usuarioService.getAll().subscribe(data => {
      this.usuarios = data;
    })
  }

}
