import {Component, OnInit} from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { HabilidadServicio} from '../../models/habilidad-servicio.model';
import {HabilidadServicioService} from '../../services/habilidad-servicio.service';

@Component({
  selector: 'app-habilidad-servicio-list',
  standalone: false,
  templateUrl: './habilidad-servicio-list.component.html',
  styleUrl: './habilidad-servicio-list.component.css'
})
export class HabilidadServicioListComponent implements OnInit{

  //Listado donde voy guardar los datos recibidos de la api
  habilidadesServicios: HabilidadServicio[] = []; //any porque no tengo definido el modelo

  //inyecto el HttpClient para poder hacer peticiones http
  constructor(private habilidadServicioService: HabilidadServicioService) {
  }

  //Metodo ejecutado automaticamente cuando el componente es inicializado
  ngOnInit() {
    this.obtenerHabilidadesServicios();
  }

  obtenerHabilidadesServicios(){
    this.habilidadServicioService.getAll().subscribe(data => {
        this.habilidadesServicios = data; //guardo los datos recibidos
      })
  }
}
