import { Injectable } from '@angular/core';
import {Mensaje} from '../models/mensaje.model';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MensajeService {

  private apiUrl = 'http://localhost:8081/mensajes';

  constructor(private http: HttpClient) { }

  getAll(): Observable<Mensaje[]>{
    return this.http.get<Mensaje[]>(this.apiUrl);
  }

  getById(id: number): Observable<Mensaje>{
    return this.http.get<Mensaje>(`${this.apiUrl}/${id}`);
  }

  create(mensaje: Mensaje): Observable<Mensaje>{
    return this.http.post<Mensaje>(`${this.apiUrl}`, mensaje);
  }

  delete(id: number): Observable<void>{
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
