import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { HabilidadServicio} from '../models/habilidad-servicio.model';

@Injectable({
  providedIn: 'root'
})
export class HabilidadServicioService {

  //URL de la API
  private apiUrl = 'http://localhost:8081/habilidades-servicios';

  //Inyectar el HttpClient para las peticiones HTTP
  constructor(private http: HttpClient) { }

  //Metodo para buscar todas las habilidades/servicios
  getAll(): Observable<HabilidadServicio[]>{
    return this.http.get<HabilidadServicio[]>(this.apiUrl);
  }

//Metodo para buscar una habilidad/servicio por ID
  getById(id: number): Observable<HabilidadServicio>{
    return this.http.get<HabilidadServicio>(`${this.apiUrl}/${id}`);
  }

//Metodo para crear una nueva habilidad/servicio
  create(habilidadServicio: HabilidadServicio): Observable<HabilidadServicio>{
    return this.http.post<HabilidadServicio>(this.apiUrl, habilidadServicio);
  }

//Metodo para deletar una habilidad/servicio por ID
  delete(id:number): Observable<void>{
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }

}


